package site.metacoding.miniproject1.web.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StatusWaitingDto {

    private String keyword;
    private List<StatusCountDto> statusCountDtos;
    private List<StatusWaitingInfoDto> statusWaitingInfoDtos;

    public StatusWaitingDto(List<StatusCountDto> statusCountDtos, List<StatusWaitingInfoDto> statusWaitingInfoDtos) {
        this.statusCountDtos = statusCountDtos;
        this.statusWaitingInfoDtos = statusWaitingInfoDtos;
    }
}