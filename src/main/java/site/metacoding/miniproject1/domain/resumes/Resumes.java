package site.metacoding.miniproject1.domain.resumes;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Resumes {
	private Integer id;
	private Integer user_id;
	private Integer positions_code_id;
	private String title;
	private String intro;
	private Integer status_id;
	private Timestamp created;
}
