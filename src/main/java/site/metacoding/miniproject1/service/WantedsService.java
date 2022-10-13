package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.wanteds.WantedsDao;
import site.metacoding.miniproject1.web.dto.response.WantedsListDto;

@RequiredArgsConstructor
@Service
public class WantedsService {
	private final WantedsDao wantedsDao;

	public List<WantedsListDto> findAllHot(){
		List<WantedsListDto> wantedsDtos = wantedsDao.findAllHot();
		return wantedsDtos;
	}
}
