package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.codes.CareersCodeDao;
import site.metacoding.miniproject1.domain.codes.PositionsCodeDao;
import site.metacoding.miniproject1.domain.wanteds.WantedsDao;
import site.metacoding.miniproject1.web.dto.response.WantedsListDto;
import site.metacoding.miniproject1.web.dto.response.codes.AllCodesDto;
import site.metacoding.miniproject1.web.dto.response.companys.PagingDto;
import site.metacoding.miniproject1.web.dto.response.companys.PagingWantedsManageDto;

@RequiredArgsConstructor
@Service
public class WantedsService {
	private final WantedsDao wantedsDao;
	private final PositionsCodeDao positionsCodeDao;
	private final CareersCodeDao careersCodeDao;

	public WantedsListDto findBestHot() {
		WantedsListDto wantedsDtoPS = wantedsDao.findBestHot();
		return wantedsDtoPS;
	}

	public List<WantedsListDto> findAllHot() {
		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllHot();
		return wantedsDtosPS;
	}

	public List<WantedsListDto> findAllByPosition(Integer positionCodeId) {
		// 포지션이 있는지 확인하기
		if (positionsCodeDao.findById(positionCodeId) == null)
			return null;

		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllByposition(positionCodeId);
		return wantedsDtosPS;
	}
	
}
