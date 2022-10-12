package site.metacoding.miniproject1.domain.applicationStatus;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.StatusCountDto;
import site.metacoding.miniproject1.web.dto.response.StatusInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusWaitingInfoDto;

public interface ApplicationStatusDao {
	// 기본기능
	public void insert(ApplicationStatus applicationStatus);

	public List<StatusInfoDto> findAll(String keyword);

	public List<StatusCountDto> findCounts();

	public List<StatusWaitingInfoDto> findWaiting(String keyword);

	public ApplicationStatus findById(Integer id);

	public void update(Integer id, ApplicationStatus applicationStatus);

	public void deleteById(Integer id);
}
