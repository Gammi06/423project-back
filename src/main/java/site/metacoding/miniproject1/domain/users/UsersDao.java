package site.metacoding.miniproject1.domain.users;

import java.util.List;

public interface UsersDao {
	// 기본기능
	public void insert(Users users);
	public List<Users> findAll();
	public Users findById(Integer id);
	public void update(Users users);
	public void deleteById(Integer id);
	
	// 로그인을 위한 Dao
	public Users findByUserId(String userId); 
	
	// 비밀번호 수정을 위한 Dao
	public void updateByPassword(Users users);
}
