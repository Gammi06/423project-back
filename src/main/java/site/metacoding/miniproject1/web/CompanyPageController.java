package site.metacoding.miniproject1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.CompanysService;
import site.metacoding.miniproject1.web.dto.response.companys.CompanyDetailDto;

@RequiredArgsConstructor
@Controller
public class CompanyPageController {
	private final CompanysService companysService;

	@GetMapping("/company/detail/{id}")
	public String detailPage(Model model, @PathVariable Integer id) {
		CompanyDetailDto companyDetailDtoPS = companysService.findByIdToDetail(id);
		model.addAttribute("companyDetail", companyDetailDtoPS);
		return "companys/company-detail";
	}
}
