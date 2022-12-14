package site.metacoding.miniproject1.domain.wanteds;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import site.metacoding.miniproject1.web.dto.response.wanteds.KeywordDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.PagingDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedDetailDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsListDto;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsManageDto;

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
	public List<WantedsListDto> findAllLike(Integer userId);
	public List<WantedsListDto> findAllToSort(@Param("keywordDto")KeywordDto keywordDto);
	public List<WantedsListDto> findAllByCompanyId(Integer id);
	public WantedDetailDto findByIdToDetail(Integer id);
	public PagingDto paging(@Param("keywordDto")KeywordDto keywordDto);

	public List<WantedsManageDto> findAllWanteds(Integer companyId);
	public List<WantedsManageDto> findAllByCareer(Integer companyId, Integer careerCodeId);
	public List<WantedsManageDto> findAllByPositionToCompany(Integer companyId, Integer positionCodeId);
	public List<WantedsManageDto> findByBoth(Integer companyId, Integer careerCodeId, Integer positionCodeId);
}
