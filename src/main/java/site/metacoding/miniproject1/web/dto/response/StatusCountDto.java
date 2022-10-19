package site.metacoding.miniproject1.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StatusCountDto {
    private Integer id;
    private Integer statusAll;
    private Integer statusC;
    private Integer statusFinal;
}
