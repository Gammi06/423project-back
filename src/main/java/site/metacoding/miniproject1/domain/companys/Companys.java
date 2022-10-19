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
	private String companyName;
	private String address;
	private String email;
	private String companyNumber;
	private Blob photo;
	private String regionCodeName;
	private String intro;
	private Integer years;
	private Integer memberCount;
	private Timestamp created;
}
