package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * ユーザー情報変更確認画面のコントローラーです。
 *
 * @author s.kikuchi
 *
 */
@Controller
public class UserInformationConfirmationController {

	/**
	 *
	 * ユーザー情報変更画面にて確認ボタンが押下された際に遷移処理をするメソッドです。
	 *
	 * @return ユーザー情報変更確認画面を返します。
	 */
	@PostMapping("/user_information_confirmation")
	public String userInformationConfirmation() {
		return "/user_information_confirmation";
	}

}
