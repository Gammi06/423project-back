package site.metacoding.miniproject1.domain.wanteds;

import java.util.List;

public interface WantedsDao {
	// 기본기능
	public void insert(Wanteds wanteds);
	public List<Wanteds> findAll();
	public Wanteds findById(Integer id);
	public void update(Integer id, Wanteds wanteds);
	public void deleteById(Integer id);
}
