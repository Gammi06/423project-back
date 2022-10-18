package site.metacoding.miniproject1.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class InfoCountDto {
    private Integer id;
    private Integer statusAll;
    private Integer likesCount;
    private Integer subscribesCount;
    private Integer requestsCount;
}
