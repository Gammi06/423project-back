package site.metacoding.miniproject1.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CMRespDto<T> {
	private Integer code;
	private String msg;
	private T data;
}
