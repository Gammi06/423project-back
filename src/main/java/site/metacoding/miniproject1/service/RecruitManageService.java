package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.codes.CareersCodeDao;
import site.metacoding.miniproject1.domain.codes.PositionsCodeDao;
import site.metacoding.miniproject1.domain.wanteds.WantedsDao;
import site.metacoding.miniproject1.web.dto.response.WantedsManageDto;
import site.metacoding.miniproject1.web.dto.response.codes.AllCodesDto;
import site.metacoding.miniproject1.web.dto.response.companys.PagingDto;
import site.metacoding.miniproject1.web.dto.response.companys.PagingWantedsManageDto;

@RequiredArgsConstructor
@Service
public class RecruitManageService {
	private final WantedsDao wantedsDao;
	private final PositionsCodeDao positionsCodeDao;
	private final CareersCodeDao careersCodeDao;

	public List<WantedsManageDto> findAllWanteds(Integer companyId) {
		List<WantedsManageDto> wantedsManageDtoPS = wantedsDao.findAllWanteds(companyId);
		return wantedsManageDtoPS;
	}

	public List<WantedsManageDto> findAllByCareer(Integer companyId, Integer careerCodeId) {
		// 커리어가 있는지 확인하기
		if (careersCodeDao.findById(careerCodeId) == null)
		return null;
		
		List<WantedsManageDto> wantedsManageDtosPS = wantedsDao.findAllByCareer(companyId, careerCodeId);
		return wantedsManageDtosPS;
	}

	public List<WantedsManageDto> findAllByPositionToCompany(Integer companyId, Integer positionCodeId) {
		// 포지션이 있는지 확인하기
		if (positionsCodeDao.findById(positionCodeId) == null)
			return null;

		List<WantedsManageDto> wantedsManageDtosPS = wantedsDao.findAllByPosition(companyId, positionCodeId);
		return wantedsManageDtosPS;
	}
	
	public List<WantedsManageDto> findByBoth(Integer companyId, Integer careerCodeId, Integer positionCodeId) {
		List<WantedsManageDto> wantedsManageDtoPS = wantedsDao.findByBoth(companyId, careerCodeId, positionCodeId);
		return wantedsManageDtoPS;
	}
	
	public AllCodesDto findAllCodes() {
		AllCodesDto allCodesDto = new AllCodesDto();
		allCodesDto.setPositionsCodeDtos(positionsCodeDao.findAll());
		allCodesDto.setCareersCodeDtos(careersCodeDao.findAll());
		return allCodesDto;
	}
	
	public PagingWantedsManageDto pagingWantedsManage(Integer page, Integer companyId) {
		if(page == null) page = 0;
		int startNum = page * 5;
		
		PagingWantedsManageDto pagingWantedsManageDtoPS = new PagingWantedsManageDto();
		pagingWantedsManageDtoPS.setPagingDto(paging(page));
		pagingWantedsManageDtoPS.setWantedsManageDtos(wantedsDao.findAllWanteds(companyId));
		
		return pagingWantedsManageDtoPS;
	}
	
	public PagingDto paging(Integer page) {
		PagingDto pagingPS = wantedsDao.paging(page);
		
		final int blockCount = 5;
		int currentBlock = page/ blockCount;
		int startPageNum = 1 + blockCount * currentBlock;
		int lastPageNum = 5 + blockCount * currentBlock;
		
		if(pagingPS.getTotalPage() < lastPageNum) {
			lastPageNum = pagingPS.getTotalPage();
		}
		
		pagingPS.setBlockCount(blockCount);
		pagingPS.setCurrentBlock(currentBlock);
		pagingPS.setStartPageNum(startPageNum);
		pagingPS.setLastPageNum(lastPageNum);
		
		return pagingPS;
	}
}
