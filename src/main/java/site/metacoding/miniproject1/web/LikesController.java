package site.metacoding.miniproject1.web;

import java.lang.annotation.Repeatable;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.users.Users;
import site.metacoding.miniproject1.service.LikesService;
import site.metacoding.miniproject1.web.dto.request.likes.LikesRespListDto;
import site.metacoding.miniproject1.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class LikesController {

    private final HttpSession session;
    private final LikesService likesService;

    @GetMapping("/likes/{id}")
    public String likeslist(@PathVariable Integer id, Model model) {
        List<LikesRespListDto> likesList = likesService.좋아요목록(id);
        model.addAttribute("likesList", likesList);
        return "likes/likes";
    }

    @PostMapping("/api/likes/{id}")
    public @ResponseBody CMRespDto<?> likescheck(@PathVariable Integer id, Integer userId){
        Users users = (Users)session.getAttribute("principal");
        System.out.println(users.getUserId() + "   "+ userId); 
        likesService.좋아요하기(userId,id);
        return new CMRespDto<>(1, "좋아요 성공", null);
    }
     
}
