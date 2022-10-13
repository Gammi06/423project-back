package site.metacoding.miniproject1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainPageController {
	
	@GetMapping("/main")
	public String mainPage() {
		return "all/main";
	}
}
