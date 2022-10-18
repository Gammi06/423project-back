package site.metacoding.miniproject1.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.users.Users;
import site.metacoding.miniproject1.domain.users.UsersDao;
import site.metacoding.miniproject1.web.dto.request.users.UsersLoginReqDto;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersDao usersDao;

	public Users 로그인(UsersLoginReqDto usersLoginReqDto) {
		Users usersPS = usersDao.findByUserId(usersLoginReqDto.getUserId());
		// if로 usersPS의 password와 Dto의 password 비교
		if (usersPS == null) {
			return null;
		}
		if (usersPS.getUserPassword().equals(usersLoginReqDto.getUserPassword())) {
			return usersPS;
		} else {
			return null;
		}
	}
}
