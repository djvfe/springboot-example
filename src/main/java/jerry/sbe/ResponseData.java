package jerry.sbe;

public class ResponseData {
	private boolean status;
	private int code;
	private String message;
	private Object data;
	
	public ResponseData() {}
	public ResponseData(boolean status,ResponseDataCode code,String message,Object data) {
		this.status = status;
		this.code = code.getCode();
		this.message = message;
		this.data = data;
	}
	public ResponseData(Object data) {
		this(true,ResponseDataCode.SUCCESS,"",data);
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getCode() {
		return code;
	}
	public void setCode(ResponseDataCode code) {
		this.code = code.getCode();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
