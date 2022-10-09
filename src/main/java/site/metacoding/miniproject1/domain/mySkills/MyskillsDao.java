package site.metacoding.miniproject1.domain.mySkills;

import java.util.List;

public interface MyskillsDao {
	// 기본기능
	public void insert(Myskills myskills);
	public List<Myskills> findAll();
	public Myskills findById(Integer id);
	public void update(Integer id, Myskills myskills);
	public void deleteById(Integer id);
}
