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
        System.out.println("========================");
        System.out.println("컨트롤러 실행됨");
        System.out.println(applicationStatusList.size());
        System.out.println(applicationStatusList.isEmpty());
        System.out.println("========================");
        model.addAttribute("applicationStatusList", applicationStatusList);
        System.out.println("========================");
        System.out.println("컨트롤러 실행됨2");
        System.out.println(model.toString());
        System.out.println(model.equals(applicationStatusList));
        System.out.println("========================");
        return "mypage/applicationStatusAll";
    }

}
