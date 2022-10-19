package site.metacoding.miniproject1.web.dto.response.wanteds;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KeywordDto {
	private String positionsCodeName;
	private String regionsCodeName;
	private String CarrerCodeName;
	private List<String> skillsCodeName;
}
