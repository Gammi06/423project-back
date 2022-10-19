package site.metacoding.miniproject1.web;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.MyPageService;
import site.metacoding.miniproject1.web.dto.response.InfoAllDto;
import site.metacoding.miniproject1.web.dto.response.RequestsDto;
import site.metacoding.miniproject1.web.dto.response.StatusAllDto;
import site.metacoding.miniproject1.web.dto.response.StatusFinalDto;
import site.metacoding.miniproject1.web.dto.response.StatusWaitingDto;

@RequiredArgsConstructor
@Controller
public class MyPageController {

    private final HttpSession session;
    private final MyPageService myPageService;

    @GetMapping("/mypage/{id}")
    public String getMyPage(@PathVariable Integer id, Model model) {
        InfoAllDto infoAllDto = myPageService.viewMyPage(id);
        model.addAttribute("infoAllDto", infoAllDto);
        return "mypage/myPage";
    }

    @GetMapping("/applicationstatusall/{id}")
    public String getAll(@PathVariable Integer id, Model model, String keyword) {
        StatusAllDto statusAllDto = myPageService.viewAll(id, keyword);
        model.addAttribute("statusAllDto", statusAllDto);
        Map<String, Object> referer = new HashMap<>();
        referer.put("keyword", statusAllDto.getKeyword());
        session.setAttribute("referer", referer);
        return "mypage/applicationStatusAll";
    }

    @GetMapping("/applicationstatus/{id}")
    public String getWaiting(@PathVariable Integer id, Model model, String keyword) {
        StatusWaitingDto statusWaitingDto = myPageService.viewWaiting(id, keyword);
        model.addAttribute("statusWaitingDto", statusWaitingDto);
        Map<String, Object> referer = new HashMap<>();
        referer.put("keyword", statusWaitingDto.getKeyword());
        session.setAttribute("referer", referer);
        return "mypage/applicationStatus";
    }

    @GetMapping("/applicationstatusfinal/{id}")
    public String getFinal(@PathVariable Integer id, Model model, String keyword) {
        StatusFinalDto statusFinalDto = myPageService.viewFinal(id, keyword);
        model.addAttribute("statusFinalDto", statusFinalDto);
        Map<String, Object> referer = new HashMap<>();
        referer.put("keyword", statusFinalDto.getKeyword());
        session.setAttribute("referer", referer);
        return "mypage/applicationStatusFinal";
    }

    @GetMapping("/proposal/{id}")
    public String getRequests(@PathVariable Integer id, Model model, String keyword) {
        RequestsDto requestsDto = myPageService.viewRequests(id, keyword);
        model.addAttribute("requestsDto", requestsDto);
        Map<String, Object> referer = new HashMap<>();
        referer.put("keyword", requestsDto.getKeyword());
        session.setAttribute("referer", referer);
        return "mypage/proposal";
    }

}
