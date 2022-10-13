package site.metacoding.miniproject1.web.dto.response;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StatusFinalInfoDto {
    private Integer id;
    private Integer wantedId;
    private Integer resumeId;
    private Integer state;
    private Timestamp created;
    private String positionCodeName;
    private Integer companyId;
    private String companyName;
}
