package site.metacoding.miniproject1.domain.codes;

import java.util.List;


public interface CareersCodeDao {
	public List<CareersCodeDao> findAll();
	public CareersCodeDao findById(Integer id);
}
