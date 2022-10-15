package site.metacoding.miniproject1.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.WantedsService;
import site.metacoding.miniproject1.web.dto.response.codes.AllCodesDto;
import site.metacoding.miniproject1.web.dto.response.codes.CareersCodeDto;
import site.metacoding.miniproject1.web.dto.response.codes.PositionsCodeDto;
import site.metacoding.miniproject1.web.dto.response.codes.RegionsCodeDto;
import site.metacoding.miniproject1.web.dto.response.codes.SkillsCodeDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.PagingDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.PagingWantedsListDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@RequiredArgsConstructor
@Controller
public class WantedsPageController {
	private final WantedsService wantedsService;
	
	@GetMapping("/wanteds")
	public String wantedsPage(Model model, Integer userId, Integer page, Integer state) {
		// 세션에서 유저의 id 혹은 user_id 가져와서 입력하기
		// 로그인체크해서 할필요 없으면 넘겨버리기
		List<WantedsListDto> wantedsLikeList = wantedsService.findByLike(1);
		PagingWantedsListDto pagingWantedsListPS = wantedsService.pagingWantedsList(page, state);		
		AllCodesDto allCodesPS = wantedsService.findAllCodes();
		
		model.addAttribute("wantedsLikeList", wantedsLikeList);
		model.addAttribute("pagingWantedsList", pagingWantedsListPS);
		model.addAttribute("allCodes", allCodesPS);
		
		return "wanteds/wanted";
	}
}