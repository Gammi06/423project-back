package site.metacoding.miniproject1.web.dto.request.likes;

import java.sql.Blob;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LikesRespListDto {
	private Integer companysId;
	private String title;
	private String detail;
	private String companyName;
	private Blob photo;//사진!
	private Integer Id;
	private Double datePart;
	private String day;
	private Timestamp currnetTimestamp;
	private Timestamp created;
	private Timestamp enddate;
	private String state;
	
	public void LikesRespListDto(LikesStateDto likesStateDto) {
		this.Id = likesStateDto.getId();
		this.datePart = likesStateDto.getDatePart();
		this.day = likesStateDto.getDay();
		this.currnetTimestamp = likesStateDto.getCurrnetTimestamp();
		this.created = likesStateDto.getCreated();
		this.enddate = likesStateDto.getEnddate();
		this.state = likesStateDto.getState();
	}
	
}
//회사이름 / 원티드 제목 소개글