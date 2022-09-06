package in.gov.udiseplus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "form_status")
public class FormStatus implements Serializable{
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
private Integer id;
	
@Column(name = "student_id")
private Integer	studentId;
@Column(name = "student_details_form")
private Integer	studentDetailsForm;
@Column(name = "academic_details_form")
private Integer	academicDetailsForm;
@Column(name = "parent_deails_form")
private Integer	parentDeailsForm;
@Column(name = "no_dues_form")
private Integer	noDuesForm;
@Column(name = "teacher_form")
private Integer teacherForm;
@Column(name = "tc_status")
private Integer	tcStatus;
@Column(name = "form_type")
private Integer formType;




public Integer getTeacherForm() {
	return teacherForm;
}

public void setTeacherForm(Integer teacherForm) {
	this.teacherForm = teacherForm;
}

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

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getStudentId() {
	return studentId;
}

public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}

public Integer getStudentDetailsForm() {
	return studentDetailsForm;
}

public void setStudentDetailsForm(Integer studentDetailsForm) {
	this.studentDetailsForm = studentDetailsForm;
}

public Integer getAcademicDetailsForm() {
	return academicDetailsForm;
}

public void setAcademicDetailsForm(Integer academicDetailsForm) {
	this.academicDetailsForm = academicDetailsForm;
}

public Integer getParentDeailsForm() {
	return parentDeailsForm;
}

public void setParentDeailsForm(Integer parentDeailsForm) {
	this.parentDeailsForm = parentDeailsForm;
}

public Integer getNoDuesForm() {
	return noDuesForm;
}

public void setNoDuesForm(Integer noDuesForm) {
	this.noDuesForm = noDuesForm;
}

public Integer getTcStatus() {
	return tcStatus;
}

public void setTcStatus(Integer tcStatus) {
	this.tcStatus = tcStatus;
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

public Integer getFormType() {
	return formType;
}

public void setFormType(Integer formType) {
	this.formType = formType;
}

public String getTcId() {
	return tcId;
}

public void setTcId(String tcId) {
	this.tcId = tcId;
}


}
