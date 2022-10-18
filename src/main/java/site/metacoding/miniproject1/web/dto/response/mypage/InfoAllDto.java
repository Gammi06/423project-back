package site.metacoding.miniproject1.web.dto.response.mypage;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class InfoAllDto {

    private List<UserInfoDto> userInfoDtos;
    private List<InfoCountDto> infoCountDtos;
    private List<CompanyInfoDto> companyInfoDtos;
    private List<StatusCountDto> statusCountDtos;

}