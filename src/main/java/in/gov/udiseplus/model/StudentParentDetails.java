package in.gov.udiseplus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "student_parent_details")
@DynamicUpdate
public class StudentParentDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1209940032997418375L;

	@Id
	@Column(name = "student_id")
	private Integer studentId;
	
	@Column(name = "name_father")
	private String fatherName;
	
	@Column(name = "occupation_father")
	private Integer fatherOccupation;
	
	@Column(name = "nationality_father")
	private String fatherNationality;
	
	@Column(name = "blood_group_father")
	private Integer fatherBloodGroup;
	
	@Column(name = "father_mobile")
	private String fatherMobile;
	
	@Column(name = "name_mother")
	private String motherName;
	
	
	
	@Column(name = "occupation_mother")
	private Integer motherOccupation;
	
	@Column(name = "nationality_mother")
	private String motherNationality;
	
	@Column(name = "blood_group_mother")
	private Integer motherBloodGroup;
	
	@Column(name = "mother_mobile")
	private String motherMobile;
	
	@Column(name = "parent_address")
	private String parentAddress;
	
	@Column(name = "parent_address2")
	private String parentAddress2;
	
	@Column(name = "pincode")
	private Integer pincode;
	
	@Column(name = "post_office_parent")
	private String postOfficeParent;
	
	
	@Column(name = "guardian_yn")
	private Integer guardianYN;
	
	@Column(name = "name_guardian")
	private String nameGuardian;
	
	@Column(name = "occupation_guardian")
	private Integer guardianOccupation;
	
	@Column(name = "nationality_guardian")
	private String guardianNationality;
	
	@Column(name = "mobile_guardian")
	private String guardianMobile;
	
	@Column(name = "address_guardian")
	private String guardianAddress;
	
	@Column(name = "address_guardian2")
	private String guardianAddress2;
	
	@Column(name = "pincode_guardian")
	private String pincode_guardian;
	
	@Column(name = "post_office_guardian")
	private String postOfficeGuardian;
	
	
	@Column(name = "is_modified")
	private Integer ismodified;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_time")
	private Date createdTime;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	
	@Column(name = "modified_time")
	private Date modifiedTime;

	
	@Column(name = "tc_id")
	private String tcId;
	
	
	
	
	public String getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}

	public String getParentAddress2() {
		return parentAddress2;
	}

	public void setParentAddress2(String parentAddress2) {
		this.parentAddress2 = parentAddress2;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Integer getGuardianOccupation() {
		return guardianOccupation;
	}

	public void setGuardianOccupation(Integer guardianOccupation) {
		this.guardianOccupation = guardianOccupation;
	}

	public String getGuardianNationality() {
		return guardianNationality;
	}

	public void setGuardianNationality(String guardianNationality) {
		this.guardianNationality = guardianNationality;
	}

	public String getGuardianMobile() {
		return guardianMobile;
	}

	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}

	public String getGuardianAddress2() {
		return guardianAddress2;
	}

	public void setGuardianAddress2(String guardianAddress2) {
		this.guardianAddress2 = guardianAddress2;
	}

	public String getPincode_guardian() {
		return pincode_guardian;
	}

	public void setPincode_guardian(String pincode_guardian) {
		this.pincode_guardian = pincode_guardian;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Integer getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(Integer fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getFatherNationality() {
		return fatherNationality;
	}

	public void setFatherNationality(String fatherNationality) {
		this.fatherNationality = fatherNationality;
	}

	public Integer getFatherBloodGroup() {
		return fatherBloodGroup;
	}

	public void setFatherBloodGroup(Integer fatherBloodGroup) {
		this.fatherBloodGroup = fatherBloodGroup;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Integer getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(Integer motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getMotherNationality() {
		return motherNationality;
	}

	public void setMotherNationality(String motherNationality) {
		this.motherNationality = motherNationality;
	}

	public Integer getMotherBloodGroup() {
		return motherBloodGroup;
	}

	public void setMotherBloodGroup(Integer motherBloodGroup) {
		this.motherBloodGroup = motherBloodGroup;
	}

	public Integer getGuardianYN() {
		return guardianYN;
	}

	public void setGuardianYN(Integer guardianYN) {
		this.guardianYN = guardianYN;
	}

	public String getGuardianAddress() {
		return guardianAddress;
	}

	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}

	public Integer getIsmodified() {
		return ismodified;
	}

	public void setIsmodified(Integer ismodified) {
		this.ismodified = ismodified;
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

	public String getNameGuardian() {
		return nameGuardian;
	}

	public void setNameGuardian(String nameGuardian) {
		this.nameGuardian = nameGuardian;
	}

	public String getTcId() {
		return tcId;
	}

	public void setTcId(String tcId) {
		this.tcId = tcId;
	}

	public String getFatherMobile() {
		return fatherMobile;
	}

	public void setFatherMobile(String fatherMobile) {
		this.fatherMobile = fatherMobile;
	}

	public String getMotherMobile() {
		return motherMobile;
	}

	public void setMotherMobile(String motherMobile) {
		this.motherMobile = motherMobile;
	}

	public String getPostOfficeParent() {
		return postOfficeParent;
	}

	public void setPostOfficeParent(String postOfficeParent) {
		this.postOfficeParent = postOfficeParent;
	}

	public String getPostOfficeGuardian() {
		return postOfficeGuardian;
	}

	public void setPostOfficeGuardian(String postOfficeGuardian) {
		this.postOfficeGuardian = postOfficeGuardian;
	}
	
	
	
}
