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
public class RequestsInfoDto {
    private Integer id;
    private Integer resumeId;
    private Integer wantedId;
    private String status;
    private Timestamp created;
    private String positionCodeName;
    private Integer careerCodeId;
    private Integer companyId;
    private String companyName;
}
