package site.metacoding.miniproject1.domain.recruits;

import java.util.List;

public interface RecruitsDao {
	// 기본기능
	public void insert(Recruits recruits);
	public List<Recruits> findAll();
	public Recruits findById(Integer id);
	public void update(Integer id, Recruits recruits);
	public void deleteById(Integer id);
}
