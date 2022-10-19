package site.metacoding.miniproject1.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.WantedsService;
import site.metacoding.miniproject1.web.dto.response.CMRespDto;
import site.metacoding.miniproject1.web.dto.response.codes.AllCodesDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.AllWantedsListDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.KeywordDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.PagingWantedsListDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedDetailDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@RequiredArgsConstructor
@Controller
public class WantedsPageController {
	private final WantedsService wantedsService;
	private final HttpSession session;

	
	@GetMapping("/api/wanteds")
	public @ResponseBody CMRespDto<?> wantedsPageApi(Model model, KeywordDto keywordDto) {
		Integer userId = 1; //세션

		// 세션에서 유저의 id 혹은 user_id 가져와서 입력하기
		// 로그인체크해서 할필요 없으면 넘겨버리기
		List<WantedsListDto> wantedsListDtos = wantedsService.findByLike(userId);
		PagingWantedsListDto pagingWantedsListDto = wantedsService.pagingWantedsList(keywordDto);		
		AllCodesDto allCodesDto = wantedsService.findAllCodes();

		AllWantedsListDto allWantedListDto = new AllWantedsListDto(wantedsListDtos, pagingWantedsListDto, allCodesDto);
		return new CMRespDto<>(1, "성공", allWantedListDto);
	}

	@GetMapping("/wanteds")
	public String wantedsPage(Model model, KeywordDto keywordDto) {
		Integer userId = 1;

		// 세션에서 유저의 id 혹은 user_id 가져와서 입력하기
		// 로그인체크해서 할필요 없으면 넘겨버리기
		List<WantedsListDto> wantedsLikeListDtos = wantedsService.findByLike(userId);
		PagingWantedsListDto pagingWantedsListDto = wantedsService.pagingWantedsList(keywordDto);		
		AllCodesDto allCodesDto = wantedsService.findAllCodes();

		AllWantedsListDto allWantedListDto = new AllWantedsListDto(wantedsLikeListDtos, pagingWantedsListDto, allCodesDto);
		model.addAttribute("allWantedListDto", allWantedListDto);
		return "wanteds/wanted";
	}
	
	@GetMapping("/wanteds/{id}")
	public String wantedsDetailPage(Model model, @PathVariable Integer id) {
		WantedDetailDto wantedDetailDtoPS = wantedsService.findByIdToDetail(id);
		List<WantedsListDto> wantedsListDtosPS = wantedsService.findAllByposition(wantedDetailDtoPS.getPositionCodeId());
		model.addAttribute("wantedDetail", wantedDetailDtoPS);
		model.addAttribute("wantedsList", wantedsListDtosPS);
		return "wanteds/wanted-detail";
	}
}