package starrily.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import starrily.bean.SkillSheet;
import starrily.skillsheet_download.OrderReportPdf;

/**
 * スキルシートダウンロードクラス
 *
 * @author yamamoto
 * @version 1.0.0
 *
 */
@Controller
public class SkillsheetDownloadController {

	//スキルシート参照画面のダウンロードボタンを押した時の処理
	/**
	 * スキルシートダウンロード画面を表示
	 * @return スキルシートダウンロード画面に返す。
	 */
	@PostMapping("/skillsheet_download")
	public String skillsheetDownload() {

		return "skillsheet_download";
	}

	/**
	 * フルネームPDFダウンロード処理
	 *
	 * @author kikuchi
	 * @param response リクエストヘッダ情報
	 * @throws FileNotFoundException ファイルが見つからない場合の例外
	 * @throws IOException 出力処理に関わる例外
	 * @throws JRException 帳票定義体に関わる例外
	 */
	@PostMapping("/fullname_pdf_download")
	public void fullNamePdfExport(HttpServletResponse response)
			throws FileNotFoundException, IOException, JRException {

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("Title", "職務・技術経歴書");

		//List<SkillSheet> fields = starrilyService.searchProjectDB();
		List<SkillSheet> fields = new ArrayList<SkillSheet>();
		/**
		 * ここにデータ取得処理を書く
		 */

		OrderReportPdf order = new OrderReportPdf();
		byte[] output = order.orderReportPdf(params, fields);

		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("菊池祥太目黒駅.pdf", "UTF-8"));
		response.setContentLength(output.length);

		OutputStream os = null;
		os = response.getOutputStream();
		os.write(output);
		os.flush();
		os.close();

	}

	/**
	 * フルネームExcelダウンロード処理
	 *
	 * @author kikuchi
	 * @param response リクエストヘッダ情報
	 * @throws JRException 帳票定義体に関わる例外
	 * @throws IOException 出力処理に関わる例外
	 */
	@PostMapping("/fullname_excel_download")
	public void fullNameExcelExport(HttpServletResponse response) throws JRException, IOException {

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("Title", "職務・技術経歴書");

		//List<SkillSheet> fields = starrilyService.searchProjectDB();
		List<SkillSheet> fields = new ArrayList<SkillSheet>();
		/**
		 * ここにデータ取得処理を書く
		 */

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(fields);

		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("菊池祥太目黒駅.xlsx", "UTF-8"));
		response.setCharacterEncoding("UTF-8");

		File jrxmlFile = new File("src/main/resources/reports/skillsheet_download.jrxml");
		InputStream input = new FileInputStream(jrxmlFile);
		JasperReport jasperReport = JasperCompileManager.compileReport(input);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);

		//エクセルの各種設定はここで行います。
		SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
		configuration.setOnePagePerSheet(true);
		configuration.setDetectCellType(true);

		OutputStream os = null;
		os = response.getOutputStream();

		JRXlsxExporter exporter = new JRXlsxExporter();
		exporter.setConfiguration(configuration);
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(os));
		exporter.exportReport();
		os.flush();
		os.close();

	}

	/**
	 * イニシャルPDFダウンロード処理
	 *
	 * @author kikuchi
	 * @param response リクエストヘッダ情報
	 * @throws FileNotFoundException ファイルが見つからない場合の例外
	 * @throws IOException 出力処理に関わる例外
	 * @throws JRException 帳票定義体に関わる例外
	 */
	@PostMapping("/initial_pdf_download")
	public void initialPdfExport(HttpServletResponse response)
			throws FileNotFoundException, IOException, JRException {

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("Title", "職務・技術経歴書");

		//List<SkillSheet> fields = starrilyService.searchProjectDB();
		List<SkillSheet> fields = new ArrayList<SkillSheet>();
		/**
		 * ここにデータ取得処理を書く
		 */

		OrderReportPdf order = new OrderReportPdf();
		byte[] output = order.orderReportPdf(params, fields);

		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("S.K目黒駅.pdf", "UTF-8"));
		response.setContentLength(output.length);

		OutputStream os = null;
		os = response.getOutputStream();
		os.write(output);
		os.flush();
		os.close();

	}

	/**
	 * イニシャルExcelダウンロード処理
	 *
	 * @author kikuchi
	 * @param response リクエストヘッダ情報
	 * @throws JRException 帳票定義体に関わる例外
	 * @throws IOException 出力処理に関わる例外
	 */
	@PostMapping("/initial_excel_download")
	public void initialExcelExport(HttpServletResponse response) throws JRException, IOException {

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("Title", "職務・技術経歴書");

		//List<SkillSheet> fields = starrilyService.searchProjectDB();
		List<SkillSheet> fields = new ArrayList<SkillSheet>();
		/**
		 * ここにデータ取得処理を書く
		 */

		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(fields);

		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("S.K目黒駅.xlsx", "UTF-8"));
		response.setCharacterEncoding("UTF-8");

		File jrxmlFile = new File("src/main/resources/reports/skillsheet_download.jrxml");
		InputStream input = new FileInputStream(jrxmlFile);
		JasperReport jasperReport = JasperCompileManager.compileReport(input);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);

		//エクセルの各種設定はここで行います。
		SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
		configuration.setOnePagePerSheet(true);
		configuration.setDetectCellType(true);

		OutputStream os = null;
		os = response.getOutputStream();

		JRXlsxExporter exporter = new JRXlsxExporter();
		exporter.setConfiguration(configuration);
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(os));
		exporter.exportReport();
		os.flush();
		os.close();

	}

}
