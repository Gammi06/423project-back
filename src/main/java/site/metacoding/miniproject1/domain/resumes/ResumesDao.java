package site.metacoding.miniproject1.domain.resumes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.resume.ResumeListDto;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeUpdateDto;

public interface ResumesDao {
	// 기본기능
	public ResumeUpdateDto updateById(Integer id);
	public List<ResumeListDto> ListById(Integer id);
	public List<Resumes> findAll();
	public void deleteById(Integer id);
	public void insert(Resumes resumes);
	public void update(Integer id, Resumes resumes);
	public Resumes findById(Integer id);

}
