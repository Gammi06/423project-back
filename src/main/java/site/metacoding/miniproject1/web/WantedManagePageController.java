package site.metacoding.miniproject1.web;


import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.ApplyManageService;
import site.metacoding.miniproject1.service.WantedsService;
import site.metacoding.miniproject1.web.dto.response.WantedsManageDto;

@RequiredArgsConstructor
@Controller
public class WantedManagePageController {
	
	private final HttpSession session;
	private final ApplyManageService applyManageService;
	
	@GetMapping("/companys/manage/{id}")
	public String wantedManagePage(Model model, Integer id) {
		List<WantedsManageDto> wanteds = applyManageService.findAllWanteds(id);
		
		model.addAttribute("wanteds", wanteds);
		return "companysmanage/wantedAll";
	}
}
