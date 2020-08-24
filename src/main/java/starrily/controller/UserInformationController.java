package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
*
* ユーザー情報変更画面のコントローラーです。
*
* @author s.kikuchi
*
*/
@Controller
public class UserInformationController {

	/**
	 *
	 * ユーザー管理画面にてユーザー情報変更ボタンが押下された際に遷移処理をするメソッドです。
	 *
	 * @return ユーザー情報変更画面を返します。
	 */
	@PostMapping("/user_information")
	public String userInformation() {
		return "/user_information";
	}

}
