package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

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

}
