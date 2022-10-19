package site.metacoding.miniproject1.web.dto.response.subscribes;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SubscribesRespListDto {
	private Integer companysId;
	private String companyName;
	private Integer Id;
	private Double datePart;
	private String day;
	private Timestamp currnetTimestamp;
	private Timestamp created;
	private Timestamp enddate;
	private String state;

}
