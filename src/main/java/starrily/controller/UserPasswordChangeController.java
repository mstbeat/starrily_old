package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ユーザーパスワード変更クラス
 *
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Controller
public class UserPasswordChangeController {

	/**
	 * ユーザーパスワード変更画面を表示
	 * @return ユーザーパスワード変更画面に返す。
	 */
	@PostMapping("/user_password_change")
	public String passwordChange() {

		return "user_password_change";
	}

}
