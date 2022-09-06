package in.gov.udiseplus.dto;



import java.io.Serializable;
import java.util.List;

import in.gov.udiseplus.model.ClassSubject;
import in.gov.udiseplus.model.FormStatus;
import in.gov.udiseplus.model.NoDuesCertificate;
import in.gov.udiseplus.model.StudentAcademicDetails;
import in.gov.udiseplus.model.StudentDetails;
import in.gov.udiseplus.model.StudentParentDetails;
import in.gov.udiseplus.model.StudentProfile;
import in.gov.udiseplus.model.TcApproval;
import in.gov.udiseplus.model.UserProfile;

public class RequestDTO implements Serializable{
	private StudentDetails studentDetails;
	private StudentAcademicDetails studentAcademicDetails;
	private StudentParentDetails studentParentDetails;
	private List<NoDuesCertificate> noDuesCertificate;
	private List<FormStatus>  formStatus;
	private TcApproval tcApproval;
	private UserProfile  userProfile;
	private ClassSubject  classSubject;
	private StudentProfile studentProfile;
	
	
	
	private List<StudentDetails> getStudentDetails;

	public StudentDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public List<StudentDetails> getGetStudentDetails() {
		return getStudentDetails;
	}

	public void setGetStudentDetails(List<StudentDetails> getStudentDetails) {
		this.getStudentDetails = getStudentDetails;
	}

	public StudentAcademicDetails getStudentAcademicDetails() {
		return studentAcademicDetails;
	}

	public void setStudentAcademicDetails(StudentAcademicDetails studentAcademicDetails) {
		this.studentAcademicDetails = studentAcademicDetails;
	}

	public StudentParentDetails getStudentParentDetails() {
		return studentParentDetails;
	}

	public void setStudentParentDetails(StudentParentDetails studentParentDetails) {
		this.studentParentDetails = studentParentDetails;
	}

	public List<NoDuesCertificate> getNoDuesCertificate() {
		return noDuesCertificate;
	}

	public void setNoDuesCertificate(List<NoDuesCertificate> noDuesCertificate) {
		this.noDuesCertificate = noDuesCertificate;
	}

	public List<FormStatus> getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(List<FormStatus> formStatus) {
		this.formStatus = formStatus;
	}

	public TcApproval getTcApproval() {
		return tcApproval;
	}

	public void setTcApproval(TcApproval tcApproval) {
		this.tcApproval = tcApproval;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public ClassSubject getClassSubject() {
		return classSubject;
	}

	public void setClassSubject(ClassSubject classSubject) {
		this.classSubject = classSubject;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}

	
	
}
