package site.metacoding.miniproject1.domain.wanteds;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import site.metacoding.miniproject1.web.dto.response.WantedsListDto;
import site.metacoding.miniproject1.web.dto.response.WantedsManageDto;

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
}
