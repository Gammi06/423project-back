package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.codes.CareersCodeDao;
import site.metacoding.miniproject1.domain.codes.PositionsCodeDao;
import site.metacoding.miniproject1.domain.codes.RegionsCodeDao;
import site.metacoding.miniproject1.domain.codes.SkillsCodeDao;
import site.metacoding.miniproject1.domain.wanteds.WantedsDao;
import site.metacoding.miniproject1.web.dto.response.codes.PositionCodeDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@RequiredArgsConstructor
@Service
public class WantedsService {
	private final WantedsDao wantedsDao;
	private final PositionsCodeDao positionsCodeDao;

	public List<PositionCodeDto> findAllPositionCode() {
		List<PositionCodeDto> positionCodeDtosPS = positionsCodeDao.findAll();
		return positionCodeDtosPS;
	}

	public List<WantedsListDto> findAllByLike() {
		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllByLike();
		return wantedsDtosPS;
	}
	
	public List<WantedsListDto> findAllByDate() {
		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllByDate();
		return wantedsDtosPS;
	}
	
	public List<WantedsListDto> findByLike(Integer userId){
		//유저가 있는지 확인하기
		//findById로 확인할것, 없으면 null넘기기
		if(userId == 0) return null;
		
		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllLike(userId);
		return wantedsDtosPS;
	}
	
	public WantedsListDto findBestHot() {
		WantedsListDto wantedsDtoPS = wantedsDao.findBestHot();
		return wantedsDtoPS;
	}

	public List<WantedsListDto> findAllHot() {
		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllHot();
		return wantedsDtosPS;
	}

	public List<WantedsListDto> findAllByposition(Integer positionCodeId) {
		// 포지션이 있는지 확인하기
		if (positionsCodeDao.findById(positionCodeId) == null)
			return null;

		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllByposition(positionCodeId);
		return wantedsDtosPS;
	}
}
