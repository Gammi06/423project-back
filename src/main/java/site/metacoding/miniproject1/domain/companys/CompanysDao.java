package site.metacoding.miniproject1.domain.companys;

import java.util.List;

public interface CompanysDao {
	// 기본기능
	public void insert(Companys companys);
	public List<Companys> findAll();
	public Companys findById(Integer id);
	public void update(Integer id, Companys companys);
	public void deleteById(Integer id);
}
