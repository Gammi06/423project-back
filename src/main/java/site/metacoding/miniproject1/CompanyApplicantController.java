package site.metacoding.miniproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.companys.CompanysDao;
import site.metacoding.miniproject1.domain.resumes.ResumesDao;

@RequiredArgsConstructor
@Controller
public class CompanyApplicantController {
	
	private final ResumesDao resumesDao;
	private final CompanysDao companysDao;
	
	@GetMapping("/company/applicant")
	public String 지원자바로가기페이지() {
		return "/company/company_applicant";
	}
	
}
