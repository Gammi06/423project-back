package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.codes.CareersCodeDao;
import site.metacoding.miniproject1.domain.codes.PositionsCodeDao;
import site.metacoding.miniproject1.domain.codes.RegionsCodeDao;
import site.metacoding.miniproject1.domain.codes.SkillsCodeDao;
import site.metacoding.miniproject1.domain.wanteds.WantedsDao;
import site.metacoding.miniproject1.web.dto.response.codes.CareersCodeDto;
import site.metacoding.miniproject1.web.dto.response.codes.PositionsCodeDto;
import site.metacoding.miniproject1.web.dto.response.codes.RegionsCodeDto;
import site.metacoding.miniproject1.web.dto.response.codes.SkillsCodeDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.PagingDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

@RequiredArgsConstructor
@Service
public class WantedsService {
	private final WantedsDao wantedsDao;
	private final PositionsCodeDao positionsCodeDao;
	private final SkillsCodeDao skillsCodeDao;
	private final RegionsCodeDao regionsCodeDao;
	private final CareersCodeDao careersCodeDao;
	
	//통합해서 부르는거 하나 짤 수 있으면 짜기
	
	
	public PagingDto paging(Integer page) {
		PagingDto pagingPS = wantedsDao.paging(page);
		
		final int blockCount = 16;
		int currentBlock = page/ blockCount;
		int startPageNum = 1 + blockCount * currentBlock;
		int lastPageNum = 16 + blockCount * currentBlock;
		
		if(pagingPS.getTotalPage() < lastPageNum) {
			lastPageNum = pagingPS.getTotalPage();
		}
		
		pagingPS.setBlockCount(blockCount);
		pagingPS.setCurrentBlock(currentBlock);
		pagingPS.setStartPageNum(startPageNum);
		pagingPS.setLastPageNum(lastPageNum);
		
		return pagingPS;
	}

	public List<PositionsCodeDto> findAllPositionsCode() {
		List<PositionsCodeDto> positionsCodeDtosPS = positionsCodeDao.findAll();
		return positionsCodeDtosPS;
	}
	
	public List<SkillsCodeDto> findAllSkillsCode() {
		List<SkillsCodeDto> skillsCodeDtosPS = skillsCodeDao.findAll();
		return skillsCodeDtosPS;
	}
	
	public List<RegionsCodeDto> findAllRegionsCode(){
		List<RegionsCodeDto> regionsCodeDtosPS = regionsCodeDao.findAll();
		return regionsCodeDtosPS;
	}
	
	public List<CareersCodeDto> findAllCareersCode() {
		List<CareersCodeDto> careersCodeDtosPS = careersCodeDao.findAll();
		return careersCodeDtosPS;
	}

	public List<WantedsListDto> findAllByLike(Integer startNum) {
		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllByLike(startNum);
		return wantedsDtosPS;
	}
	
	public List<WantedsListDto> findAllByDate(Integer startNum) {
		List<WantedsListDto> wantedsDtosPS = wantedsDao.findAllByDate(startNum);
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
