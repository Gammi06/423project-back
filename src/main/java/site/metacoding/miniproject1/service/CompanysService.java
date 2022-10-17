package site.metacoding.miniproject1.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.companys.CompanysDao;
import site.metacoding.miniproject1.web.dto.response.companys.CompanyDetailDto;
import site.metacoding.miniproject1.web.dto.response.companys.CompanyDetailWithWantedsListDto;

@RequiredArgsConstructor
@Service
public class CompanysService {
	private final CompanysDao companysDao;
	private final WantedsService wantedsService;

	public CompanyDetailWithWantedsListDto findByIdToDetailWithWantedsList(Integer id) {
		if(findByIdToDetail(id) == null) return null;
		CompanyDetailWithWantedsListDto companyDetailWithWantedsListDtoPS = new CompanyDetailWithWantedsListDto();
		companyDetailWithWantedsListDtoPS.setCompanyDetailDto(findByIdToDetail(id));
		companyDetailWithWantedsListDtoPS.setWantedsListDtos(wantedsService.findAllByCompanyId(id));
		return companyDetailWithWantedsListDtoPS;
	}
	
	public CompanyDetailDto findByIdToDetail(Integer id) {
		 CompanyDetailDto companyDetailDtoPS = companysDao.findByIdToDetail(id);
		 if(companyDetailDtoPS == null) return null;
		 return companyDetailDtoPS;
	}
}
