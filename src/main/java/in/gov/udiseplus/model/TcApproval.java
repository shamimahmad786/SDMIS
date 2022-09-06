package in.gov.udiseplus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tc_approval")
public class TcApproval implements Serializable{
	
@Id
@Column(name = "tc_id")
private String	tcId;	
	
@Column(name = "student_id")
private Integer	studentId;

@Column(name = "qual_promotion_yn")
private Integer	qualPromotionYn;

@Column(name = "dues_paid_yn")
private Integer	duesPaidYn;

@Column(name = "tc_issued_yn")
private Integer	tcIssuedYn;

@Column(name = "tc_number")
private String	tcNumber;

@Column(name = "tc_issue_date")
private Date	tcIssueDate;

@Column(name = "general_conduct")
private String	generalConduct;

@Column(name = "remarks")
private String	remarks;

@Column(name = "tc_status")
private Integer tcStatus;

@Column(name = "tc_checked_by")
private  String tcCheckedBy;

@Column(name = "tc_checked_by_designation")
private Integer tcCheckedByDesignation;

@Column(name = "fee_paid_upto")
private Date feePaidUpto;

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

public String getTcId() {
	return tcId;
}

public void setTcId(String tcId) {
	this.tcId = tcId;
}

public Integer getStudentId() {
	return studentId;
}

public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}

public Integer getQualPromotionYn() {
	return qualPromotionYn;
}

public void setQualPromotionYn(Integer qualPromotionYn) {
	this.qualPromotionYn = qualPromotionYn;
}

public Integer getDuesPaidYn() {
	return duesPaidYn;
}

public void setDuesPaidYn(Integer duesPaidYn) {
	this.duesPaidYn = duesPaidYn;
}

public Integer getTcIssuedYn() {
	return tcIssuedYn;
}

public void setTcIssuedYn(Integer tcIssuedYn) {
	this.tcIssuedYn = tcIssuedYn;
}

public String getTcNumber() {
	return tcNumber;
}

public void setTcNumber(String tcNumber) {
	this.tcNumber = tcNumber;
}

public Date getTcIssueDate() {
	return tcIssueDate;
}

public void setTcIssueDate(Date tcIssueDate) {
	this.tcIssueDate = tcIssueDate;
}

public String getGeneralConduct() {
	return generalConduct;
}

public void setGeneralConduct(String generalConduct) {
	this.generalConduct = generalConduct;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
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

public Integer getTcStatus() {
	return tcStatus;
}

public void setTcStatus(Integer tcStatus) {
	this.tcStatus = tcStatus;
}

public String getTcCheckedBy() {
	return tcCheckedBy;
}

public void setTcCheckedBy(String tcCheckedBy) {
	this.tcCheckedBy = tcCheckedBy;
}

public Integer getTcCheckedByDesignation() {
	return tcCheckedByDesignation;
}

public void setTcCheckedByDesignation(Integer tcCheckedByDesignation) {
	this.tcCheckedByDesignation = tcCheckedByDesignation;
}

public Date getFeePaidUpto() {
	return feePaidUpto;
}

public void setFeePaidUpto(Date feePaidUpto) {
	this.feePaidUpto = feePaidUpto;
}



}
