package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * スキルシート参照クラス
 *
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Controller
public class SkillsheetReferenceController {

	/**
	 *　スキルシート参照画面を表示
	 * @return　スキルシート参照に返す。
	 */
	@PostMapping("/skillsheet_reference")
	public String skillReference() {

		return "skillsheet_reference";
	}

	/**
	 * 案件削除を行う
	 * @return　スキルシート参照に返す。
	 */
	@DeleteMapping("/skillsheet_reference")
	public String skillsheetDelete() {

		return "skillsheet_reference";
	}

}
