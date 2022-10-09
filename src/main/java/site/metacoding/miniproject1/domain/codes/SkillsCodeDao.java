package site.metacoding.miniproject1.domain.codes;

import java.util.List;

public interface SkillsCodeDao {
	public List<SkillsCode> findAll();
	public SkillsCode findById(Integer id);
}
