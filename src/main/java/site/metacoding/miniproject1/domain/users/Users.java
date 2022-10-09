package site.metacoding.miniproject1.domain.users;

import java.sql.Blob;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Users {
	private Integer id;
	private String user_id;
	private String user_password;
	private String user_name;
	private Integer age;
	private String phone_number;
	private String email;
	private Blob photo;
	private String position_code_name;
	private Integer company_id;
	private Integer mycareer_id;
	private Timestamp created;
}
