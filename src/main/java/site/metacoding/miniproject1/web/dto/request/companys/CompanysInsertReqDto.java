package site.metacoding.miniproject1.web.dto.request.companys;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.miniproject1.domain.companys.Companys;

@Setter
@Getter
public class CompanysInsertReqDto {
	private String companyName;
	private String address;
	private String email;
	private String companyNumber;
	private String regionCodeName;
	private String intro;
	private Integer years;
	private Integer memberCount;
	
	

	public Companys toEntity() {
		Companys companys = new Companys();
		companys.setCompanyName(this.companyName);
		companys.setAddress(this.address);
		companys.setEmail(this.email);
		companys.setCompanyNumber(this.companyNumber);
		companys.setRegionCodeName(this.regionCodeName);
		companys.setIntro(this.intro);
		companys.setYears(this.years);
		companys.setMemberCount(this.memberCount);
		return companys;
	}


}
