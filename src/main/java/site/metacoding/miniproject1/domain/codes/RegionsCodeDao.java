package site.metacoding.miniproject1.domain.codes;

import java.util.List;

public interface RegionsCodeDao {
	public List<RegionsCode> findAll();
	public RegionsCode findById(Integer id);
}
