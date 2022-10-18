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
	private String userId;
	private String userPassword;
	private String userName;
	private Integer age;
	private String phoneNumber;
	private String email;
	private Blob photo;
	private Integer positionCodeId;
	private Integer companyId;
	private Integer mycareerId;
	private Timestamp created;
	
}
