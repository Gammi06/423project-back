package site.metacoding.miniproject1.domain.codes;

import java.util.List;

public interface RegionsCodeDao {
	public List<RegionsCodeDao> findAll();
	public RegionsCodeDao findById(Integer id);
}
