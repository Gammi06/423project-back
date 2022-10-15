package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.resumes.Resumes;
import site.metacoding.miniproject1.domain.resumes.ResumesDao;
import site.metacoding.miniproject1.web.dto.response.resume.ResumeUpdateDto;

@Service
@RequiredArgsConstructor
public class ResumeService {
	private final ResumesDao resumesDao;
	public ResumeUpdateDto findById(Integer id) {
		return resumesDao.findById(id);
	}
}
