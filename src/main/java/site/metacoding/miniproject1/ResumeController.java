package site.metacoding.miniproject1;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.resumes.Resumes;
import site.metacoding.miniproject1.domain.resumes.ResumesDao;
import site.metacoding.miniproject1.domain.users.UsersDao;
import site.metacoding.miniproject1.service.ResumeService;
import site.metacoding.miniproject1.web.dto.CMRespDto;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeListDto;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeUpdateDto;

@RequiredArgsConstructor
@Controller
public class ResumeController {

	private final ResumeService resumeService;
	private final ResumesDao resumesDao;
	private final UsersDao usersDao;

	@GetMapping("/resume/{id}/update")
	public String 이력서수정페이지(@PathVariable Integer id, Model model) {
		ResumeUpdateDto resumeUpdateDtoPS = resumeService.updateById(id);
		model.addAttribute("resumeUpdateDtoPS", resumeUpdateDtoPS);
		return "/resume/resume_update";
	}

	@GetMapping("/resume")
	public String 이력서메인페이지() {
		return "/resume/resume_main";
	}

	@GetMapping("/resume/write")
	public String 이력서작성페이지() {
		return "/resume/resume_write";
	}

	@GetMapping("/resume/list")
	public String 이력서관리() {
		return "/resume/resume_list";
	}

	@GetMapping("/resume/{id}/list")
	public String 이력서관리페이지(@PathVariable Integer id, Model model) {
		List<ResumeListDto> resumeListDtoPS = resumeService.ListById(id);
		model.addAttribute("resumeList", resumeListDtoPS);
		return "/resume/resume_list";
	}
 
	@DeleteMapping("/resume/{id}/delete")
	public @ResponseBody CMRespDto<?> 이력서삭제(@PathVariable Integer id) {
		resumesDao.deleteById(id);
		return new CMRespDto<>(1, "삭제성공", null);
		// return "/resume/{id}/list";
	}

}
