package site.metacoding.miniproject1.web.dto.response.companys;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@Setter
@Getter
public class CompanyDetailWithWantedsListDto {
	private CompanyDetailDto companyDetailDto;
	private List<WantedsListDto> wantedsListDtos;
}
