package site.metacoding.miniproject1.domain.companys;

import java.util.List;

import site.metacoding.miniproject1.web.dto.response.companys.CompanyDetailDto;

public interface CompanysDao {
	// 기본기능
	public void insert(Companys companys);
	public List<Companys> findAll();
	public void update(Integer id, Companys companys);
	public void deleteById(Integer id);
	
	public CompanyDetailDto findByIdToDetail(Integer id);
}
