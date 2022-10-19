package site.metacoding.miniproject1.domain.applicationStatus;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ApplicationStatus {
	private Integer id;
	private Integer wantedId;
	private Integer state;
	private Timestamp created;
}
