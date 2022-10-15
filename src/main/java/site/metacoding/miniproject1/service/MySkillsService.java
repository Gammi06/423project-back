package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.mySkills.MyskillsDao;
import site.metacoding.miniproject1.web.dto.response.mySkills.WantedsSkillsDto;

@RequiredArgsConstructor
@Service
public class MySkillsService {
	private final MyskillsDao myskillsDao;
	
	public List<WantedsSkillsDto> findMySkillByWantedId(Integer wantedId){
		List<WantedsSkillsDto> wantedsSkillsPS = myskillsDao.findMySkillByWantedId(wantedId);
		if(wantedsSkillsPS == null) {
			return null;
		}
		return wantedsSkillsPS;
	}
}
