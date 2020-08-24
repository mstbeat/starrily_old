package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ユーザーパスワード変更完了クラス
 *
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Controller
public class UserPasswordCompletedController {

	/*
	 *　ユーザーパスワード変更完了画面を表示
	 * @return　ユーザーパスワード変更完了画面に返す。
	 */
	@PostMapping("/user_password_completed")
	public String passwordChange() {

		return "user_password_completed";
	}
}
