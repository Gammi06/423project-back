package site.metacoding.miniproject1.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.users.UsersDao;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersDao usersDao;

}
