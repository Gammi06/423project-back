package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.codes.CareersCodeDao;
import site.metacoding.miniproject1.domain.codes.PositionsCodeDao;
import site.metacoding.miniproject1.domain.wanteds.WantedsDao;
import site.metacoding.miniproject1.web.dto.response.WantedsManageDto;

@RequiredArgsConstructor
@Service
public class ApplyManageService {
	private final WantedsDao wantedsDao;
	private final PositionsCodeDao positionsCodeDao;
	private final CareersCodeDao careersCodeDao;

	public List<WantedsManageDto> findAllwanteds(Integer companyId) {
		List<WantedsManageDto> wantedsManageDtoPS = wantedsDao.findAllWanteds(companyId);
		return wantedsManageDtoPS;
	}

	public List<WantedsManageDto> findAllByCareer(Integer careerCodeId) {
		// 커리어가 있는지 확인하기
		if (careersCodeDao.findById(careerCodeId) == null)
		return null;
		
		List<WantedsManageDto> wantedsManageDtosPS = wantedsDao.findAllByCareer(careerCodeId);
		return wantedsManageDtosPS;
	}

	public List<WantedsManageDto> findAllByPositionToCompany(Integer positionCodeId) {
		// 포지션이 있는지 확인하기
		if (positionsCodeDao.findById(positionCodeId) == null)
			return null;

		List<WantedsManageDto> wantedsManageDtosPS = wantedsDao.findAllByPosition(positionCodeId);
		return wantedsManageDtosPS;
	}
	
	public List<WantedsManageDto> findByBoth(Integer careerCodeId, Integer positionCodeId) {
		List<WantedsManageDto> wantedsManageDtoPS = wantedsDao.findByBoth(careerCodeId, positionCodeId);
		return wantedsManageDtoPS;
	}
}
