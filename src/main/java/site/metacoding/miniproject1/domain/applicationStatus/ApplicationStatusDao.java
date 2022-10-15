package site.metacoding.miniproject1.domain.applicationStatus;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import site.metacoding.miniproject1.web.dto.response.CompanyInfoDto;
import site.metacoding.miniproject1.web.dto.response.InfoCountDto;
import site.metacoding.miniproject1.web.dto.response.RequestsInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusCountDto;
import site.metacoding.miniproject1.web.dto.response.StatusFinalInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusWaitingInfoDto;
import site.metacoding.miniproject1.web.dto.response.UserInfoDto;

public interface ApplicationStatusDao {
	// 기본기능
	public void insert(ApplicationStatus applicationStatus);

	public List<UserInfoDto> findUser(Integer id);

	public List<CompanyInfoDto> findCompany(Integer id);
	
	public List<CompanyInfoDto> findCompanyIfNull();

	public List<InfoCountDto> findInfoCounts(Integer id);

	public List<StatusInfoDto> findAll(@Param("id") Integer id, @Param("keyword") String keyword);

	public List<StatusCountDto> findCounts(Integer id);

	public List<StatusWaitingInfoDto> findWaiting(@Param("id") Integer id, @Param("keyword") String keyword);

	public List<StatusFinalInfoDto> findFinal(@Param("id") Integer id, @Param("keyword") String keyword);

	public List<RequestsInfoDto> findRequest(@Param("id") Integer id, @Param("keyword") String keyword);

	public ApplicationStatus findById(Integer id);

	public void update(Integer id, ApplicationStatus applicationStatus);

	public void deleteById(Integer id);
}
