package site.metacoding.miniproject1.domain.subcribes;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Subcribes {
	private Integer id;
	private Integer user_id;
	private Integer company_id;
	private Timestamp created;
}
