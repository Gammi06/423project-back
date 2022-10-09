package site.metacoding.miniproject1.domain.codes;

import java.util.List;

public interface PositionsCodeDao {
	public List<PositionsCode> findAll();
	public PositionsCode findById(Integer id);
}
