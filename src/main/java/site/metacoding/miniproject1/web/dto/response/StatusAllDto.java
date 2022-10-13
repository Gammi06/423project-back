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
public class StatusAllDto {

    private String keyword;
    private List<StatusCountDto> statusCountDtos;
    private List<StatusInfoDto> statusInfoDtos;

    public StatusAllDto(List<StatusCountDto> statusCountDtos, List<StatusInfoDto> statusInfoDtos) {
        this.statusCountDtos = statusCountDtos;
        this.statusInfoDtos = statusInfoDtos;
    }
}