package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 新規案件追加クラス
 *
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Controller
public class SkillsheetProjectRegistrationController {

	//スキルシート参照画面の案件追加ボタンを押した時の処理
	/**
	 * 新規案件追加画面を表示
	 * @return 新規案件追加画面に返す。
	 */
	@PostMapping("/skillsheet_project_registration")
	public String projectAdd() {

		return "skillsheet_project_registration";
	}

}
