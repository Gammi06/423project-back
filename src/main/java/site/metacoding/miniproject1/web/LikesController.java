package site.metacoding.miniproject1.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.LikesService;
import site.metacoding.miniproject1.web.dto.request.likes.LikesRespListDto;


@RequiredArgsConstructor
@Controller
public class LikesController {

	private final LikesService likesService;

	@GetMapping("/likes/{id}")
	public String likeslist(@PathVariable Integer id, Model model) {
		System.out.println("좋아요페이지 돌아감!!!!");
		List<LikesRespListDto> likesList = likesService.좋아요목록(id);
		model.addAttribute("likesList", likesList);
	//	System.out.println(likesList.size());
		return "likes/likes";
	}

}
