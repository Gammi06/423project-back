package site.metacoding.miniproject1.web.dto.request.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersLoginReqDto {
	private String userId;
	private String userPassword;
	private boolean remember;
}
