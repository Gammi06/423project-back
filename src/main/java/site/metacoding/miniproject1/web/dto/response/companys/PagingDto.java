package site.metacoding.miniproject1.web.dto.response.companys;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PagingDto {
	private Integer blockCount;		// 상수 한페이지에 페이지 넘수 개수(16) 1-16
	private Integer currentBlock; 	// 변수
	private Integer startPageNum; 	// 변수 1 -> 17 -> 33
	private Integer lastPageNum;	// 변수 16 -> 32 -> 48
	private Integer totalCount;
	private Integer totalPage;
	private Integer currentPage;
	private boolean isLast; 		// getter가 만들어지면 isLast() 이름으로 만들어짐. -> el에서는 last로 찾음
	private boolean isFirst; 		// getter가 만들어지면 isFirst() 이름으로 만들어짐. -> el에서는 first로 찾음 
}
