package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.applicationStatus.ApplicationStatusDao;
import site.metacoding.miniproject1.web.dto.response.StatusAllDto;
import site.metacoding.miniproject1.web.dto.response.StatusCountDto;
import site.metacoding.miniproject1.web.dto.response.StatusInfoDto;

@RequiredArgsConstructor
@Service
public class MypageService {

    private final ApplicationStatusDao applicationStatusDao;

    public StatusAllDto viewAll(String keyword) {
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts();
        List<StatusInfoDto> statusInfoDtos = applicationStatusDao.findAll(keyword);
        StatusAllDto statusAllDto = new StatusAllDto(statusCountDtos, statusInfoDtos);
        return statusAllDto;
    }

}
