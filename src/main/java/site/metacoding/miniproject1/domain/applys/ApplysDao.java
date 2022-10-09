package site.metacoding.miniproject1.domain.applys;

import java.util.List;

public interface ApplysDao {
	// 기본기능
	public void insert(Applys applys);
	public List<Applys> findAll();
	public Applys findById(Integer id);
	public void update(Integer id, Applys applys);
	public void deleteById(Integer id);
}
