package site.metacoding.miniproject1.domain.requests;

import java.util.List;

public interface RequestsDao {
	// 기본기능
	public void insert(Requests requests);
	public List<Requests> findAll();
	public Requests findById(Integer id);
	public void update(Integer id, Requests requests);
	public void deleteById(Integer id);
}
