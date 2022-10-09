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
	private String position_code_name;
	private Integer career_code_id;
	private String pay;
	private Integer company_id;
	private String title;
	private String detail;
	private Integer view_count;
	private Timestamp created;
	private Timestamp enddate;
	private Boolean checked;
}
