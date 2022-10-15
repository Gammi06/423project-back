package site.metacoding.miniproject1.domain.resumes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.resume.ResumeUpdateDto;

public interface ResumesDao {
	// 기본기능
	public void insert(Resumes resumes);
	public List<Resumes> findAll();
	public ResumeUpdateDto findById(Integer id);
	public void update(Integer id, Resumes resumes);
	public void deleteById(Integer id);
}
