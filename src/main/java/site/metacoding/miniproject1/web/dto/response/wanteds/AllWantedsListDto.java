package site.metacoding.miniproject1.web.dto.response.wanteds;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.miniproject1.web.dto.response.codes.AllCodesDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AllWantedsListDto {
    private List<WantedsListDto> wantedsLikeListDtos;
    private PagingWantedsListDto pagingWantedsListDto;
    private AllCodesDto allCodesDto; 
}
