package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
/**
 * パスワード問い合わせ画面のコントローラー
 *
 * @author PDA s.lee
 *
 */
@Controller
public class LoginPassController {
	/**
	 * ログイン画面からパスワード問い合わせを押下するときに処理するメソッド
	 *
	 * @return  パスワード問い合わせ画面へ遷移する。
	 */
	@PostMapping("login_pass")
	public String loginPass() {
		return "login_pass";
	}
}
