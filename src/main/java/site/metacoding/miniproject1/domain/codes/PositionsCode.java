package site.metacoding.miniproject1.domain.codes;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class PositionsCode {
	private Integer id;
	private String name;
	private Timestamp created;
}
