package site.metacoding.miniproject1.web.dto.response.codes;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.miniproject1.domain.codes.CareersCode;

@Getter
@Setter
public class AllCodesDto {
	private List<CareersCodeDto> careersCodeDtos;
	private List<PositionsCodeDto> positionsCodeDtos;
	private List<SkillsCodeDto> skillsCodeDtos;
	private List<RegionsCodeDto> regionsCodeDtos;
}
