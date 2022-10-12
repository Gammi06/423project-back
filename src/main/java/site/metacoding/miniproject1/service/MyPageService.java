package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.applicationStatus.ApplicationStatusDao;
import site.metacoding.miniproject1.web.dto.response.StatusAllDto;
import site.metacoding.miniproject1.web.dto.response.StatusCountDto;
import site.metacoding.miniproject1.web.dto.response.StatusFinalDto;
import site.metacoding.miniproject1.web.dto.response.StatusFinalInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusWaitingDto;
import site.metacoding.miniproject1.web.dto.response.StatusWaitingInfoDto;

@RequiredArgsConstructor
@Service
public class MyPageService {

    private final ApplicationStatusDao applicationStatusDao;

    public StatusAllDto viewAll(String keyword) {
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts();
        List<StatusInfoDto> statusInfoDtos = applicationStatusDao.findAll(keyword);
        StatusAllDto statusAllDto = new StatusAllDto(statusCountDtos, statusInfoDtos);
        return statusAllDto;
    }

    public StatusWaitingDto viewWaiting(String keyword) {
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts();
        List<StatusWaitingInfoDto> statusWaitingInfoDtos = applicationStatusDao.findWaiting(keyword);
        StatusWaitingDto statusWaitingDto = new StatusWaitingDto(statusCountDtos, statusWaitingInfoDtos);
        return statusWaitingDto;
    }
    
    public StatusFinalDto viewFinal(String keyword) {
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts();
        List<StatusFinalInfoDto> statusFinalInfoDtos = applicationStatusDao.findFinal(keyword);
        StatusFinalDto statusFinalDto = new StatusFinalDto(statusCountDtos, statusFinalInfoDtos);
        return statusFinalDto;
    }

}
