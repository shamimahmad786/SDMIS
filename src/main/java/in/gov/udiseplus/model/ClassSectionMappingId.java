package in.gov.udiseplus.model;

import java.io.Serializable;

public class ClassSectionMappingId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 756079790372723209L;

	private String udiseSchCode;
	
	private Integer schoolClassName;

	public String getUdiseSchCode() {
		return udiseSchCode;
	}

	public void setUdiseSchCode(String udiseSchCode) {
		this.udiseSchCode = udiseSchCode;
	}

	public Integer getSchoolClassName() {
		return schoolClassName;
	}

	public void setSchoolClassName(Integer schoolClassName) {
		this.schoolClassName = schoolClassName;
	}
	
}
