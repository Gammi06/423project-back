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
public class WantedsListDto {
	private Integer totalCount;
	private Integer id;
	private Integer positionCodeId;
	private Integer careerCodeId;
	private String title;
	private String detail;
	private Integer viewCount;
	private Timestamp created;
	private Timestamp enddate;
	private Blob photo;
	private String companyName;
	private String regionCodeName;
	private List<WantedsSkillsDto> mySkills;
}
