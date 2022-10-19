package site.metacoding.miniproject1.web.dto.request.likes;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LikesStateDto {
	private Integer Id;
	private Double datePart;
	private String day;
	private Timestamp currnetTimestamp;
	private Timestamp created;
	private Timestamp enddate;
	private String state;
	
	
}

