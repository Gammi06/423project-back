package site.metacoding.miniproject1.domain.likes;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Likes {
	private Integer id;
	private Integer user_id;
	private Integer wanted_id;
	private Timestamp created;
}
