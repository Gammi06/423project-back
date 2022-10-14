package site.metacoding.miniproject1.domain.codes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.PositionCodeDto;

public interface PositionsCodeDao {
	public List<PositionCodeDto> findAll();
	public PositionCodeDto findById(Integer id);
}
