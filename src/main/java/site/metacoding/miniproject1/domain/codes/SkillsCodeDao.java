package site.metacoding.miniproject1.domain.codes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.codes.SkillsCodeDto;

public interface SkillsCodeDao {
	public List<SkillsCodeDto> findAll();
	public SkillsCodeDto findById(Integer id);
}
