package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
*
* ユーザー情報変更完了画面のコントローラーです。
*
* @author s.kikuchi
*
*/
@Controller
public class UserInformationCompletionController {


	/**
	 *
	 * ユーザー情報変更確認画面にて確定ボタンが押下された際に更新処理をするメソッドです。
	 *
	 * @return ユーザー情報変更完了画面を返します。
	 */
	@PostMapping("/user_information_completion")
	public String userInformationCompletion() {
		return "/user_information_completion";
	}

}
