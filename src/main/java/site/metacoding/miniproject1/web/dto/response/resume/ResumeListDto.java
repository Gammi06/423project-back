package site.metacoding.miniproject1.web.dto.response.resume;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResumeListDto {
	private Integer id;
	private String title;
	private Timestamp created;
	private Timestamp statusId;
}
