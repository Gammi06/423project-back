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
public class UserInfoDto {
    private Integer id;
    private String user_name;
    private String phone_number;
	private String email;
	private Blob photo;
	private String position_code_name;
}
