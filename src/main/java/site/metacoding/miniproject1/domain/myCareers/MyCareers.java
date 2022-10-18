package site.metacoding.miniproject1.domain.myCareers;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class MyCareers {
	private Integer id;
	private Integer userId;
	private Integer resumeId;
	private Timestamp startDate;
	private Timestamp endDate;
	private String companyName;
}
