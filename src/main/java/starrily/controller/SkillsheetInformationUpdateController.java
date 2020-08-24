package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 基本情報更新クラス
 *
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Controller
public class SkillsheetInformationUpdateController {

	//スキルシート参照画面の基本情報更新ボタンを押した時の処理
	/**
	 ** 基本情報更新画面を表示
	 * @return　基本情報更新画面に返す。
	 */
	@PostMapping("/skillsheet_information_update")
	public String basicInformation() {

		return "skillsheet_information_update";
	}

}
