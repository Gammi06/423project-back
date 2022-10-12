package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.applicationStatus.ApplicationStatusDao;
import site.metacoding.miniproject1.web.dto.response.StatusDto;

@RequiredArgsConstructor
@Service
public class MypageService {

    private final ApplicationStatusDao applicationStatusDao;

    public List<StatusDto> viewall() {
        List<StatusDto> applicationStatusList = applicationStatusDao.findAll();
        return applicationStatusList;
    }

}
