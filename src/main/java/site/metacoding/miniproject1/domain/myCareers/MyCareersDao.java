package site.metacoding.miniproject1.domain.myCareers;

import java.util.List;

public interface MyCareersDao {
	// 기본기능
	public void insert(MyCareers myCareers);
	public List<MyCareers> findAll();
	public MyCareers findById(Integer id);
	public void update(Integer id, MyCareers MyCareers);
	public void deleteById(Integer id);
}
