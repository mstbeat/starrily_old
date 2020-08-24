package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
*
* ユーザー登録完了画面のコントローラーです。
*
* @author s.kikuchi
*
*/
@Controller
public class UserRegistrationCompletionController {

	/**
	 *
	 * ユーザー登録確認画面にて確定ボタンが押下された際に登録処理をするメソッドです。
	 *
	 * @return ユーザー登録完了画面を返します。
	 */
	@PostMapping("/user_registration_completion")
	public String userRegistrationCompletion() {
		return "/user_registration_completion";
	}

}
