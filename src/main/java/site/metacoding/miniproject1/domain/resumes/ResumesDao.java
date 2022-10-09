package site.metacoding.miniproject1.domain.resumes;

import java.util.List;

public interface ResumesDao {
	// 기본기능
	public void insert(Resumes resumes);
	public List<Resumes> findAll();
	public Resumes findById(Integer id);
	public void update(Integer id, Resumes resumes);
	public void deleteById(Integer id);
}
