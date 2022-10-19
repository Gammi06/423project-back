package site.metacoding.miniproject1.domain.applicationStatus;

import java.util.List;


import org.apache.ibatis.annotations.Param;

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
