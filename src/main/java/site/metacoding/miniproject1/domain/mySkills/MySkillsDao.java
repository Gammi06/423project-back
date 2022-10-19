package site.metacoding.miniproject1.domain.mySkills;

import java.util.List;

public interface MySkillsDao {
	// 기본기능
	public void insert(MySkills mySkills);
	public List<MySkills> findAll();
	public MySkills findById(Integer id);
	public void update(Integer id, MySkills mySkills);
	public void deleteById(Integer id);
}
