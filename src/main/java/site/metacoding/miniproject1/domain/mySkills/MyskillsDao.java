package site.metacoding.miniproject1.domain.mySkills;

import java.util.List;

import site.metacoding.miniproject1.domain.myskills.Myskills;

public interface MyskillsDao {
	// 기본기능
	public void insert(Myskills mySkills);
	public List<Myskills> findAll();
	public Myskills findById(Integer id);
	public void update(Integer id, Myskills mySkills);
	public void deleteById(Integer id);
}
