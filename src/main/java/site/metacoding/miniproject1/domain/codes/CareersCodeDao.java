package site.metacoding.miniproject1.domain.codes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.codes.CareersCodeDto;

public interface CareersCodeDao {
	public List<CareersCodeDto> findAll();
	public CareersCode findById(Integer id);
}
