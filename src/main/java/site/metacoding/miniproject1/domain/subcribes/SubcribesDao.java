package site.metacoding.miniproject1.domain.subcribes;

import java.util.List;

public interface SubcribesDao {
	// 기본기능
	public void insert(Subcribes subcribes);
	public List<Subcribes> findAll();
	public Subcribes findById(Integer id);
	public void update(Integer id, Subcribes subcribes);
	public void deleteById(Integer id);
}
