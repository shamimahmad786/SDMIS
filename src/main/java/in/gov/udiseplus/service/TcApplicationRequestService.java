package in.gov.udiseplus.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import in.gov.udiseplus.dto.RequestDTO;


public interface TcApplicationRequestService {
	
	public ResponseEntity<?> saveStudentDetails(RequestDTO requestDTO);
	public ResponseEntity<?> getStudentDetails(String applicantUserId);
	public ResponseEntity<?> saveStudentAcademicDetails(RequestDTO requestDTO);
	public ResponseEntity<?> getStudentAcademicDetails(Integer studentId);
	public ResponseEntity<?> saveParentDetails(RequestDTO requestDTO);
	public ResponseEntity<?> getParentDetails(Integer studentId);
	public ResponseEntity<?> getNoDues(Integer managementId);
	public ResponseEntity<?> saveDuesCertificate(RequestDTO requestDTO);
	public ResponseEntity<?> saveFormStatus(RequestDTO requestDTO);
	public ResponseEntity<?> getFormStatus(Integer studentId);
	public ResponseEntity<?> getDuesCertificate(Integer studentId);
	public ResponseEntity<?> saveTcApproval(RequestDTO requestDTO);
	public ResponseEntity<?> getTcApproval(String tcId);
	public ResponseEntity<?> saveUserProfile(RequestDTO requestDTO);
	public ResponseEntity<?> getUserProfile(String applicantUserId);
	public ResponseEntity<?> getSubjectByClass(Integer className);
	public ResponseEntity<?> saveStudentProfile(RequestDTO requestDTO);
	public ResponseEntity<?> getStudentProfile(RequestDTO requestDTO);
	public ResponseEntity<?> getStudentByUdiseSchCode(RequestDTO requestDTO);
	public ResponseEntity<?> getTCStatus(RequestDTO requestDTO);
	public ResponseEntity<?> getAppliedTc(RequestDTO requestDTO);
	public ResponseEntity<?> getStudentAllData(RequestDTO requestDTO);
	public ResponseEntity<?> getAllMaster();
	public ResponseEntity<?> getPostOffice(Integer pincode);
	
}
