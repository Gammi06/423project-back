package site.metacoding.miniproject1.web.dto.response.resume;

import java.sql.Blob;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResumeUpdateDto {
	private Integer id;
	private String title;
	private Blob photo;
	private String userName;
	private String email;
	private String phoneNumber;
	private String intro;
}
