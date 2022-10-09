package site.metacoding.miniproject1.domain.matchings;

import java.util.List;

public interface MatchingsDao {
	// 기본기능
	public void insert(Matchings matchings);
	public List<Matchings> findAll();
	public Matchings findById(Integer id);
	public void update(Integer id, Matchings matchings);
	public void deleteById(Integer id);
}
