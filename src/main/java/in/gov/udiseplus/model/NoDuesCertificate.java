package in.gov.udiseplus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "no_dues_certificate")
public class NoDuesCertificate {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
private Integer id;
@Column(name = "student_id")
private Integer studentId;
@Column(name = "no_dues_id")
private Integer noDuesId;
@Column(name = "no_dues_status")
private Integer noDuesStatus;
@Column(name = "no_dues_reason")
private String noDuesReason;
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

public Integer getStudentId() {
	return studentId;
}

public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}

public Integer getNoDuesId() {
	return noDuesId;
}

public void setNoDuesId(Integer noDuesId) {
	this.noDuesId = noDuesId;
}

public Integer getNoDuesStatus() {
	return noDuesStatus;
}

public void setNoDuesStatus(Integer noDuesStatus) {
	this.noDuesStatus = noDuesStatus;
}



public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNoDuesReason() {
	return noDuesReason;
}

public void setNoDuesReason(String noDuesReason) {
	this.noDuesReason = noDuesReason;
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

public String getTcId() {
	return tcId;
}

public void setTcId(String tcId) {
	this.tcId = tcId;
}



}
