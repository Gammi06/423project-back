package site.metacoding.miniproject1.web;


import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.RecruitManageService;
import site.metacoding.miniproject1.web.dto.response.codes.AllCodesDto;
import site.metacoding.miniproject1.web.dto.response.companys.PagingWantedsManageDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsManageDto;

@RequiredArgsConstructor
@Controller
public class WantedManagePageController {
	
	private final HttpSession session;
	private final RecruitManageService recruitManageService;
	
	@GetMapping("/companys/manage/{id}")
	public String wantedManagePage(Model model, Integer page, @PathVariable Integer id) {
		List<WantedsManageDto> wanteds = recruitManageService.findAllWanteds(id);
		PagingWantedsManageDto pagingWantedsManagePS = recruitManageService.pagingWantedsManage(page, id);
		AllCodesDto allCodesPS = recruitManageService.findAllCodes();
		
		model.addAttribute("wanteds", wanteds);
		model.addAttribute("allCodes", allCodesPS);
		model.addAttribute("pagingWantedsManage", pagingWantedsManagePS);
		return "companysmanage/wantedAll";
	}
}
