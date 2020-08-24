package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
/**
 * パスワード変更画面のコントローラー
 *
 * @author PDA s.lee
 *
 */
@Controller
public class IndividualPasswordController {
	/**
	 * ヘッダーのその他からパスワード変更を押下するときに処理するメソッド
	 *
	 * @return  パスワード変更画面へ遷移する。
	 */
	@PostMapping("/individual_password")
	public String individualPassword() {
		return "individual_password";
	}
}
