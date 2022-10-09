package site.metacoding.miniproject1.domain.matchings;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Matchings {
	private Integer id;
	private Integer resume_id;
	private Integer wanted_id;
	private Timestamp created;
}
