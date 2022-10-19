package site.metacoding.miniproject1.web.dto.response.mySkills;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WantedsSkillsDto {
	private Integer id;
	private Integer wantedId;
	private Integer skillsCodeId;
	private String skillsCodeName;
}
