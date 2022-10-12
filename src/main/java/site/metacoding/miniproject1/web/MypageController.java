package site.metacoding.miniproject1.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.MypageService;
import site.metacoding.miniproject1.web.dto.response.StatusDto;

@RequiredArgsConstructor
@Controller
public class MypageController {

    private final MypageService mypageService;

    @GetMapping("/applicationstatusall")
    public String getAll(Model model) {
        List<StatusDto> applicationStatusList = mypageService.viewall();
        model.addAttribute("applicationStatusList", applicationStatusList);
        return "mypage/applicationStatusAll";
    }

}
