package site.metacoding.miniproject1.web.dto.response.resume;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EducationDto {
	private Integer id;
	private Integer userId;
	private Integer resumeId;
	private Timestamp startdate;
	private Timestamp enddate;
	private String instruction;
	private String state;
}
