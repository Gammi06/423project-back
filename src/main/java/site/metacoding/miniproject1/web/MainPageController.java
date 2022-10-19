package site.metacoding.miniproject1.web;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.WantedsService;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@RequiredArgsConstructor
@Controller
public class MainPageController {
	
	private final HttpSession session;
	private final WantedsService wantedsService;
	
	@GetMapping({"/", "/main"})
	public String mainPage(Model model, Integer positionCodeId) {		
		WantedsListDto wanteds = wantedsService.findBestHot();
		
		// 로그인 체크
		// 미로그인시 가장 핫한 공고리스트
		// + 로그인 했더라도 유저의 포지션값이 null일 경우 보여주는 공고 리스트
		//List<WantedsListDto> wantedsList = wantedsService.findAllHot();

		// 로그인한 유저의 설정된 포지션값 체크하기
		positionCodeId = 0;	//테스트용
		// 로그인시 설정된 포지션 중 가장 핫한 공고 리스트
		List<WantedsListDto> wantedsList = wantedsService.findAllByPosition(positionCodeId);
		if(wantedsList == null) {
			wantedsList = wantedsService.findAllHot();
		}
		
		model.addAttribute("wantedsList", wantedsList);
		model.addAttribute("wanteds", wanteds);
		return "all/main";
	}
}
