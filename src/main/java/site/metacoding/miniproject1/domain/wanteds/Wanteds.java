package site.metacoding.miniproject1.domain.wanteds;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Wanteds {
	private Integer id;
	private Integer positionCodeId;
	private String position_code_name;
	private Integer careerCodeId;
	private String pay;
	private Integer companyId;
	private String title;
	private String detail;
	private Integer viewCount;
	private Timestamp created;
	private Timestamp enddate;
	private Boolean checked;
}
