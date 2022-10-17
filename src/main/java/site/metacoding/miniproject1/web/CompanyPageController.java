package site.metacoding.miniproject1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.CompanysService;

@RequiredArgsConstructor
@Controller
public class CompanyPageController {
	private final CompanysService companysService;
	
	@GetMapping("/company/detail")
	public String detailPage() {
		return "companys/company-detail";
	}
}
