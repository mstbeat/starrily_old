package starrily.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import starrily.bean.Dropdown;
import starrily.bean.SkillSheet;
import starrily.service.StarrilyService;

/**
 * 基本情報更新クラス
 *
 * @author yu.yamamoto
 * @version 1.0.0
 */
@Controller
public class SkillsheetInformationUpdateController {

	/** StarrilyServiceクラスの中のメソッドを呼び出せるようにする. */
	@Autowired
	private StarrilyService starrilyService;

	/** メッセージソース */
	@Autowired
	private MessageSource messageSource;

	MessageSourceResolvable PADCH028 = new DefaultMessageSourceResolvable("PADCH028");

	/**
	 ** 基本情報更新画面を表示
	 * @return　基本情報更新画面に返す。
	 */
	@PostMapping("/skillsheet_information_update")
	public String basicInformation(Model model, @RequestParam(name = "userId") int userId) {

		SkillSheet skillSheetBasicList = starrilyService.getSkillSheetBase(userId);
		model.addAttribute("skillSheet", skillSheetBasicList);

		List<Dropdown> dropdownInfo = starrilyService.getDropdownInfo(6);
		model.addAttribute("dropdownInfo", dropdownInfo);

		return "skillsheet_information_update";
	}

	/**
	 ** 基本情報更新画面の更新処理
	 * @return スキルシート参照画面に返す。
	 */
	@PutMapping("/skillsheet_information_update")
	public String update(@ModelAttribute @Valid SkillSheet Skillsheet,
			BindingResult bindingResult,
			Model model,
			RedirectAttributes redirectAttribute,
			Locale locale,
			String message) {

		if (message != null) {
			model.addAttribute("message", message);
		}
		if (bindingResult.hasErrors()) {
			model.addAttribute("skillSheet", Skillsheet);
			List<Dropdown> dropdownInfo = starrilyService.getDropdownInfo(6);
			model.addAttribute("dropdownInfo", dropdownInfo);
			return "skillsheet_information_update";
		}

		Integer count = starrilyService.updateBasicInformation(Skillsheet);
		if (count == 0) {
			redirectAttribute.addFlashAttribute("message",
					messageSource.getMessage("EMSG203", new MessageSourceResolvable[] { PADCH028 }, locale));
			return "redirect:skillsheet_reference";
		} else {
			redirectAttribute.addFlashAttribute("message",
					messageSource.getMessage("IMSG201", new MessageSourceResolvable[] { PADCH028 }, locale));
		}

		return "redirect:skillsheet_reference";
	}

}
