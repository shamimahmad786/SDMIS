package in.gov.udiseplus.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class ApplidedTc {
//	@JsonProperty("student_id")
	private Integer student_id;
//	@JsonProperty("student_name")
	private String student_name;
//	@JsonProperty("student_dob")
	private Date student_dob;
//	@JsonProperty("student_category")
	private Integer student_category;
//	@JsonProperty("student_blood_group")
	private String student_blood_group;
//	@JsonProperty("admission_num")
	private String admission_num;
//	@JsonProperty("state_id")
	private String state_id;
//	@JsonProperty("district_id")
	private Integer district_id;
//	@JsonProperty("udise_state_code")
	private String udise_state_code;
//	@JsonProperty("udise_district_code")
	private String udise_district_code;
//	@JsonProperty("school_id")
	private Integer school_id;
	
	private String school_name;
//	@JsonProperty("udise_sch_code")
	private String udise_sch_code;
//	@JsonProperty("student_address")
	private String student_address;
//	@JsonProperty("tc_reason")
	private String tc_reason;
//	@JsonProperty("applicant_userid")
	private String applicant_userid;
//	@JsonProperty("tc_id")
	private String tc_id;
//	@JsonProperty("student_relationship")
	private Integer student_relationship;
//	@JsonProperty("pincode")
	private String pincode;
	
	private String postOffice;
	
//	@JsonProperty("student_address2")
	private String student_address2;
//	@JsonProperty("student_nationality")
	private String student_nationality;
//	@JsonProperty("student_details_form")
	private Integer student_details_form;
//	@JsonProperty("academic_details_form")
	private Integer academic_details_form;
//	@JsonProperty("parent_deails_form")
	private Integer parent_deails_form;
//	@JsonProperty("no_dues_form")
	private Integer no_dues_form;
//	@JsonProperty("tc_status")
	private Integer tc_status;
	
	private Integer id;
	
	private Integer teacher_form;
	
//	@JsonProperty("is_modified")
	private String is_modified;
//	@JsonProperty("created_by")
	private String created_by;
//	@JsonProperty("created_time")
	private String created_time;
//	@JsonProperty("modified_by")
	private String modified_by;
//	@JsonProperty("modified_time")
	private String modified_time;
	
	@JsonProperty(value="studentId", access=JsonProperty.Access.READ_ONLY)
	public Integer getStudent_id() {
		return student_id;
	}
	@JsonProperty(value="student_id", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	@JsonProperty(value="studentName", access=JsonProperty.Access.READ_ONLY)
	public String getStudentName() {
		return student_name;
	}
	@JsonProperty(value="student_name", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudentName(String studentName) {
		this.student_name = studentName;
	}
	@JsonProperty(value="studentDob", access=JsonProperty.Access.READ_ONLY)
	public Date getStudentDob() {
		return student_dob;
	}
	@JsonProperty(value="student_dob", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudentDob(Date studentDob) {
		this.student_dob = studentDob;
	}
	@JsonProperty(value="studentCategory", access=JsonProperty.Access.READ_ONLY)
	public Integer getStudent_category() {
		return student_category;
	}
	@JsonProperty(value="student_category", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_category(Integer student_category) {
		this.student_category = student_category;
	}
	@JsonProperty(value="studentBloodGroup", access=JsonProperty.Access.READ_ONLY)
	public String getStudent_blood_group() {
		return student_blood_group;
	}
	@JsonProperty(value="student_blood_group", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_blood_group(String student_blood_group) {
		this.student_blood_group = student_blood_group;
	}
	@JsonProperty(value="admissionNumber", access=JsonProperty.Access.READ_ONLY)
	public String getAdmission_num() {
		return admission_num;
	}
	
	@JsonProperty(value="admission_num", access=JsonProperty.Access.WRITE_ONLY)
	public void setAdmission_num(String admission_num) {
		this.admission_num = admission_num;
	}
	@JsonProperty(value="stateId", access=JsonProperty.Access.READ_ONLY)
	public String getState_id() {
		return state_id;
	}
	@JsonProperty(value="state_id", access=JsonProperty.Access.WRITE_ONLY)
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	@JsonProperty(value="districtId", access=JsonProperty.Access.READ_ONLY)
	public Integer getDistrict_id() {
		return district_id;
	}
	@JsonProperty(value="district_id", access=JsonProperty.Access.WRITE_ONLY)
	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}
	@JsonProperty(value="udiseStateCode", access=JsonProperty.Access.READ_ONLY)
	public String getUdise_state_code() {
		return udise_state_code;
	}
	@JsonProperty(value="udise_state_code", access=JsonProperty.Access.WRITE_ONLY)
	public void setUdise_state_code(String udise_state_code) {
		this.udise_state_code = udise_state_code;
	}
	@JsonProperty(value="udiseDistrictCode", access=JsonProperty.Access.READ_ONLY)
	public String getUdise_district_code() {
		return udise_district_code;
	}
	@JsonProperty(value="udise_district_code", access=JsonProperty.Access.WRITE_ONLY)
	public void setUdise_district_code(String udise_district_code) {
		this.udise_district_code = udise_district_code;
	}
	@JsonProperty(value="schoolId", access=JsonProperty.Access.READ_ONLY)
	public Integer getSchool_id() {
		return school_id;
	}
	@JsonProperty(value="school_id", access=JsonProperty.Access.WRITE_ONLY)
	public void setSchool_id(Integer school_id) {
		this.school_id = school_id;
	}
	@JsonProperty(value="udiseSchCode", access=JsonProperty.Access.READ_ONLY)
	public String getUdise_sch_code() {
		return udise_sch_code;
	}
	@JsonProperty(value="udise_sch_code", access=JsonProperty.Access.WRITE_ONLY)
	public void setUdise_sch_code(String udise_sch_code) {
		this.udise_sch_code = udise_sch_code;
	}
	@JsonProperty(value="studentAddress", access=JsonProperty.Access.READ_ONLY)
	public String getStudent_address() {
		return student_address;
	}
	@JsonProperty(value="student_address", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	@JsonProperty(value="tcReason", access=JsonProperty.Access.READ_ONLY)
	public String getTc_reason() {
		return tc_reason;
	}
	@JsonProperty(value="tc_reason", access=JsonProperty.Access.WRITE_ONLY)
	public void setTc_reason(String tc_reason) {
		this.tc_reason = tc_reason;
	}
	@JsonProperty(value="applicantUserid", access=JsonProperty.Access.READ_ONLY)
	public String getApplicant_userid() {
		return applicant_userid;
	}
	@JsonProperty(value="applicant_userid", access=JsonProperty.Access.WRITE_ONLY)
	public void setApplicant_userid(String applicant_userid) {
		this.applicant_userid = applicant_userid;
	}
	@JsonProperty(value="tcId", access=JsonProperty.Access.READ_ONLY)
	public String getTc_id() {
		return tc_id;
	}
	@JsonProperty(value="tc_id", access=JsonProperty.Access.WRITE_ONLY)
	public void setTc_id(String tc_id) {
		this.tc_id = tc_id;
	}
	@JsonProperty(value="studentRelationship", access=JsonProperty.Access.READ_ONLY)
	public Integer getStudent_relationship() {
		return student_relationship;
	}
	@JsonProperty(value="student_relationship", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_relationship(Integer student_relationship) {
		this.student_relationship = student_relationship;
	}
	@JsonProperty(value="pincode", access=JsonProperty.Access.READ_ONLY)
	public String getPincode() {
		return pincode;
	}
	@JsonProperty(value="pincode", access=JsonProperty.Access.WRITE_ONLY)
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@JsonProperty(value="studentAddress2", access=JsonProperty.Access.READ_ONLY)
	public String getStudent_address2() {
		return student_address2;
	}
	@JsonProperty(value="student_address2", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_address2(String student_address2) {
		this.student_address2 = student_address2;
	}
	@JsonProperty(value="studentNationality", access=JsonProperty.Access.READ_ONLY)
	public String getStudent_nationality() {
		return student_nationality;
	}
	@JsonProperty(value="student_nationality", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_nationality(String student_nationality) {
		this.student_nationality = student_nationality;
	}
	@JsonProperty(value="studentDetailsForm", access=JsonProperty.Access.READ_ONLY)
	public Integer getStudent_details_form() {
		return student_details_form;
	}
	@JsonProperty(value="student_details_form", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_details_form(Integer student_details_form) {
		this.student_details_form = student_details_form;
	}
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
	@JsonProperty(value="tcStatus", access=JsonProperty.Access.READ_ONLY)
	public Integer getTc_status() {
		return tc_status;
	}
	@JsonProperty(value="tc_status", access=JsonProperty.Access.WRITE_ONLY)
	public void setTc_status(Integer tc_status) {
		this.tc_status = tc_status;
	}
	@JsonProperty(value="isModified", access=JsonProperty.Access.READ_ONLY)
	public String getIsModified() {
		return is_modified;
	}
	@JsonProperty(value="is_modified", access=JsonProperty.Access.WRITE_ONLY)
	public void setIsModified(String isModified) {
		this.is_modified = isModified;
	}
	@JsonProperty(value="createdBy", access=JsonProperty.Access.READ_ONLY)
	public String getCreatedBy() {
		return created_by;
	}
	@JsonProperty(value="created_by", access=JsonProperty.Access.WRITE_ONLY)
	public void setCreatedBy(String createdBy) {
		this.created_by = createdBy;
	}
	@JsonProperty(value="createdTime", access=JsonProperty.Access.READ_ONLY)
	public String getCreatedTime() {
		return created_time;
	}
	@JsonProperty(value="created_time", access=JsonProperty.Access.WRITE_ONLY)
	public void setCreatedTime(String createdTime) {
		this.created_time = createdTime;
	}
	@JsonProperty(value="modifiedBy", access=JsonProperty.Access.READ_ONLY)
	public String getModifiedBy() {
		return modified_by;
	}
	@JsonProperty(value="modified_by", access=JsonProperty.Access.WRITE_ONLY)
	public void setModifiedBy(String modifiedBy) {
		this.modified_by = modifiedBy;
	}
	@JsonProperty(value="modifiedTime", access=JsonProperty.Access.READ_ONLY)
	public String getModifiedTime() {
		return modified_time;
	}
	@JsonProperty(value="modified_time", access=JsonProperty.Access.WRITE_ONLY)
	public void setModifiedTime(String modifiedTime) {
		this.modified_time = modifiedTime;
	}
	@JsonProperty(value="id", access=JsonProperty.Access.READ_ONLY)
	public Integer getId() {
		return id;
	}
	@JsonProperty(value="id", access=JsonProperty.Access.WRITE_ONLY)
	public void setId(Integer id) {
		this.id = id;
	}
	@JsonProperty(value="schoolName", access=JsonProperty.Access.READ_ONLY)
	public String getSchool_name() {
		return school_name;
	}
	@JsonProperty(value="school_name", access=JsonProperty.Access.WRITE_ONLY)
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
//	@JsonProperty(value="studentName", access=JsonProperty.Access.READ_ONLY)
//	public String getStudent_name() {
//		return student_name;
//	}
//	
//	@JsonProperty(value="student_name", access=JsonProperty.Access.WRITE_ONLY)
//	public void setStudent_name(String student_name) {
//		this.student_name = student_name;
//	}
//	
//	@JsonProperty(value="studentDob", access=JsonProperty.Access.READ_ONLY)
//	public Date getStudent_dob() {
//		return student_dob;
//	}
//	@JsonProperty(value="student_dob", access=JsonProperty.Access.WRITE_ONLY)
//	public void setStudent_dob(Date student_dob) {
//		this.student_dob = student_dob;
//	}
	@JsonProperty(value="teacherForm", access=JsonProperty.Access.READ_ONLY)
	public Integer getTeacher_form() {
		return teacher_form;
	}
	@JsonProperty(value="teacher_form", access=JsonProperty.Access.WRITE_ONLY)
	public void setTeacher_form(Integer teacher_form) {
		this.teacher_form = teacher_form;
	}
	
	@JsonProperty(value="postOffice", access=JsonProperty.Access.READ_ONLY)
	public String getPostOffice() {
		return postOffice;
	}
	
	@JsonProperty(value="post_office", access=JsonProperty.Access.WRITE_ONLY)
	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	
	
	
//public Integer getStudent_id() {
//		return student_id;
//	}
//	public void setStudent_id(Integer student_id) {
//		this.student_id = student_id;
//	}
//	//	public Integer getStudentId() {
////		return studentId;
////	}
////	public void setStudentId(Integer studentId) {
////		this.studentId = studentId;
////	}
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public String getStudentDob() {
//		return studentDob;
//	}
//	public void setStudentDob(String studentDob) {
//		this.studentDob = studentDob;
//	}
//	public Integer getStudent_category() {
//		return student_category;
//	}
//	public void setStudent_category(Integer student_category) {
//		this.student_category = student_category;
//	}
//	public String getStudent_blood_group() {
//		return student_blood_group;
//	}
//	public void setStudent_blood_group(String student_blood_group) {
//		this.student_blood_group = student_blood_group;
//	}
//	public String getAdmission_num() {
//		return admission_num;
//	}
//	public void setAdmission_num(String admission_num) {
//		this.admission_num = admission_num;
//	}
//	public String getState_id() {
//		return state_id;
//	}
//	public void setState_id(String state_id) {
//		this.state_id = state_id;
//	}
//	public Integer getDistrict_id() {
//		return district_id;
//	}
//	public void setDistrict_id(Integer district_id) {
//		this.district_id = district_id;
//	}
//	public String getUdise_state_code() {
//		return udise_state_code;
//	}
//	public void setUdise_state_code(String udise_state_code) {
//		this.udise_state_code = udise_state_code;
//	}
//	public String getUdise_district_code() {
//		return udise_district_code;
//	}
//	public void setUdise_district_code(String udise_district_code) {
//		this.udise_district_code = udise_district_code;
//	}
//	public Integer getSchool_id() {
//		return school_id;
//	}
//	public void setSchool_id(Integer school_id) {
//		this.school_id = school_id;
//	}
//	public String getUdise_sch_code() {
//		return udise_sch_code;
//	}
//	public void setUdise_sch_code(String udise_sch_code) {
//		this.udise_sch_code = udise_sch_code;
//	}
//	public String getStudent_address() {
//		return student_address;
//	}
//	public void setStudent_address(String student_address) {
//		this.student_address = student_address;
//	}
//	public String getTc_reason() {
//		return tc_reason;
//	}
//	public void setTc_reason(String tc_reason) {
//		this.tc_reason = tc_reason;
//	}
//	public String getApplicant_userid() {
//		return applicant_userid;
//	}
//	public void setApplicant_userid(String applicant_userid) {
//		this.applicant_userid = applicant_userid;
//	}
//	public String getTc_id() {
//		return tc_id;
//	}
//	public void setTc_id(String tc_id) {
//		this.tc_id = tc_id;
//	}
//	public Integer getStudent_relationship() {
//		return student_relationship;
//	}
//	public void setStudent_relationship(Integer student_relationship) {
//		this.student_relationship = student_relationship;
//	}
//	public String getPincode() {
//		return pincode;
//	}
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//	public String getStudent_address2() {
//		return student_address2;
//	}
//	public void setStudent_address2(String student_address2) {
//		this.student_address2 = student_address2;
//	}
//	public String getStudent_nationality() {
//		return student_nationality;
//	}
//	public void setStudent_nationality(String student_nationality) {
//		this.student_nationality = student_nationality;
//	}
//	public Integer getStudent_details_form() {
//		return student_details_form;
//	}
//	public void setStudent_details_form(Integer student_details_form) {
//		this.student_details_form = student_details_form;
//	}
//	public Integer getAcademic_details_form() {
//		return academic_details_form;
//	}
//	public void setAcademic_details_form(Integer academic_details_form) {
//		this.academic_details_form = academic_details_form;
//	}
//	public Integer getParent_deails_form() {
//		return parent_deails_form;
//	}
//	public void setParent_deails_form(Integer parent_deails_form) {
//		this.parent_deails_form = parent_deails_form;
//	}
//	public Integer getNo_dues_form() {
//		return no_dues_form;
//	}
//	public void setNo_dues_form(Integer no_dues_form) {
//		this.no_dues_form = no_dues_form;
//	}
//	public Integer getTc_status() {
//		return tc_status;
//	}
//	public void setTc_status(Integer tc_status) {
//		this.tc_status = tc_status;
//	}
//	public String getIsModified() {
//		return isModified;
//	}
//	public void setIsModified(String isModified) {
//		this.isModified = isModified;
//	}
//	public String getCreatedBy() {
//		return createdBy;
//	}
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//	public String getCreatedTime() {
//		return createdTime;
//	}
//	public void setCreatedTime(String createdTime) {
//		this.createdTime = createdTime;
//	}
//	public String getModifiedBy() {
//		return modifiedBy;
//	}
//	public void setModifiedBy(String modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}
//	public String getModifiedTime() {
//		return modifiedTime;
//	}
//	public void setModifiedTime(String modifiedTime) {
//		this.modifiedTime = modifiedTime;
//	}

	
	
	
	
	
	
	
}
