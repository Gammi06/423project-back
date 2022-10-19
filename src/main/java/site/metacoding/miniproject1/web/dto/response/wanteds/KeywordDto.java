package site.metacoding.miniproject1.web.dto.response.wanteds;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// ?positionsCodeName=머시기&regionsCodeName=머시기&CarrerCodeName=머시기&skillsCodeName=머시기&skillsCodeName=머시기
@Setter
@Getter
public class KeywordDto {
	private String positionsCodeNames;
	private String regionsCodeNames;
	private String carrerCodeNames;
	private List<String> skillsCodeNames;
	private Integer page;
	private Integer startNum;
}
