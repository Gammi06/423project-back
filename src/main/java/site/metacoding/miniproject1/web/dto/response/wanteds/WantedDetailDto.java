package site.metacoding.miniproject1.web.dto.response.wanteds;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.miniproject1.web.dto.response.mySkills.WantedsSkillsDto;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class WantedDetailDto {
	private Integer id;
	private String positionCodeName;
	private String careerCodeName;
	private String title;
	private String detail;
	private Integer viewCount;
	private Timestamp created;
	private Timestamp enddate;
	private Blob photo;
	private String companyName;
	private Integer companyId;
	private String regionCodeName;
	private Integer careerCodeId;
	private List<WantedsSkillsDto> mySkills;
}
