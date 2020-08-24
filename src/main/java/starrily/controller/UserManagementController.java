package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
*
* ユーザー管理画面のコントローラーです。
*
* @author s.kikuchi
*
*/
@Controller
public class UserManagementController {

	/**
	 *
	 * ユーザー管理画面へ遷移処理をするメソッドです。
	 *
	 * @return ユーザー管理画面を返します。
	 */
	@PostMapping("/user_management")
	public String userManagementPost() {
		return "/user_management";
	}

	/**
	 *
	 * キーワード検索にて検索ボタンが押下された際にユーザー検索をするメソッドです。
	 *
	 * @return ユーザー管理画面を返します。
	 */
	@PutMapping("/user_management")
	public String userManagementPut() {
		return "/user_management";
	}

	/**
	 *
	 * 検索結果にあるユーザーを削除するメソッドです。
	 *
	 * @return ユーザー管理画面を返します。
	 */
	@DeleteMapping("/user_management")
	public String userManagementDelete() {
		return "/user_management";
	}

}
