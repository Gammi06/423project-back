package site.metacoding.miniproject1.domain.likes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.request.likes.LikesRespListDto;
public interface LikesDao {
	// 기본기능
	public void insert(Likes likes);
	public List<Likes> findAll();
	public Likes findById(Integer id);
	public void update(Integer id, Likes likes);
	public void deleteById(Integer id);
	public List<LikesRespListDto> findlikes(Integer id);
	}
