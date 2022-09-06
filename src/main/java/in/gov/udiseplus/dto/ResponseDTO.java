package in.gov.udiseplus.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import in.gov.udiseplus.constants.Messages;
import in.gov.udiseplus.model.StudentDetails;

public class ResponseDTO {
	
	@JsonInclude(Include.NON_NULL)
	private Integer statusCode;
	@JsonInclude(Include.NON_NULL)
	private String statusMessage;

	private StudentDetails studentDetails;
	
	private Object resObject;
	
	public ResponseDTO(Messages messages,Object resObject) {
		super();
		this.statusCode = messages.getStatusCode();
		this.statusMessage = messages.getStatusMessage();
		this.resObject=resObject;
	}
	
	public ResponseDTO(Messages messages) {
		super();
		this.statusCode = messages.getStatusCode();
		this.statusMessage = messages.getStatusMessage();
//		this.resObject=resObject;
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

	public StudentDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public Object getResObject() {
		return resObject;
	}

	public void setResObject(Object resObject) {
		this.resObject = resObject;
	}
	
	
	
}
