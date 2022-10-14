package site.metacoding.miniproject1.web.dto.response;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PositionCodeDto {
	private Integer id;
	private String name;
	private Timestamp created;
}
