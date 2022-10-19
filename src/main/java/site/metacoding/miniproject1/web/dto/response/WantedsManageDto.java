package site.metacoding.miniproject1.web.dto.response;

import java.sql.Blob;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class WantedsManageDto {
	private Integer id;
	private Integer positionCodeId;
	private String positionName;
	private Integer careerCodeId;
	private String careerName;
	private Integer companyId;
	private Integer no;
	private String companyName;
	private Blob photo;
	private String title;
	private String detail;
	private Timestamp enddate;
	private String state; //모집중/마감
}