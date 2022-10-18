package site.metacoding.miniproject1.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.users.Users;
import site.metacoding.miniproject1.domain.users.UsersDao;
import site.metacoding.miniproject1.web.dto.request.users.UsersLoginReqDto;
import site.metacoding.miniproject1.web.dto.request.users.UsersPasswordReqDto;
import site.metacoding.miniproject1.web.dto.request.users.UsersUpdateReqDto;

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

	public Users 기본정보수정(Integer id, UsersUpdateReqDto usersUpdateReqDto) {
		Users usersPs = usersDao.findById(id);
		usersPs.update(usersUpdateReqDto);
		usersDao.update(usersPs);

		return usersPs;
	}

	public Users 기본정보보기(Integer id) {
		Users usersPs = usersDao.findById(id);
		return usersPs;
	}

	public Users 비밀번호설정(Integer id, UsersPasswordReqDto passwordReqDto) {
		Users usersPs = usersDao.findById(id);
		usersPs.update(passwordReqDto);
		usersDao.updateByPassword(usersPs);

		return usersPs;
	}
	
	public void 탈퇴하기() {}

}
