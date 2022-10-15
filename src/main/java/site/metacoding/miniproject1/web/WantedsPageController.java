package site.metacoding.miniproject1.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.WantedsService;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@RequiredArgsConstructor
@Controller
public class WantedsPageController {
	private final WantedsService wantedsService;
	
	@GetMapping("/wanteds")
	public String wantedsPage(Model model, Integer userId) {
		// 세션에서 유저의 id 혹은 user_id 가져와서 입력하기
		// 로그인체크해서 할필요 없으면 넘겨버리기
		List<WantedsListDto> wantedsLikeList = wantedsService.findByLike(1);
		model.addAttribute("wantedsLikeList", wantedsLikeList);

		List<WantedsListDto> wantedsAllList = wantedsService.findAllByDate();
		model.addAttribute("wantedsAllList", wantedsAllList);
		return "wanteds/wanted";
	}
}