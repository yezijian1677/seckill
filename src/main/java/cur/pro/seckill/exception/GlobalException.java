package cur.pro.seckill.exception;


import cur.pro.seckill.result.CodeMsg;
import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException{

	private final transient CodeMsg codeMsg;

	public GlobalException(CodeMsg codeMsg) {
		super(codeMsg.toString());
		this.codeMsg = codeMsg;
	}
}
