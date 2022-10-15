package site.metacoding.miniproject1.web.dto.response.resume;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MySkillsDto {
	private Integer id;
	private Integer userId;
	private Integer resumeId;
	private Integer wantedId;
	private Integer skillsCodeId;
}
