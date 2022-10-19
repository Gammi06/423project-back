package site.metacoding.miniproject1.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.users.Users;
import site.metacoding.miniproject1.service.UsersService;
import site.metacoding.miniproject1.service.WantedsService;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@RequiredArgsConstructor
@Controller
public class MainPageController {
	
	private final HttpSession session;
	private final HttpServletRequest request;
	private final WantedsService wantedsService;
	private final UsersService usersService;
	
	@GetMapping({"/", "/main"})
	public String mainPage(Model model) {		
		WantedsListDto wanteds = wantedsService.findBestHot();
		List<WantedsListDto> wantedsList = new ArrayList<>();

		Users principal = (Users) session.getAttribute("principal");

		// 로그인 체크
		if(principal == null){
			wantedsList = wantedsService.findAllHot();
		} else {
			wantedsList = wantedsService.findAllByposition(principal.getPositionCodeId());
			if(wantedsList == null) {
				wantedsList = wantedsService.findAllHot();
			}	
		}
		model.addAttribute("wantedsList", wantedsList);
		model.addAttribute("wanteds", wanteds);
		return "all/main";
	}
}
