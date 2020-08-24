package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ログイン画面のコントローラー
 *
 * @author PDA s.lee
 *
 */
@Controller
public class LoginController {

	/**
	 * 最初に接続、ログアウトするときに処理するメソッド
	 *
	 * @return  ログイン画面へ遷移する。
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
