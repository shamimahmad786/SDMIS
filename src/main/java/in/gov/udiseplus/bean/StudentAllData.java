package in.gov.udiseplus.bean;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentAllData implements Serializable{
	private Integer student_id;
	private String student_name;
	private Date student_dob;
	private String student_category;
	private String student_blood_group;
	private String admission_num;
	private Integer state_id;
	private Integer district_id;
	private String udise_state_code;
	private String udise_district_code;
	private Integer school_id;
	private String schoolName;
	private String udise_sch_code;
	private String student_address;
	private String tc_reason;
	private String applicant_userid;
	private String tc_id;
	private String student_relationship;
	private String pincode;
	private String post_office;
	private String student_address2;
	private String student_nationality;
	private String name_father;
	private String occupation_father;
	private String nationality_father;
	private String blood_group_father;
	private String name_mother;
	private String occupation_mother;
	private String nationality_mother;
	private String blood_group_mother;
	private String post_office_parent;
	private Integer guardian_yn;
	private String name_guardian;
	private String address_guardian;
	private String address_guardian2;
	private String mobile_guardian;
	private String nationality_guardian;
	private String occupation_guardian;
	private String parent_address;
	private String parent_address2;
	private String pincode_guardian;
	private String post_office_guardian;
	private String father_mobile;
	private String mother_mobile;
	private Integer present_class;
	private String present_class_sec;
	private Integer previous_class;
	private String previous_class_sec;
	private String roll_number;
	private Integer last_result_status;
	private Date date_first_admission;
	private String failed_yn;
	private String fail_count_same_class;
	private String fee_concession_yn;
	private String fee_concession_nature;
	private Date roll_struck_date;
	private String last_attendance_date;
	private String school_days_as_on_date;
	private String attendance;
	private String ncc_scout_guide;
	private String total_meetings_held;
	private String total_meetings_attended;
	private String remarks;
	private String subject_offered;
	
	
	@JsonProperty(value="schoolName", access=JsonProperty.Access.READ_ONLY)
	public String getSchoolName() {
		return schoolName;
	}
	@JsonProperty(value="school_name", access=JsonProperty.Access.WRITE_ONLY)
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@JsonProperty(value="studentId", access=JsonProperty.Access.READ_ONLY)
	public Integer getStudent_id() {
		return student_id;
	}
	@JsonProperty(value="student_id", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	
	@JsonProperty(value="studentName", access=JsonProperty.Access.READ_ONLY)
	public String getStudent_name() {
		return student_name;
	}
	@JsonProperty(value="student_name", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	@JsonProperty(value="studentDob", access=JsonProperty.Access.READ_ONLY)
	public Date getStudent_dob() {
		return student_dob;
	}
	@JsonProperty(value="student_dob", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}
	@JsonProperty(value="studentCategory", access=JsonProperty.Access.READ_ONLY)
	public String getStudent_category() {
		return student_category;
	}
	@JsonProperty(value="student_category", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_category(String student_category) {
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
	public Integer getState_id() {
		return state_id;
	}
	@JsonProperty(value="state_id", access=JsonProperty.Access.WRITE_ONLY)
	public void setState_id(Integer state_id) {
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
	public String getStudent_relationship() {
		return student_relationship;
	}
	@JsonProperty(value="student_relationship", access=JsonProperty.Access.WRITE_ONLY)
	public void setStudent_relationship(String student_relationship) {
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
	@JsonProperty(value="fatherName", access=JsonProperty.Access.READ_ONLY)
	public String getName_father() {
		return name_father;
	}
	@JsonProperty(value="name_father", access=JsonProperty.Access.WRITE_ONLY)
	public void setName_father(String name_father) {
		this.name_father = name_father;
	}
	@JsonProperty(value="fatherOccupation", access=JsonProperty.Access.READ_ONLY)
	public String getOccupation_father() {
		return occupation_father;
	}
	@JsonProperty(value="occupation_father", access=JsonProperty.Access.WRITE_ONLY)
	public void setOccupation_father(String occupation_father) {
		this.occupation_father = occupation_father;
	}
	@JsonProperty(value="fatherNationality", access=JsonProperty.Access.READ_ONLY)
	public String getNationality_father() {
		return nationality_father;
	}
	@JsonProperty(value="nationality_father", access=JsonProperty.Access.WRITE_ONLY)
	public void setNationality_father(String nationality_father) {
		this.nationality_father = nationality_father;
	}
	@JsonProperty(value="fatherBloodGroup", access=JsonProperty.Access.READ_ONLY)
	public String getBlood_group_father() {
		return blood_group_father;
	}
	@JsonProperty(value="blood_group_father", access=JsonProperty.Access.WRITE_ONLY)
	public void setBlood_group_father(String blood_group_father) {
		this.blood_group_father = blood_group_father;
	}
	@JsonProperty(value="motherName", access=JsonProperty.Access.READ_ONLY)
	public String getName_mother() {
		return name_mother;
	}
	@JsonProperty(value="name_mother", access=JsonProperty.Access.WRITE_ONLY)
	public void setName_mother(String name_mother) {
		this.name_mother = name_mother;
	}
	@JsonProperty(value="motherOccupation", access=JsonProperty.Access.READ_ONLY)
	public String getOccupation_mother() {
		return occupation_mother;
	}
	@JsonProperty(value="occupation_mother", access=JsonProperty.Access.WRITE_ONLY)
	public void setOccupation_mother(String occupation_mother) {
		this.occupation_mother = occupation_mother;
	}
	@JsonProperty(value="motherNationality", access=JsonProperty.Access.READ_ONLY)
	public String getNationality_mother() {
		return nationality_mother;
	}
	@JsonProperty(value="nationality_mother", access=JsonProperty.Access.WRITE_ONLY)
	public void setNationality_mother(String nationality_mother) {
		this.nationality_mother = nationality_mother;
	}
	@JsonProperty(value="motherBloodGroup", access=JsonProperty.Access.READ_ONLY)
	public String getBlood_group_mother() {
		return blood_group_mother;
	}
	@JsonProperty(value="blood_group_mother", access=JsonProperty.Access.WRITE_ONLY)
	public void setBlood_group_mother(String blood_group_mother) {
		this.blood_group_mother = blood_group_mother;
	}
	@JsonProperty(value="guardianYn", access=JsonProperty.Access.READ_ONLY)
	public Integer getGuardian_yn() {
		return guardian_yn;
	}
	@JsonProperty(value="guardian_yn", access=JsonProperty.Access.WRITE_ONLY)
	public void setGuardian_yn(Integer guardian_yn) {
		this.guardian_yn = guardian_yn;
	}
	@JsonProperty(value="nameGuardian", access=JsonProperty.Access.READ_ONLY)
	public String getName_guardian() {
		return name_guardian;
	}
	@JsonProperty(value="name_guardian", access=JsonProperty.Access.WRITE_ONLY)
	public void setName_guardian(String name_guardian) {
		this.name_guardian = name_guardian;
	}
	@JsonProperty(value="addressGuardian", access=JsonProperty.Access.READ_ONLY)
	public String getAddress_guardian() {
		return address_guardian;
	}
	@JsonProperty(value="address_guardian", access=JsonProperty.Access.WRITE_ONLY)
	public void setAddress_guardian(String address_guardian) {
		this.address_guardian = address_guardian;
	}
	@JsonProperty(value="addressGuardian2", access=JsonProperty.Access.READ_ONLY)
	public String getAddress_guardian2() {
		return address_guardian2;
	}
	@JsonProperty(value="address_guardian2", access=JsonProperty.Access.WRITE_ONLY)
	public void setAddress_guardian2(String address_guardian2) {
		this.address_guardian2 = address_guardian2;
	}
	@JsonProperty(value="mobileGuardian", access=JsonProperty.Access.READ_ONLY)
	public String getMobile_guardian() {
		return mobile_guardian;
	}
	@JsonProperty(value="mobile_guardian", access=JsonProperty.Access.WRITE_ONLY)
	public void setMobile_guardian(String mobile_guardian) {
		this.mobile_guardian = mobile_guardian;
	}
	@JsonProperty(value="guardianNationality", access=JsonProperty.Access.READ_ONLY)
	public String getNationality_guardian() {
		return nationality_guardian;
	}
	@JsonProperty(value="nationality_guardian", access=JsonProperty.Access.WRITE_ONLY)
	public void setNationality_guardian(String nationality_guardian) {
		this.nationality_guardian = nationality_guardian;
	}
	@JsonProperty(value="occupationGuardian", access=JsonProperty.Access.READ_ONLY)
	public String getOccupation_guardian() {
		return occupation_guardian;
	}
	@JsonProperty(value="occupation_guardian", access=JsonProperty.Access.WRITE_ONLY)
	public void setOccupation_guardian(String occupation_guardian) {
		this.occupation_guardian = occupation_guardian;
	}
	@JsonProperty(value="parentAddress", access=JsonProperty.Access.READ_ONLY)
	public String getParent_address() {
		return parent_address;
	}
	@JsonProperty(value="parent_address", access=JsonProperty.Access.WRITE_ONLY)
	public void setParent_address(String parent_address) {
		this.parent_address = parent_address;
	}
	@JsonProperty(value="parentAddress2", access=JsonProperty.Access.READ_ONLY)
	public String getParent_address2() {
		return parent_address2;
	}
	@JsonProperty(value="parent_address2", access=JsonProperty.Access.WRITE_ONLY)
	public void setParent_address2(String parent_address2) {
		this.parent_address2 = parent_address2;
	}
	@JsonProperty(value="pincodeGuardian", access=JsonProperty.Access.READ_ONLY)
	public String getPincode_guardian() {
		return pincode_guardian;
	}
	@JsonProperty(value="pincode_guardian", access=JsonProperty.Access.WRITE_ONLY)
	public void setPincode_guardian(String pincode_guardian) {
		this.pincode_guardian = pincode_guardian;
	}
	@JsonProperty(value="fatherMobile", access=JsonProperty.Access.READ_ONLY)
	public String getFather_mobile() {
		return father_mobile;
	}
	@JsonProperty(value="father_mobile", access=JsonProperty.Access.WRITE_ONLY)
	public void setFather_mobile(String father_mobile) {
		this.father_mobile = father_mobile;
	}
	@JsonProperty(value="motherMobile", access=JsonProperty.Access.READ_ONLY)
	public String getMother_mobile() {
		return mother_mobile;
	}
	@JsonProperty(value="mother_mobile", access=JsonProperty.Access.WRITE_ONLY)
	public void setMother_mobile(String mother_mobile) {
		this.mother_mobile = mother_mobile;
	}
	@JsonProperty(value="presentClass", access=JsonProperty.Access.READ_ONLY)
	public Integer getPresent_class() {
		return present_class;
	}
	@JsonProperty(value="present_class", access=JsonProperty.Access.WRITE_ONLY)
	public void setPresent_class(Integer present_class) {
		this.present_class = present_class;
	}
	@JsonProperty(value="presentClassSec", access=JsonProperty.Access.READ_ONLY)
	public String getPresent_class_sec() {
		return present_class_sec;
	}
	@JsonProperty(value="present_class_sec", access=JsonProperty.Access.WRITE_ONLY)
	public void setPresent_class_sec(String present_class_sec) {
		this.present_class_sec = present_class_sec;
	}
	@JsonProperty(value="previousClass", access=JsonProperty.Access.READ_ONLY)
	public Integer getPrevious_class() {
		return previous_class;
	}
	@JsonProperty(value="previous_class", access=JsonProperty.Access.WRITE_ONLY)
	public void setPrevious_class(Integer previous_class) {
		this.previous_class = previous_class;
	}
	@JsonProperty(value="previousClassSec", access=JsonProperty.Access.READ_ONLY)
	public String getPrevious_class_sec() {
		return previous_class_sec;
	}
	@JsonProperty(value="previous_class_sec", access=JsonProperty.Access.WRITE_ONLY)
	public void setPrevious_class_sec(String previous_class_sec) {
		this.previous_class_sec = previous_class_sec;
	}
	@JsonProperty(value="rollNumber", access=JsonProperty.Access.READ_ONLY)
	public String getRoll_number() {
		return roll_number;
	}
	@JsonProperty(value="roll_number", access=JsonProperty.Access.WRITE_ONLY)
	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	@JsonProperty(value="lastResultStatus", access=JsonProperty.Access.READ_ONLY)
	public Integer getLast_result_status() {
		return last_result_status;
	}
	@JsonProperty(value="last_result_status", access=JsonProperty.Access.WRITE_ONLY)
	public void setLast_result_status(Integer last_result_status) {
		this.last_result_status = last_result_status;
	}
	@JsonProperty(value="dateFirstAdmission", access=JsonProperty.Access.READ_ONLY)
	public Date getDate_first_admission() {
		return date_first_admission;
	}
	@JsonProperty(value="date_first_admission", access=JsonProperty.Access.WRITE_ONLY)
	public void setDate_first_admission(Date date_first_admission) {
		this.date_first_admission = date_first_admission;
	}
	@JsonProperty(value="failedYn", access=JsonProperty.Access.READ_ONLY)
	public String getFailed_yn() {
		return failed_yn;
	}
	@JsonProperty(value="failed_yn", access=JsonProperty.Access.WRITE_ONLY)
	public void setFailed_yn(String failed_yn) {
		this.failed_yn = failed_yn;
	}
	@JsonProperty(value="failCountSameClass", access=JsonProperty.Access.READ_ONLY)
	public String getFail_count_same_class() {
		return fail_count_same_class;
	}
	@JsonProperty(value="fail_count_same_class", access=JsonProperty.Access.WRITE_ONLY)
	public void setFail_count_same_class(String fail_count_same_class) {
		this.fail_count_same_class = fail_count_same_class;
	}
	@JsonProperty(value="feeConcessionYn", access=JsonProperty.Access.READ_ONLY)
	public String getFee_concession_yn() {
		return fee_concession_yn;
	}
	@JsonProperty(value="fee_concession_yn", access=JsonProperty.Access.WRITE_ONLY)
	public void setFee_concession_yn(String fee_concession_yn) {
		this.fee_concession_yn = fee_concession_yn;
	}
	@JsonProperty(value="feeConcessionNature", access=JsonProperty.Access.READ_ONLY)
	public String getFee_concession_nature() {
		return fee_concession_nature;
	}
	@JsonProperty(value="fee_concession_nature", access=JsonProperty.Access.WRITE_ONLY)
	public void setFee_concession_nature(String fee_concession_nature) {
		this.fee_concession_nature = fee_concession_nature;
	}
	@JsonProperty(value="rollStruckDate", access=JsonProperty.Access.READ_ONLY)
	public Date getRoll_struck_date() {
		return roll_struck_date;
	}
	@JsonProperty(value="roll_struck_date", access=JsonProperty.Access.WRITE_ONLY)
	public void setRoll_struck_date(Date roll_struck_date) {
		this.roll_struck_date = roll_struck_date;
	}
	@JsonProperty(value="lastAttendanceDate", access=JsonProperty.Access.READ_ONLY)
	public String getLast_attendance_date() {
		return last_attendance_date;
	}
	@JsonProperty(value="last_attendance_date", access=JsonProperty.Access.WRITE_ONLY)
	public void setLast_attendance_date(String last_attendance_date) {
		this.last_attendance_date = last_attendance_date;
	}
	@JsonProperty(value="schoolDaysAsOnDate", access=JsonProperty.Access.READ_ONLY)
	public String getSchool_days_as_on_date() {
		return school_days_as_on_date;
	}
	@JsonProperty(value="school_days_as_on_date", access=JsonProperty.Access.WRITE_ONLY)
	public void setSchool_days_as_on_date(String school_days_as_on_date) {
		this.school_days_as_on_date = school_days_as_on_date;
	}
	@JsonProperty(value="attendance", access=JsonProperty.Access.READ_ONLY)
	public String getAttendance() {
		return attendance;
	}
	@JsonProperty(value="attendance", access=JsonProperty.Access.WRITE_ONLY)
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	@JsonProperty(value="nccScoutGuide", access=JsonProperty.Access.READ_ONLY)
	public String getNcc_scout_guide() {
		return ncc_scout_guide;
	}
	@JsonProperty(value="ncc_scout_guide", access=JsonProperty.Access.WRITE_ONLY)
	public void setNcc_scout_guide(String ncc_scout_guide) {
		this.ncc_scout_guide = ncc_scout_guide;
	}
	@JsonProperty(value="totalMeetingsHeld", access=JsonProperty.Access.READ_ONLY)
	public String getTotal_meetings_held() {
		return total_meetings_held;
	}
	@JsonProperty(value="total_meetings_held", access=JsonProperty.Access.WRITE_ONLY)
	public void setTotal_meetings_held(String total_meetings_held) {
		this.total_meetings_held = total_meetings_held;
	}
	@JsonProperty(value="totalMeetingsAttended", access=JsonProperty.Access.READ_ONLY)
	public String getTotal_meetings_attended() {
		return total_meetings_attended;
	}
	@JsonProperty(value="total_meetings_attended", access=JsonProperty.Access.WRITE_ONLY)
	public void setTotal_meetings_attended(String total_meetings_attended) {
		this.total_meetings_attended = total_meetings_attended;
	}
	@JsonProperty(value="remarks", access=JsonProperty.Access.READ_ONLY)
	public String getRemarks() {
		return remarks;
	}
	@JsonProperty(value="remarks", access=JsonProperty.Access.WRITE_ONLY)
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@JsonProperty(value="subjectOffered", access=JsonProperty.Access.READ_ONLY)
	public String getSubject_offered() {
		return subject_offered;
	}
	@JsonProperty(value="subject_offered", access=JsonProperty.Access.WRITE_ONLY)
	public void setSubject_offered(String subject_offered) {
		this.subject_offered = subject_offered;
	}
	@JsonProperty(value="postOffice", access=JsonProperty.Access.READ_ONLY)
	public String getPost_office() {
		return post_office;
	}
	@JsonProperty(value="post_office", access=JsonProperty.Access.WRITE_ONLY)
	public void setPost_office(String post_office) {
		this.post_office = post_office;
	}
	@JsonProperty(value="postOfficeParent", access=JsonProperty.Access.READ_ONLY)
	public String getPost_office_parent() {
		return post_office_parent;
	}
	@JsonProperty(value="post_office_parent", access=JsonProperty.Access.WRITE_ONLY)
	public void setPost_office_parent(String post_office_parent) {
		this.post_office_parent = post_office_parent;
	}
	@JsonProperty(value="postOfficeGuardian", access=JsonProperty.Access.READ_ONLY)
	public String getPost_office_guardian() {
		return post_office_guardian;
	}
	@JsonProperty(value="post_office_guardian", access=JsonProperty.Access.WRITE_ONLY)
	public void setPost_office_guardian(String post_office_guardian) {
		this.post_office_guardian = post_office_guardian;
	}
	
	
}
