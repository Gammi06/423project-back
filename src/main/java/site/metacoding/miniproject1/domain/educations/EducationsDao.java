package site.metacoding.miniproject1.domain.educations;

import java.util.List;

public interface EducationsDao {
	// 기본기능
	public void insert(Educations educations);
	public List<Educations> findAll();
	public Educations findById(Integer id);
	public void update(Integer id, Educations educations);
	public void deleteById(Integer id);
}
