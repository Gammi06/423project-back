package site.metacoding.miniproject1.domain.educations;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Educations {
	private Integer id;
	private Integer userId;
	private Integer resumeId;
	private Timestamp startDate;
	private Timestamp endDate;
	private String instruction;
	private String state;
}
