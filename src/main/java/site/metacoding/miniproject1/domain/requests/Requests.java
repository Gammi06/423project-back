package site.metacoding.miniproject1.domain.requests;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Requests {
	private Integer id;
	private Integer resumeId;
	private String status;
	private Timestamp created;
}
