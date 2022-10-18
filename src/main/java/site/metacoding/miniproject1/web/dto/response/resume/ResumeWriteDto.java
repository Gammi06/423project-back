package site.metacoding.miniproject1.web.dto.response.resume;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResumeWriteDto {
	private Integer id;
	private String title;
	private String userName;
	private String email;
	private String phoneNumber;
	private String intro;
}
