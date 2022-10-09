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
	private Integer user_id;
	private Integer resume_id;
	private Timestamp startdate;
	private Timestamp enddate;
	private String instruction;
	private String state;
}
