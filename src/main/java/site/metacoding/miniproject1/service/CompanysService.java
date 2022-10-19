package site.metacoding.miniproject1.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.companys.CompanysDao;
import site.metacoding.miniproject1.web.dto.response.companys.CompanyDetailDto;
import site.metacoding.miniproject1.web.dto.response.companys.CompanyDetailWithWantedsListDto;
import site.metacoding.miniproject1.domain.companys.Companys;
import site.metacoding.miniproject1.web.dto.request.companys.CompanysInsertReqDto;

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

	public void 회사정보등록(CompanysInsertReqDto companysInsertReqDto) {
		System.out.println("DB에 데이터 들어감");
		companysDao.insert(companysInsertReqDto.toEntity());
	}

	public boolean 사업자번호중복확인(String companyNumber) {
		Companys CompanysPS = companysDao.findByIdCompanysNumber(companyNumber);
		if (CompanysPS == null) { // 사업자 번호 가 중복 안됨
			return false;
		} else { // 사업자번호가 중복됨
			return true;
		}
	}
}
