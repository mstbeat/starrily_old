package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
*
* ユーザー登録確認画面のコントローラーです。
*
* @author s.kikuchi
*
*/
@Controller
public class UserRegistrationConfirmationController {

	/**
	 *
	 * ユーザー登録画面にて確認ボタンが押下された際に画面遷移を行うメソッドです。
	 *
	 * @return ユーザー登録確認画面を返します。
	 */
	@PostMapping("/user_registration_confirmation")
	public String userRegistrationConfirmation() {
		return "/user_registration_confirmation";
	}

}
