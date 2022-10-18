package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.resumes.Resumes;
import site.metacoding.miniproject1.domain.resumes.ResumesDao;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeListDto;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeUpdateDto;

@Service
@RequiredArgsConstructor
public class ResumeService {
	
	private final ResumesDao resumesDao;
	
	public ResumeUpdateDto updateById(Integer id) {
		return resumesDao.updateById(id);
	}
	
	public List<ResumeListDto> ListById(Integer id) {
		return resumesDao.ListById(id);
	}
	
	public List<Resumes> findAll(Integer id) {
		return resumesDao.findAll();
	}
	
	public void delete(Integer id) {
		resumesDao.deleteById(id);
	}
	
	public void update(Integer id, Resumes resumes) {
		resumesDao.update(id, resumes);
	}
}
