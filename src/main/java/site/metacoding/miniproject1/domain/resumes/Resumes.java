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
	private Integer userId;
	private Integer positionsCodeId;
	private String title;
	private String intro;
	private Integer statusId;
	private Timestamp created;
}
