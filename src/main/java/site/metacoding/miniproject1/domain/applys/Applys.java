package site.metacoding.miniproject1.domain.applys;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Applys {
	private Integer id;
	private Integer wantedId;
	private Integer status;
	private Timestamp created;
}
