package site.metacoding.miniproject1.web.dto.response;

import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyInfoDto {
	private Integer id;
	private Integer no;
	private String companyName;
	private Blob photo;
	private String title;
	private String detail;
}
