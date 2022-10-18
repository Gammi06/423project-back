package site.metacoding.miniproject1.web.dto.request.users;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsersUpdateReqDto {
	private String userName;
	private String email;
	private String phoneNumber;
}
