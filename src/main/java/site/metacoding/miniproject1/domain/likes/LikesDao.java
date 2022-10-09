package site.metacoding.miniproject1.domain.likes;

import java.util.List;

public interface LikesDao {
	// 기본기능
	public void insert(Likes likes);
	public List<Likes> findAll();
	public Likes findById(Integer id);
	public void update(Integer id, Likes likes);
	public void deleteById(Integer id);
}
