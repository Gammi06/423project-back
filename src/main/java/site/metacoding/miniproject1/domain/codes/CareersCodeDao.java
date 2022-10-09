package site.metacoding.miniproject1.domain.codes;

import java.util.List;

public interface CareersCodeDao {
	public List<CareersCode> findAll();
	public CareersCode findById(Integer id);
}
