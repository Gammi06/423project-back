package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.companys.Companys;
import site.metacoding.miniproject1.domain.companys.CompanysDao;
import site.metacoding.miniproject1.web.dto.request.companys.CompanysInsertReqDto;
import site.metacoding.miniproject1.web.dto.response.SubscribesRespListDto;

@RequiredArgsConstructor
@Service
public class CompanysService {

	private final CompanysDao companysDao;

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
