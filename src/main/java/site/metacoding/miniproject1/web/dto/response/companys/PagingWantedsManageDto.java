package site.metacoding.miniproject1.web.dto.response.companys;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.miniproject1.web.dto.response.wanteds.WantedsManageDto;

@Setter
@Getter
public class PagingWantedsManageDto {
	private List<WantedsManageDto> wantedsManageDtos;
	private PagingDto pagingDto;

}
