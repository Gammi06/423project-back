package site.metacoding.miniproject1.web;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.CompanysService;

@RequiredArgsConstructor
@Controller
public class CompanyPageController {
	private final CompanysService companysService;
}
