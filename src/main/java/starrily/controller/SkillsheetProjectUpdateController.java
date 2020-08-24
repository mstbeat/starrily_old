package starrily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 新規案件追加クラス
 *
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Controller
public class SkillsheetProjectUpdateController {

	// 今はPostMappingになっているがPutMappingに変更→putは更新のため
	/**
	 * 案件更新画面を表示
	 * @return　更新情報画面に返す。
	 */
	@PostMapping("/skillsheet_project_update")
	public String skillsheetUpdate() {

		return "skillsheet_project_update";
	}

}
