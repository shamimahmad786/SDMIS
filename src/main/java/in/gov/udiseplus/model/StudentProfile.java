package in.gov.udiseplus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_profile")
public class StudentProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@Column(name = "student_relationship")
	private Integer studentRelationship;
	
	@Column(name = "applicant_userid")
	private String applicantUserid;
	
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

	public String getStudentNationality() {
		return studentNationality;
	}

	public void setStudentNationality(String studentNationality) {
		this.studentNationality = studentNationality;
	}

	public Integer getStudentRelationship() {
		return studentRelationship;
	}

	public void setStudentRelationship(Integer studentRelationship) {
		this.studentRelationship = studentRelationship;
	}

	public String getApplicantUserid() {
		return applicantUserid;
	}

	public void setApplicantUserid(String applicantUserid) {
		this.applicantUserid = applicantUserid;
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
	
	
	
}
