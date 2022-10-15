package site.metacoding.miniproject1.domain.codes;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.codes.RegionsCodeDto;

public interface RegionsCodeDao {
	public List<RegionsCodeDto> findAll();
	public RegionsCodeDto findById(Integer id);
}
