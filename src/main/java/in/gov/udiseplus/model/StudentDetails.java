package in.gov.udiseplus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "student_details")
@DynamicUpdate
public class StudentDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4481591889518467203L;

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private Integer studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_dob")
	private Date studentDob;
	
	@Column(name = "student_category")
	private Integer studentCategory;
	
	@Column(name = "student_blood_group")
	private Integer studentBloodGroup;
	
	@Column(name = "student_nationality")
	private String studentNationality;
	
	@Column(name = "admission_num")
	private Integer admissionNumber;
	
	@Column(name ="state_id")
	private Integer stateId;
	
	@Column(name = "district_id")
	private Integer districtId;
	
	@Column(name = "udise_state_code")
	private String udiseStateCode;
	
	@Column(name = "udise_district_code")
	private String udiseDistrictCode;
	
	@Column(name = "school_id")
	private Integer schoolId;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Column(name = "student_address")
	private String studentAddress;
	
	@Column(name = "student_address2")
	private String studentAddress2;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "post_office")
	private String postOffice;
	
	@Column(name = "tc_reason")
	private Integer tcReason;
	
	@Column(name = "student_relationship")
	private Integer studentRelationship;
	
	@Column(name = "is_modified")
	private Integer isModified;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_time")
	private Date createdTime;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "modified_time")
	private Date modifiedTime;
	
	@Column(name = "applicant_userid")
	private String applicantUserid;
	
	@Column(name = "tc_id")
	private String tcId;
	
	
	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStudentNationality() {
		return studentNationality;
	}

	public void setStudentNationality(String studentNationality) {
		this.studentNationality = studentNationality;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}

	public Integer getStudentCategory() {
		return studentCategory;
	}

	public void setStudentCategory(Integer studentCategory) {
		this.studentCategory = studentCategory;
	}

	public Integer getStudentBloodGroup() {
		return studentBloodGroup;
	}

	public void setStudentBloodGroup(Integer studentBloodGroup) {
		this.studentBloodGroup = studentBloodGroup;
	}

	public Integer getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(Integer admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getUdiseStateCode() {
		return udiseStateCode;
	}

	public void setUdiseStateCode(String udiseStateCode) {
		this.udiseStateCode = udiseStateCode;
	}

	public String getUdiseDistrictCode() {
		return udiseDistrictCode;
	}

	public void setUdiseDistrictCode(String udiseDistrictCode) {
		this.udiseDistrictCode = udiseDistrictCode;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getUdiseSchCode() {
		return udiseSchCode;
	}

	public void setUdiseSchCode(String udiseSchCode) {
		this.udiseSchCode = udiseSchCode;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Integer getTcReason() {
		return tcReason;
	}

	public void setTcReason(Integer tcReason) {
		this.tcReason = tcReason;
	}

	public Integer getIsModified() {
		return isModified;
	}

	public void setIsModified(Integer isModified) {
		this.isModified = isModified;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getApplicantUserid() {
		return applicantUserid;
	}

	public void setApplicantUserid(String applicantUserid) {
		this.applicantUserid = applicantUserid;
	}

	public String getTcId() {
		return tcId;
	}

	public void setTcId(String tcId) {
		this.tcId = tcId;
	}

	public String getStudentAddress2() {
		return studentAddress2;
	}

	public void setStudentAddress2(String studentAddress2) {
		this.studentAddress2 = studentAddress2;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Integer getStudentRelationship() {
		return studentRelationship;
	}

	public void setStudentRelationship(Integer studentRelationship) {
		this.studentRelationship = studentRelationship;
	}

	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	
	
	
	
}
