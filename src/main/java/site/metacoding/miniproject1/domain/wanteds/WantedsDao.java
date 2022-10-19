package site.metacoding.miniproject1.domain.wanteds;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import site.metacoding.miniproject1.web.dto.response.WantedsListDto;
import site.metacoding.miniproject1.web.dto.response.WantedsManageDto;
import site.metacoding.miniproject1.web.dto.response.companys.PagingDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.KeywordDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.PagingDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedDetailDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;

public interface WantedsDao {
	// 기본기능
	public void insert(Wanteds wanteds);
	public List<Wanteds> findAll();
	public Wanteds findById(Integer id);
	public void update(Integer id, Wanteds wanteds);
	public void deleteById(Integer id);
	
	public WantedsListDto findBestHot();
	public List<WantedsListDto> findAllHot();
	public List<WantedsListDto> findAllByposition(Integer positionCodeId);
	public List<WantedsManageDto> findAllWanteds(Integer companyId);
	public List<WantedsManageDto> findAllByCareer(@Param("companyId") Integer companyId, @Param("careerCodeId") Integer careerCodeId);
	public List<WantedsManageDto> findAllByPosition(@Param("companyId") Integer companyId, @Param("positionCodeId") Integer positionCodeId);
	public List<WantedsManageDto> findByBoth(@Param("companyId") Integer companyId, @Param("careerCodeId") Integer careerCodeId, @Param("positionCodeId") Integer positionCodeId);
	public PagingDto paging(Integer page);
	public List<WantedsListDto> findAllLike(Integer userId);
	public List<WantedsListDto> findAllToSort(@Param("state")Integer state,
			@Param("startNum")Integer startNum,@Param("keywordDto")KeywordDto keywordDto);
	public List<WantedsListDto> findAllByCompanyId(Integer id);
	public WantedDetailDto findByIdToDetail(Integer id);
	public PagingDto paging(@Param("page")Integer page, @Param("keywordDto")KeywordDto keywordDto);
}
