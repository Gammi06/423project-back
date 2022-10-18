package site.metacoding.miniproject1.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.users.Users;
import site.metacoding.miniproject1.service.UsersService;
import site.metacoding.miniproject1.web.dto.request.users.UsersLoginReqDto;
import site.metacoding.miniproject1.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class UsersController {

	private final UsersService usersService;
	private final HttpSession session;

	@GetMapping("/loginpage")
	public String loginpage(Model model, HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("userId")) {
				model.addAttribute(cookie.getName(), cookie.getValue());
			}
		}
		return "users/loginpage";
	}

	@PostMapping("/api/login")
	public @ResponseBody CMRespDto<?> login(@RequestBody UsersLoginReqDto loginDto, HttpServletResponse response) {
		if(loginDto.isRemember()) {
			Cookie cookie = new Cookie("userId", loginDto.getUserId());
			cookie.setMaxAge(60*60*24);
			response.addCookie(cookie);
		}else {
			Cookie cookie = new Cookie("userId", null);
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		
		Users principal = usersService.로그인(loginDto);
		if(principal == null) {
			return new CMRespDto<>(-1, "로그인실패", null);
		}
		session.setAttribute("principal", principal);
		return new CMRespDto<>(1, "로그인성공", null);
	}
}
