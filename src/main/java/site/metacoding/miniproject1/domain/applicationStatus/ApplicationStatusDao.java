package site.metacoding.miniproject1.domain.applicationStatus;

import java.util.List;

public interface ApplicationStatusDao {
	// 기본기능
	public void insert(ApplicationStatus applicationStatus);
	public List<ApplicationStatus> findAll();
	public ApplicationStatus findById(Integer id);
	public void update(Integer id, ApplicationStatus applicationStatus);
	public void deleteById(Integer id);
}
