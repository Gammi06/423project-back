package site.metacoding.miniproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	/*
	@GetMapping("/")
	public String test() {
		return "all/test";
	}
	*/
	
	@GetMapping("/accountsetting")
	public String test() {
		return "users/accountsetting";
	}
}
