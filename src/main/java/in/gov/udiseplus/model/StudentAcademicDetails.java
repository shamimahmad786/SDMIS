package in.gov.udiseplus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "student_academic_details")
@DynamicUpdate
public class StudentAcademicDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2244578782164089803L;

	@Id
	@Column(name = "student_id")
	private Integer studentId;
	
	@Column(name = "school_id")
	private Integer schoolId;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Column(name = "present_class")
	private Integer presentClass;
	
	@Column(name = "present_class_sec")
	private String presentClassSection;
	
	@Column(name = "previous_class")
	private Integer previousClass;
	
	@Column(name = "previous_class_sec")
	private String previousClassSec;
	
	@Column(name = "roll_number")
	private String rollNumber;
	
	@Column(name = "last_result_status")
	private Integer lastResultStatus;
	
	@Column(name = "date_first_admission")
	private Date firstAdmDate;
	
	@Column(name = "failed_yn")
	private Integer failedYN;
	
	@Column(name = "fail_count_same_class")
	private Integer failCount;
	
	@Column(name = "fee_concession_yn")
	private Integer feeConcessionYN;
	
	@Column(name = "fee_concession_nature")
	private String feeConcessionNature;
	
	@Column(name = "roll_struck_date")
	private Date rollStruckDate;
	
	@Column(name = "school_days_as_on_date")
	private Integer totalSchoolDays;
	
	@Column(name = "attendance")
	private Integer attendance;
	
	@Column(name = "last_attendance_date")
	private Date dateLastAttended;
	
	@Column(name = "ncc_scout_guide")
	private Integer nccScoutGuide;
	
	@Column(name = "total_meetings_held")
	private Integer totalMeetingsHeld;
	
	@Column(name = "total_meetings_attended")
	private Integer totalMeetingsAttended;
	
	@Column(name = "subject_offered")
	private String subjectOffered;
	
	@Column(name = "remarks")
	private String remarks;
	
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
	
	@Column(name = "tc_prepared_by")
	private String  tcPreparedBy;
	
	@Column(name = "tc_prepared_by_desigation")
	private Integer tcPreparedByDesigation;
	
	

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSubjectOffered() {
		return subjectOffered;
	}

	public void setSubjectOffered(String subjectOffered) {
		this.subjectOffered = subjectOffered;
	}

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


	public Integer getPresentClass() {
		return presentClass;
	}

	public void setPresentClass(Integer presentClass) {
		this.presentClass = presentClass;
	}

	public String getPresentClassSection() {
		return presentClassSection;
	}

	public void setPresentClassSection(String presentClassSection) {
		this.presentClassSection = presentClassSection;
	}

	public Integer getPreviousClass() {
		return previousClass;
	}

	public void setPreviousClass(Integer previousClass) {
		this.previousClass = previousClass;
	}

	public String getPreviousClassSec() {
		return previousClassSec;
	}

	public void setPreviousClassSec(String previousClassSec) {
		this.previousClassSec = previousClassSec;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Integer getLastResultStatus() {
		return lastResultStatus;
	}

	public void setLastResultStatus(Integer lastResultStatus) {
		this.lastResultStatus = lastResultStatus;
	}
	
	public Date getFirstAdmDate() {
		return firstAdmDate;
	}

	public void setFirstAdmDate(Date firstAdmDate) {
		this.firstAdmDate = firstAdmDate;
	}

	public Integer getFailedYN() {
		return failedYN;
	}

	public void setFailedYN(Integer failedYN) {
		this.failedYN = failedYN;
	}

	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public Integer getFeeConcessionYN() {
		return feeConcessionYN;
	}

	public void setFeeConcessionYN(Integer feeConcessionYN) {
		this.feeConcessionYN = feeConcessionYN;
	}

	public String getFeeConcessionNature() {
		return feeConcessionNature;
	}

	public void setFeeConcessionNature(String feeConcessionNature) {
		this.feeConcessionNature = feeConcessionNature;
	}

	public Date getRollStruckDate() {
		return rollStruckDate;
	}

	public void setRollStruckDate(Date rollStruckDate) {
		this.rollStruckDate = rollStruckDate;
	}

	public Integer getTotalSchoolDays() {
		return totalSchoolDays;
	}

	public void setTotalSchoolDays(Integer totalSchoolDays) {
		this.totalSchoolDays = totalSchoolDays;
	}

	public Integer getAttendance() {
		return attendance;
	}

	public void setAttendance(Integer attendance) {
		this.attendance = attendance;
	}

	public Date getDateLastAttended() {
		return dateLastAttended;
	}

	public void setDateLastAttended(Date dateLastAttended) {
		this.dateLastAttended = dateLastAttended;
	}

	public Integer getNccScoutGuide() {
		return nccScoutGuide;
	}

	public void setNccScoutGuide(Integer nccScoutGuide) {
		this.nccScoutGuide = nccScoutGuide;
	}

	public Integer getTotalMeetingsHeld() {
		return totalMeetingsHeld;
	}

	public void setTotalMeetingsHeld(Integer totalMeetingsHeld) {
		this.totalMeetingsHeld = totalMeetingsHeld;
	}

	public Integer getTotalMeetingsAttended() {
		return totalMeetingsAttended;
	}

	public void setTotalMeetingsAttended(Integer totalMeetingsAttended) {
		this.totalMeetingsAttended = totalMeetingsAttended;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	
	public String getTcPreparedBy() {
		return tcPreparedBy;
	}

	public void setTcPreparedBy(String tcPreparedBy) {
		this.tcPreparedBy = tcPreparedBy;
	}

	public Integer getTcPreparedByDesigation() {
		return tcPreparedByDesigation;
	}

	public void setTcPreparedByDesigation(Integer tcPreparedByDesigation) {
		this.tcPreparedByDesigation = tcPreparedByDesigation;
	}

	
	
}
