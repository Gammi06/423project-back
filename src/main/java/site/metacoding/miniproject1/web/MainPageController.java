package site.metacoding.miniproject1.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.WantedsService;
import site.metacoding.miniproject1.web.dto.response.WantedsListDto;

@RequiredArgsConstructor
@Controller
//@RestController
public class MainPageController {
	
	private final HttpSession session;
	private final WantedsService wantedsService;
	
	@GetMapping({"/", "/main"})
	public String mainPage(Model model) {
		WantedsListDto wanteds = wantedsService.findBestHot();
		
		// 로그인 체크
		List<WantedsListDto> wantedsList = wantedsService.findAllHot();

		model.addAttribute("wantedsList", wantedsList);
		model.addAttribute("wanteds", wanteds);
		return "all/main";
	}
}
