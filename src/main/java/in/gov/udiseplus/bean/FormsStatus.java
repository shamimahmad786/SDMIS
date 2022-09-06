package in.gov.udiseplus.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormsStatus {
	private Integer academic_details_form;
	private Integer parent_deails_form;
	private Integer no_dues_form;
	private Integer student_details_form;
	private Integer tc_status;
	private Integer form_type;
	private Integer id;
	
	
	@JsonProperty(value="academicDetailsForm", access=JsonProperty.Access.READ_ONLY)
	public Integer getAcademic_details_form() {
		return academic_details_form;
	}
	@JsonProperty(value="academic_details_form", access=JsonProperty.Access.WRITE_ONLY)
	public void setAcademic_details_form(Integer academic_details_form) {
		this.academic_details_form = academic_details_form;
	}
	@JsonProperty(value="parentDeailsForm", access=JsonProperty.Access.READ_ONLY)
	public Integer getParent_deails_form() {
		return parent_deails_form;
	}
	@JsonProperty(value="parent_deails_form", access=JsonProperty.Access.WRITE_ONLY)
	public void setParent_deails_form(Integer parent_deails_form) {
		this.parent_deails_form = parent_deails_form;
	}
	@JsonProperty(value="noDuesForm", access=JsonProperty.Access.READ_ONLY)
	public Integer getNo_dues_form() {
		return no_dues_form;
	}
	@JsonProperty(value="no_dues_form", access=JsonProperty.Access.WRITE_ONLY)
	public void setNo_dues_form(Integer no_dues_form) {
		this.no_dues_form = no_dues_form;
	}
	@JsonProperty(value="studentDetailsForm", access=JsonProperty.Access.READ_ONLY)
	public Integer getStudent_details_form() {
		return student_details_form;
	}
	@JsonProperty(value="student_details_form", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_details_form(Integer student_details_form) {
		this.student_details_form = student_details_form;
	}
	@JsonProperty(value="tcStatus", access=JsonProperty.Access.READ_ONLY)
	public Integer getTc_status() {
		return tc_status;
	}
	@JsonProperty(value="tc_status", access=JsonProperty.Access.WRITE_ONLY)
	public void setTc_status(Integer tc_status) {
		this.tc_status = tc_status;
	}
	@JsonProperty(value="formType", access=JsonProperty.Access.READ_ONLY)
	public Integer getForm_type() {
		return form_type;
	}
	@JsonProperty(value="form_type", access=JsonProperty.Access.WRITE_ONLY)
	public void setForm_type(Integer form_type) {
		this.form_type = form_type;
	}
	@JsonProperty(value="id", access=JsonProperty.Access.READ_ONLY)
	public Integer getId() {
		return id;
	}
	@JsonProperty(value="id", access=JsonProperty.Access.WRITE_ONLY)
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
