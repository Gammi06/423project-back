package site.metacoding.miniproject1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class WantedsPageController {

	@GetMapping("/wanteds")
	public String wantedsPage() {
		return "wanteds/wanted";
	}
}
