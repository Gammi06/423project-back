package site.metacoding.miniproject1.domain.users;

import java.util.List;

public interface UsersDao {
	// 기본기능
	public void insert(Users users);
	public List<Users> findAll();
	public Users findById(Integer id);
	public void update(Integer id, Users users);
	public void deleteById(Integer id);
}
