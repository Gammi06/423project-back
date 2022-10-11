package site.metacoding.miniproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/")
	public String test() {
		return "all/test";
	}

	@GetMapping("/mypage")
	public String getMyPage() {
		return "mypage/mypage";
	}

	@GetMapping("/applicationstatus")
	public String getApplicationStatus() {
		return "mypage/applicationStatus";
	}

	@GetMapping("/applicationstatusfinal")
	public String getApplicationStatusFinal() {
		return "mypage/applicationStatusFinal";
	}

	@GetMapping("/proposal")
	public String getProposal() {
		return "mypage/proposal";
	}
}
