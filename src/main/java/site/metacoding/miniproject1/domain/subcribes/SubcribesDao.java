package site.metacoding.miniproject1.domain.subcribes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.subscribes.SubscribesRespListDto;



public interface SubcribesDao {
	// 기본기능
	public void insert(Subcribes subcribes);
	public List<Subcribes> findAll();
	public Subcribes findById(Integer id);
	public void update(Integer id, Subcribes subcribes);
	public void deleteById(Integer id);
	public List<SubscribesRespListDto> subcribesListPage(Integer id);
}
