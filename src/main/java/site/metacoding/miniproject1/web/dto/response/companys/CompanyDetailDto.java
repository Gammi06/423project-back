package site.metacoding.miniproject1.web.dto.response.companys;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompanyDetailDto {
	private Integer id;
	private String companyName;
	private String address;
	private String email;
	private String regionCodeName;
	private Integer memberCount;
	private String intro;
}
