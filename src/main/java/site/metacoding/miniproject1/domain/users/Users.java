package site.metacoding.miniproject1.domain.users;

import java.sql.Blob;
import java.sql.Timestamp;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.miniproject1.web.dto.request.users.UsersUpdateReqDto;

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

	public void update(UsersUpdateReqDto updateReqDto) {
		this.userName = updateReqDto.getUserName();
		this.email = updateReqDto.getEmail();
		this.phoneNumber = updateReqDto.getPhoneNumber();
	}

}
