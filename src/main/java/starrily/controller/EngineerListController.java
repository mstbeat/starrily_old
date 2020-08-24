package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * エンジニア一覧画面のコントローラー
 *
 * @author PDA s.lee
 *
 */
@Controller
public class EngineerListController {
	/**
	 * 検索ボタンを押下するときに処理するメソッド
	 *
	 * @return  エンジニア一覧画面へ遷移する。
	 */
	@PostMapping("engineer_list")
	public String engineerList() {
		return "engineer_list";
	}
}
