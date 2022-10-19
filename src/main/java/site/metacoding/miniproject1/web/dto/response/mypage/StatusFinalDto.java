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
public class StatusFinalDto {

  private String keyword;
  private Integer id;
  private List<StatusCountDto> statusCountDtos;
  private List<StatusFinalInfoDto> statusFinalInfoDtos;

  public StatusFinalDto(List<StatusCountDto> statusCountDtos, List<StatusFinalInfoDto> statusFinalInfoDtos) {
    this.statusCountDtos = statusCountDtos;
    this.statusFinalInfoDtos = statusFinalInfoDtos;
  }
}