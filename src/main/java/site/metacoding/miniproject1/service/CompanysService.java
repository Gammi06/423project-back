package site.metacoding.miniproject1.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.companys.CompanysDao;
import site.metacoding.miniproject1.web.dto.response.companys.CompanyDetailDto;

@RequiredArgsConstructor
@Service
public class CompanysService {
	private final CompanysDao companysDao;

	public CompanyDetailDto findByIdToDetail(Integer id) {
		 CompanyDetailDto companyDetailDtoPS = companysDao.findByIdToDetail(id);
		 if(companyDetailDtoPS == null) return null;
		 return companyDetailDtoPS;
	}
}
