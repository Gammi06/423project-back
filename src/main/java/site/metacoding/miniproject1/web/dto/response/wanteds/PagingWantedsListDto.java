package site.metacoding.miniproject1.web.dto.response.wanteds;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PagingWantedsListDto {
	private List<WantedsListDto> wantedsListDtos;
	private PagingDto pagingDto;
}
