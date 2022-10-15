package site.metacoding.miniproject1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.ResumeService;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeUpdateDto;

@RequiredArgsConstructor
@Controller
public class ResumeController {

	private final ResumeService resumeService;

	@GetMapping("/resume/{id}")
	public String 이력서작성(@PathVariable Integer id, Model model) {
		ResumeUpdateDto resumeUpdateDtoPS = resumeService.findById(id);
		model.addAttribute("resumeUpdateDtoPS", resumeUpdateDtoPS);
		return "resume/resume_update";
	}

	@GetMapping("/resume")
	public String 이력서메인() {
		return "resume/resume_main";
	}

	@GetMapping("/resume_update")
	public String 이력서작성체이지() {
		return "resume/resume_update";
	}

}
