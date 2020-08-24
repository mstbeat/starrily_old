package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
*
* ユーザー登録画面のコントローラーです。
*
* @author s.kikuchi
*
*/
@Controller
public class UserRegistrationController {

	/**
	 *
	 * ユーザー管理画面にて新規登録ボタンが押下された際に画面遷移処理をするメソッドです。
	 *
	 * @return ユーザー登録画面を返します。
	 */
	@PostMapping("/user_registration")
	public String userRegistration() {
		return "/user_registration";
	}

}
