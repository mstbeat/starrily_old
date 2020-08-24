package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
/**
 * パスワード問い合わせ確認画面のコントローラー
 *
 * @author PDA s.lee
 *
 */
@Controller
public class LoginPassComController {
	/**
	 * パスワード問い合わせからメールアドレスを入力して送信ボタンを押下るときに処理するメソッド
	 *
	 * @return  パスワード問い合わせ画面確認へ遷移する。
	 */
	@PostMapping("login_pass_com")
	public String loginPassCom() {
		return "login_pass_com";
	}
}
