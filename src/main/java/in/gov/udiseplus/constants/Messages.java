package in.gov.udiseplus.constants;

public enum Messages {

	SUCCESS(200, "Successful"), 
	EXCEPTION(400, "Some Error Occurred"),
	ERROR(500, "Something Gone wrong");
	
	
	private Integer statusCode;
	private String statusMessage;
	private String responseData;

	private Messages(Integer statusCode, String statusMessage) {
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	
	

}
