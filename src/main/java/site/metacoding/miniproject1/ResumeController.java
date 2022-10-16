package site.metacoding.miniproject1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.ResumeService;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeListDto;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeUpdateDto;

@RequiredArgsConstructor
@Controller
public class ResumeController {

	private final ResumeService resumeService;

	@GetMapping("/resume/{id}")
	public String 이력서작성(@PathVariable Integer id, Model model) {
		ResumeUpdateDto resumeUpdateDtoPS = resumeService.findById(id);
		model.addAttribute("resumeUpdateDtoPS", resumeUpdateDtoPS);
		return "/resume/resume_update";
	}

	@GetMapping("/resume")
	public String 이력서메인() {
		return "/resume/resume_main";
	}

	@GetMapping("/resume/update")
	public String 이력서작성페이지() {
		return "/resume/resume_update";
	}
	
	@GetMapping("/resume/list")
	public String 이력서관리페이지() {
		return "/resume/resume_list";
	}
	
	@GetMapping("/resume/list/{id}")
	public String 이력서관리(@PathVariable Integer id, Model model) {
		ResumeListDto resumeListDtoPS = resumeService.findByUserId(id);
		model.addAttribute("resumeListDtoPS", resumeListDtoPS);
		return "/resume/resume_list";
	}

}
