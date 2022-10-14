package site.metacoding.miniproject1.domain.codes;

import java.util.List;

public interface SkillsCodeDao {
	public List<SkillsCodeDao> findAll();
	public SkillsCodeDao findById(Integer id);
}
