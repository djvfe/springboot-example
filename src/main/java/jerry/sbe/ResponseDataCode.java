package jerry.sbe;

import javax.servlet.http.HttpServletResponse;

public class ResponseDataCode {
	private int code = 200;
	public static final ResponseDataCode  SUCCESS = new ResponseDataCode(200);
	public static final ResponseDataCode  NOT_FOUND = new ResponseDataCode(404);
	public static final ResponseDataCode  SC_INTERNAL_SERVER_ERROR = new ResponseDataCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	private ResponseDataCode() {}
	private ResponseDataCode(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
}
