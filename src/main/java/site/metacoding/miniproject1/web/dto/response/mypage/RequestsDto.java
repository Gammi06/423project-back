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
public class RequestsDto {
    private String keyword;
    private List<RequestsInfoDto> requestsInfoDtos;

    public RequestsDto(List<RequestsInfoDto> requestsInfoDtos) {
        this.requestsInfoDtos = requestsInfoDtos;
    }
}
