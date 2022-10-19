package site.metacoding.miniproject1.domain.codes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.codes.PositionsCodeDto;

public interface PositionsCodeDao {
	public List<PositionsCodeDto> findAll();
	public PositionsCodeDto findById(Integer id);
}
