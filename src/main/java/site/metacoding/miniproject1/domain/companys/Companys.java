package site.metacoding.miniproject1.domain.companys;

import java.sql.Blob;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Companys {
	private Integer id;
	private String company_name;
	private String address;
	private String email;
	private String company_number;
	private Blob photo;
	private String region_code_name;
	private String intro;
	private Integer years;
	private Integer member_count;
	private Timestamp created;
}
