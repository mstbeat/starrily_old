package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * エンジニア検索画面のコントローラー
 *
 * @author PDA s.lee
 *
 */
@Controller
public class EngineerSearchController {
	/**
	 * ヘッダーのエンジニア検索ボタンを押下するときに処理するメソッド
	 *
	 * @return  エンジニア検索画面へ遷移する。
	 */
	@GetMapping("engineer_search")
	public String engineerSearchG() {
		return "engineer_search";

	}

	/**
	 * ログインが成功したときに処理するメソッド
	 *
	 * @return  エンジニア検索画面へ遷移する。
	 */
	@PostMapping("engineer_search")
		public String engineerSearchP() {
			return "engineer_search";
	}

}
