package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.applicationStatus.ApplicationStatusDao;
import site.metacoding.miniproject1.web.dto.response.CompanyInfoDto;
import site.metacoding.miniproject1.web.dto.response.InfoAllDto;
import site.metacoding.miniproject1.web.dto.response.InfoCountDto;
import site.metacoding.miniproject1.web.dto.response.RequestsDto;
import site.metacoding.miniproject1.web.dto.response.RequestsInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusAllDto;
import site.metacoding.miniproject1.web.dto.response.StatusCountDto;
import site.metacoding.miniproject1.web.dto.response.StatusFinalDto;
import site.metacoding.miniproject1.web.dto.response.StatusFinalInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusInfoDto;
import site.metacoding.miniproject1.web.dto.response.StatusWaitingDto;
import site.metacoding.miniproject1.web.dto.response.StatusWaitingInfoDto;
import site.metacoding.miniproject1.web.dto.response.UserInfoDto;

@RequiredArgsConstructor
@Service
public class MyPageService {

    private final ApplicationStatusDao applicationStatusDao;

    public InfoAllDto viewMyPage(Integer id) {
        List<UserInfoDto> userInfoDtos = applicationStatusDao.findUser(id);
        List<InfoCountDto> infoCountDtos = applicationStatusDao.findInfoCounts(id);
        List<CompanyInfoDto> companyInfoDtos = applicationStatusDao.findCompany(id);
        if(companyInfoDtos.size() == 0) {
        	companyInfoDtos = applicationStatusDao.findCompanyIfNull();
        }
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts(id);
        InfoAllDto infoAllDto = new InfoAllDto(userInfoDtos, infoCountDtos, companyInfoDtos, statusCountDtos);
        return infoAllDto;
    }

    public StatusAllDto viewAll(Integer id, String keyword) {
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts(id);
        List<StatusInfoDto> statusInfoDtos = applicationStatusDao.findAll(id, keyword);
        StatusAllDto statusAllDto = new StatusAllDto(statusCountDtos, statusInfoDtos);
        return statusAllDto;
    }

    public StatusWaitingDto viewWaiting(Integer id, String keyword) {
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts(id);
        List<StatusWaitingInfoDto> statusWaitingInfoDtos = applicationStatusDao.findWaiting(id, keyword);
        StatusWaitingDto statusWaitingDto = new StatusWaitingDto(statusCountDtos, statusWaitingInfoDtos);
        return statusWaitingDto;
    }

    public StatusFinalDto viewFinal(Integer id, String keyword) {
        List<StatusCountDto> statusCountDtos = applicationStatusDao.findCounts(id);
        List<StatusFinalInfoDto> statusFinalInfoDtos = applicationStatusDao.findFinal(id, keyword);
        StatusFinalDto statusFinalDto = new StatusFinalDto(statusCountDtos, statusFinalInfoDtos);
        return statusFinalDto;
    }

    public RequestsDto viewRequests(Integer id, String keyword) {
        List<RequestsInfoDto> requestsInfoDtos = applicationStatusDao.findRequest(id, keyword);
        RequestsDto requestsDto = new RequestsDto(requestsInfoDtos);
        return requestsDto;
    }

}
