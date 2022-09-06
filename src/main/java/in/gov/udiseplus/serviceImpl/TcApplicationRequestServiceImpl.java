package in.gov.udiseplus.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import in.gov.udiseplus.bean.ApplidedTc;
import in.gov.udiseplus.bean.FormsStatus;
import in.gov.udiseplus.bean.ListApplidedTc;
import in.gov.udiseplus.bean.NativeRepository;
import in.gov.udiseplus.bean.QueryResult;
import in.gov.udiseplus.bean.StaticResultBean;
import in.gov.udiseplus.bean.StudentAllData;
import in.gov.udiseplus.bean.StudentByUdise;
import in.gov.udiseplus.bean.UserBean;
import in.gov.udiseplus.constants.Messages;
import in.gov.udiseplus.dto.RequestDTO;
import in.gov.udiseplus.dto.ResponseDTO;
import in.gov.udiseplus.master.MasterData;
import in.gov.udiseplus.model.ClassSubject;
import in.gov.udiseplus.model.FormStatus;
import in.gov.udiseplus.model.NoDuesCertificate;
import in.gov.udiseplus.model.NoDuesMaster;
import in.gov.udiseplus.model.StudentAcademicDetails;
import in.gov.udiseplus.model.StudentDetails;
import in.gov.udiseplus.model.StudentParentDetails;
import in.gov.udiseplus.model.StudentProfile;
import in.gov.udiseplus.model.TcApproval;
import in.gov.udiseplus.model.UserProfile;
import in.gov.udiseplus.repository.ClassSubjectRepository;
import in.gov.udiseplus.repository.FormStatusRepository;
import in.gov.udiseplus.repository.NoDuesCertificateRepository;
import in.gov.udiseplus.repository.NoDuesMasterRepository;
import in.gov.udiseplus.repository.OccupationMasterRepository;
import in.gov.udiseplus.repository.StudentAcademicDetailsRepository;
import in.gov.udiseplus.repository.StudentDetailsRepository;
import in.gov.udiseplus.repository.StudentParentDetailsRepository;
import in.gov.udiseplus.repository.StudentProfileRepository;
import in.gov.udiseplus.repository.TcApprovalRepository;
import in.gov.udiseplus.repository.TcReasonMasterRepository;
import in.gov.udiseplus.repository.UserProfileRepository;
import in.gov.udiseplus.service.TcApplicationRequestService;

@Service
public class TcApplicationRequestServiceImpl implements TcApplicationRequestService {

	@Autowired
	StudentDetailsRepository studentDetailsRepository;
	
	@Autowired
	StudentAcademicDetailsRepository studentAcademicDetailsRepository;
	
	@Autowired
	StudentParentDetailsRepository studentParentDetailsRepository;
	
	@Autowired
	NoDuesMasterRepository noDuesMasterRepository;
	@Autowired
	NoDuesCertificateRepository noDuesCertificateRepository;
	
	@Autowired
	FormStatusRepository  formStatusRepository;
	
	@Autowired
	TcApprovalRepository tcApprovalRepository;
	
	@Autowired
	UserProfileRepository userProfileRepository;

	@Autowired
	ClassSubjectRepository  classSubjectRepository;
	
	@Autowired
	StudentProfileRepository studentProfileRepository;
	
	@Autowired
	NativeRepository nativeRepository;
	
	@Autowired
	OccupationMasterRepository  occupationMasterRepository;
	
	@Autowired
	TcReasonMasterRepository tcReasonMasterRepository;
	
//	 @Autowired
//	 RestTemplate restTemplate;
	
	
	@Override
	public ResponseEntity<?> saveStudentDetails(RequestDTO requestDTO) {
		
		
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getStudentDetails() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		StudentDetails toUpdateStudentDetails = requestDTO.getStudentDetails();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
//			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		StudentDetails updatedStudentDetail=null;
		StudentDetails existing = studentDetailsRepository.findByStudentId(toUpdateStudentDetails.getStudentId());
		// System.out.println("existing--------------------->"+existing);
		if(existing !=null) {
		
		
		
		copyNonNullProperties(toUpdateStudentDetails, existing);
		 updatedStudentDetail = studentDetailsRepository.save(existing);
		}else {
		 updatedStudentDetail = studentDetailsRepository.save(toUpdateStudentDetails);
		}
		
		
		
		// System.out.println(updatedStudentDetail.getStudentName());
		StudentDetails updatedStudentDetails =null;
		try {
			updatedStudentDetail.setTcId("KVB000"+updatedStudentDetail.getStudentId());		
			updatedStudentDetails = studentDetailsRepository.save(updatedStudentDetail);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		if(updatedStudentDetail == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedStudentDetails));
		}
		
		
//		if (null != studentDetail) {
//			requestDTO.getClassMapping().setStudentId(studentBasicDetail.getRecordId());
//			StdClassSectionMapping classSectionObj = sectionClassRepo.save(requestDTO.getClassMapping());
//			studentBasicDetail.setClassSectionId(classSectionObj.getRecordId());
//			basicDetailRepo.save(studentBasicDetail);
//			responceDto.setStudentBasicDetail(Optional.ofNullable(studentBasicDetail));
//			responceDto.setStatusCode(ResponceCode.App001.getStatusCode());
//			responceDto.setDescription(ResponceCode.App001.getStatusDesc());
//		}
		return null;
	}
	
	
	public static void copyNonNullProperties(Object src, Object target) {
	    BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
	}

	public static String[] getNullPropertyNames (Object source) {
	    final BeanWrapper src = new BeanWrapperImpl(source);
	    java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

	    Set<String> emptyNames = new HashSet<String>();
	    for(java.beans.PropertyDescriptor pd : pds) {
	        Object srcValue = src.getPropertyValue(pd.getName());
	        if (srcValue == null) emptyNames.add(pd.getName());
	    }
	    String[] result = new String[emptyNames.size()];
	    return emptyNames.toArray(result);
	}
	
	
	
	@Override
	public ResponseEntity<?> getStudentDetails(String applicantId){
		if(applicantId == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		List<StudentDetails> studentdetails = studentDetailsRepository.findAllByApplicantUserid(applicantId);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,studentdetails));
	}
	
	
	@Override
	public ResponseEntity<?> saveStudentAcademicDetails(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getStudentAcademicDetails() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		StudentAcademicDetails toUpdateStudentDetails = requestDTO.getStudentAcademicDetails();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
		}
		StudentAcademicDetails updatedStudentDetail=null;
		List<StudentAcademicDetails> existing = studentAcademicDetailsRepository.findByStudentId(toUpdateStudentDetails.getStudentId());
		if(existing.size()>0) {
//			List<StudentAcademicDetails> existing = studentAcademicDetailsRepository.findByStudentId(toUpdateStudentDetails.getStudentId());
			copyNonNullProperties(toUpdateStudentDetails, existing.get(0));
			updatedStudentDetail = studentAcademicDetailsRepository.save(existing.get(0));
		}else {
			updatedStudentDetail = studentAcademicDetailsRepository.save(toUpdateStudentDetails);	
		}
		
		 
		
		if(updatedStudentDetail == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedStudentDetail));
		}
		return null;
	}
	
	@Override
	public ResponseEntity<?> getStudentAcademicDetails(Integer studentId ){
		if(studentId == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		List<StudentAcademicDetails> academicdetails = studentAcademicDetailsRepository.findByStudentId(studentId);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,academicdetails));
	}
	
	@Override
	public ResponseEntity<?> saveParentDetails(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getStudentParentDetails() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		StudentParentDetails toParentDetails = requestDTO.getStudentParentDetails();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
		}
		
		StudentParentDetails updatedParentDetail=null;
		StudentParentDetails existing = studentParentDetailsRepository.findByStudentId(toParentDetails.getStudentId());
		if(existing !=null) {
			
			copyNonNullProperties(toParentDetails, existing);
			updatedParentDetail = studentParentDetailsRepository.save(existing);
		}else {
			updatedParentDetail = studentParentDetailsRepository.save(toParentDetails);
		}
		
		 
		
		if(updatedParentDetail == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedParentDetail));
		}
		return null;
	}
	
	@Override
	public ResponseEntity<?> getParentDetails(Integer studentId ){
		if(studentId == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
	StudentParentDetails parentDetails = studentParentDetailsRepository.findByStudentId(studentId);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,parentDetails));
	}
	
	@Override
	public ResponseEntity<?> getNoDues(Integer managementId){
		if(managementId == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		// System.out.println("managementId---->"+managementId);
		
		List<NoDuesMaster> noduesMaster = noDuesMasterRepository.findBySchoolMgtId(managementId);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,noduesMaster));
	}
	
	@Override
	public ResponseEntity<?> saveDuesCertificate(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getNoDuesCertificate() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		List<NoDuesCertificate> toParentDetails = requestDTO.getNoDuesCertificate();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
		}
		
		Iterable<NoDuesCertificate> updatedParentDetail = noDuesCertificateRepository.saveAll(toParentDetails);
		
		if(updatedParentDetail == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedParentDetail));
		}
		return null;
	}
	
	@Override
	public ResponseEntity<?> getDuesCertificate(Integer studentId){
		if(studentId == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		// System.out.println("managementId---->"+studentId);
		
		Iterable<NoDuesCertificate> noduesMaster = noDuesCertificateRepository.findByStudentId(studentId);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,noduesMaster));
	}
	
	@Override
	public ResponseEntity<?> saveFormStatus(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getFormStatus() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		List<FormStatus> toStatusDetails = requestDTO.getFormStatus();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
		}
		
		Iterable<FormStatus> updatedStatusDetail = formStatusRepository.saveAll(toStatusDetails);
		
		if(updatedStatusDetail == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedStatusDetail));
		}
		return null;
	}
	
	@Override
	public ResponseEntity<?>  getFormStatus(Integer studentId){
		if(studentId == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		Iterable<FormStatus> formStatusDetail = formStatusRepository.findByStudentId(studentId);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,formStatusDetail));
	}
	@Override
	public ResponseEntity<?> saveTcApproval(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getTcApproval() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		TcApproval toTcDetails = requestDTO.getTcApproval();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
		}
		
		TcApproval updatedTcDetail = tcApprovalRepository.save(toTcDetails);
		
		if(updatedTcDetail == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedTcDetail));
		}
		return null;
	}
	
	@Override
	public ResponseEntity<?> saveUserProfile(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getUserProfile() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		UserProfile toTcDetails = requestDTO.getUserProfile();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
		}
		
		UserProfile updatedUserProfile = userProfileRepository.save(toTcDetails);
		
		try {
			if(updatedUserProfile.getId() !=null) {
				
				UserBean userObj=new UserBean();
				
				RestTemplate restTemplate = new RestTemplate();
				 HttpHeaders headers = new HttpHeaders();
//			      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			      HttpEntity <String> entity = new HttpEntity<String>(headers);
			      MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();     
			      userObj.setFirstname(updatedUserProfile.getName());
			      userObj.setLastname("");
			      userObj.setUsername(updatedUserProfile.getApplicantUserid());
			      userObj.setPassword("$2a$10$gPhlXZfms0EpNHX0.HHptOhoFD1AoxSr/yUIdTqA8vtjeP4zi0DDu");
			      userObj.setMobile(updatedUserProfile.getApplicantUserid());
			      userObj.setEmail(updatedUserProfile.getEmail());
			      userObj.setEnable("1");
			      userObj.setAccountNonExpired("1");
			      userObj.setCredentialsNonExpired("1");
			      userObj.setAccountNonLocked("1");
			      

			      // Note the body object as first parameter!
			      HttpEntity<?> httpEntity = new HttpEntity<Object>(userObj, headers);
			      
			      String userResponse= restTemplate.exchange("http://10.25.26.251:8090/meuser/api/user/create-user", HttpMethod.POST, httpEntity, String.class).getBody();
			      // System.out.println("userResponse--->"+userResponse);
			}
		}catch(Exception ex) {
			// System.out.println("Error in profile creation");
			ex.printStackTrace();
		}
		
		
		
		if(updatedUserProfile == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedUserProfile));
		}
		return null;
	}
	
	@Override
	public ResponseEntity<?>  getUserProfile(String userApplication){
		if(userApplication == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		UserProfile formStatusDetail = userProfileRepository.findByApplicantUserid(userApplication);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,formStatusDetail));
	}



	@Override
	public ResponseEntity<?> getTcApproval(String tcId) {
		if(tcId == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		TcApproval formStatusDetail = tcApprovalRepository.findByTcId(tcId);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,formStatusDetail));
	}
	
	@Override
	public ResponseEntity<?> getSubjectByClass(Integer className){
		if(className == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		Iterable<ClassSubject> formStatusDetail = classSubjectRepository.findByClassName(className);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,formStatusDetail));
//		return null;
		
	}
	
	@Override
	public ResponseEntity<?> saveStudentProfile(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 1");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		if(requestDTO.getStudentProfile() == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		StudentProfile toTcDetails = requestDTO.getStudentProfile();
		boolean studentDetailsValidation = false;
		
		if(!studentDetailsValidation) {
			// System.out.println("Some Error in form validation");
		}
		
		StudentProfile updatedStudentProfile = studentProfileRepository.save(toTcDetails);
		
	
		
		if(updatedStudentProfile == null) {
			// System.out.println("Student Details data could not be saved");
		} else {
			return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,updatedStudentProfile));
		}
		return null;
	}
	
	@Override
	public ResponseEntity<?> getStudentProfile(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		Iterable<StudentProfile> formStatusDetail = studentProfileRepository.findAllByApplicantUserid(requestDTO.getStudentProfile().getApplicantUserid());
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,formStatusDetail));
	}
	
	@Override
	public ResponseEntity<?> getStudentByUdiseSchCode(RequestDTO requestDTO){
		List studentList=new ArrayList<>();
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
	String sql=	"select sd.student_id,sd.student_name,sd.student_dob,sd.student_category,sd.student_blood_group,sd.student_nationality,sd.admission_num,sd.state_id,sd.district_id,sd.udise_state_code,sd.udise_district_code,sd.school_id,sd.school_name,sd.udise_sch_code,\r\n"
			+ "sd.student_address,sd.student_address2,sd.pincode,sd.post_office,sd.tc_reason,sd.student_relationship,sd.applicant_userid,sd.tc_id,fs2.id,fs2.student_id,fs2.student_details_form,fs2.academic_details_form,fs2.parent_deails_form,fs2.no_dues_form,fs2.teacher_form,\r\n"
			+ "fs2.tc_status,fs2.form_type from student_details sd left join form_status fs2  on sd.student_id =fs2.student_id where sd.udise_sch_code ='"+requestDTO.getStudentDetails().getUdiseSchCode()+"'";
		
	     ObjectMapper mapper = new ObjectMapper();
	     mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
	     ListApplidedTc lst=new ListApplidedTc();
	   	 QueryResult qrObj = nativeRepository.executeQueries(sql);
		for(int i=0;i<qrObj.getRowValue().size();i++) {
			StudentByUdise pojo = mapper.convertValue(qrObj.getRowValue().get(i),StudentByUdise.class);
			studentList.add(pojo);
		}
		lst.setLt(studentList);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,lst));
		
//		Iterable<StudentDetails> studentDetailsByUdise = studentDetailsRepository.findByUdiseSchCode(requestDTO.getStudentDetails().getUdiseSchCode());
//		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,studentDetailsByUdise));
	}
	
//	@Override
//	public ResponseEntity<?> getTCStatus(RequestDTO requestDTO){
//		if(requestDTO == null) {
//			// System.out.println("Some Error Occurred 2");
//			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
//		}
//		Iterable<StudentDetails> studentDetailsByUdise = studentDetailsRepository.findByUdiseSchCode(requestDTO.getStudentDetails().getUdiseSchCode());
//		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,studentDetailsByUdise));
//	}
	
	@Override
	public ResponseEntity<?>  getTCStatus(RequestDTO requestDTO){
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		Iterable<FormStatus> formStatusDetail = formStatusRepository.findByTcId(requestDTO.getFormStatus().get(0).getTcId());
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,formStatusDetail));
	}
	
	@Override
	public ResponseEntity<?>  getAppliedTc(RequestDTO requestDTO){
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
		ListApplidedTc lst=new ListApplidedTc();
	List studentList=new ArrayList<>();
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		StaticResultBean rsObj=new StaticResultBean();
		
		// System.out.println("Status---->"+requestDTO.getGetStudentDetails().get(0).getApplicantUserid());
		
		String sql="select sd.*,fs2.id,fs2.student_details_form as student_details_form,fs2.id,fs2.academic_details_form,fs2.parent_deails_form,fs2.no_dues_form,fs2.teacher_form,fs2.tc_status from student_details sd left join form_status fs2 on sd.student_id =fs2.student_id where sd.applicant_userid ='"+requestDTO.getGetStudentDetails().get(0).getApplicantUserid()+"'";
		// System.out.println(sql);
		QueryResult qrObj = nativeRepository.executeQueries(sql);
//		staticReportBean.setColumnName(qrObj.getColumnName());
//		// System.out.println("List Data--->"+qrObj.getRowValue());
//		List<ApplidedTc> myObjects = mapper.readValue(qrObj.getRowValue(), new TypeReference<List<ApplidedTc>>(){});
//		lst.setLt(qrObj.getRowValue());
//		ObjectMapper mapper = new ObjectMapper();
		for(int i=0;i<qrObj.getRowValue().size();i++) {
			ApplidedTc pojo = mapper.convertValue(qrObj.getRowValue().get(i),ApplidedTc.class);
			studentList.add(pojo);
			
			
			
//			try {
//				ApplidedTc myObjects = mapper.readValue(pojo.toString(), ApplidedTc.class);
//				// System.out.println(myObjects.getStudentId());
//			} catch (JsonProcessingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			// System.out.println(pojo.toString());
		}
		
		lst.setLt(studentList);
//		// System.out.println("pojo data --->"+pojo.get(0).getStudentId());
		
		
//		rsObj.setRowValue(qrObj.getRowValue());
//		return staticReportBean;
		
		
//		Iterable<FormStatus> formStatusDetail = formStatusRepository.findByTcId(requestDTO.getFormStatus().get(0).getTcId());
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,lst));
	}
	
	@Override
	public ResponseEntity<?>  getStudentAllData(RequestDTO requestDTO){
		MasterData masterObj=new MasterData();
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
		ListApplidedTc lst=new ListApplidedTc();
	    List studentList=new ArrayList<>();
		
		
		Map<Object,Object> studentObject=new HashMap<Object,Object>();
		
		if(requestDTO == null) {
			// System.out.println("Some Error Occurred 2");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		StaticResultBean rsObj=new StaticResultBean();
		
		// System.out.println("Status---->"+requestDTO.getStudentDetails().getStudentId());
		
		String sql="select sd.student_id,sd.student_name,sd.student_dob,sd.student_category,sd.student_blood_group,sd.admission_num\r\n"
				+ ",sd.state_id,sd.district_id,sd.udise_state_code,sd.udise_district_code,sd.school_id,sd.school_name,sd.udise_sch_code\r\n"
				+ ",sd.student_address, get_film6('tc_reason','reason','id=(select tc_reason from student_details where student_id ="+requestDTO.getStudentDetails().getStudentId()+")') as tc_reason,sd.applicant_userid,sd.tc_id,sd.student_relationship,sd.pincode,sd.post_office,sd.student_address2,sd.student_nationality, spd.name_father,get_film6('occupation_master','occupation','id=(select occupation_father from student_parent_details where student_id ="+requestDTO.getStudentDetails().getStudentId()+")') as occupation_father,spd.nationality_father,spd.blood_group_father,spd.name_mother,get_film6('occupation_master','occupation','id=(select occupation_mother from student_parent_details where student_id ="+requestDTO.getStudentDetails().getStudentId()+")') as occupation_mother,spd.nationality_mother,spd.blood_group_mother\r\n"
				+ ",spd.guardian_yn,spd.name_guardian,spd.address_guardian,spd.tc_id,spd.address_guardian2,spd.mobile_guardian,spd.nationality_guardian,get_film6('occupation_master','occupation','id=(select occupation_guardian from student_parent_details where student_id ="+requestDTO.getStudentDetails().getStudentId()+")') as occupation_guardian\r\n"
				+ ",spd.parent_address,spd.parent_address2,spd.pincode, spd.post_office_parent,spd.pincode_guardian,spd.post_office_guardian,spd.father_mobile,spd.mother_mobile ,sad.school_id,sad.udise_sch_code,sad.present_class,sad.present_class_sec,sad.previous_class,sad.previous_class_sec,sad.roll_number,sad.last_result_status,sad.date_first_admission,sad.failed_yn,sad.fail_count_same_class\r\n"
				+ ",sad.fee_concession_yn,sad.fee_concession_nature,sad.roll_struck_date,sad.last_attendance_date,sad.school_days_as_on_date,sad.attendance,sad.ncc_scout_guide,sad.total_meetings_held,sad.total_meetings_attended,sad.remarks,sad.tc_id,sad.subject_offered  from student_details sd left join student_academic_details sad on sd.student_id =sad.student_id left join student_parent_details spd on sad.student_id =spd.student_id where sd.student_id ='"+requestDTO.getStudentDetails().getStudentId()+"'";
		// System.out.println(sql);
//		sd.tc_reason
		
		QueryResult qrObj = nativeRepository.executeQueries(sql);
//		staticReportBean.setColumnName(qrObj.getColumnName());
		
		
		
//		for(int i=0;i<qrObj.getRowValue().size();i++) {
			StudentAllData pojo = mapper.convertValue(qrObj.getRowValue().get(0),StudentAllData.class);
		
			pojo.setStudent_category(masterObj.getSoclmaster().get(Integer.parseInt(pojo.getStudent_category())));
			pojo.setStudent_blood_group(masterObj.getBldmaster().get(Integer.parseInt(pojo.getStudent_blood_group())));
//			pojo.setTc_reason(select  get_film6('tc_reason','reason','id=1'));
//			studentList.add(pojo);
//		}
//		lst.setLt(studentList);
		studentObject.put("StudentDetails", pojo);
		String statusSql="select id,student_details_form,academic_details_form,parent_deails_form,no_dues_form,tc_status,form_type from form_status where student_id='"+requestDTO.getStudentDetails().getStudentId()+"'";
		QueryResult statusObj = nativeRepository.executeQueries(statusSql);
		FormsStatus statusPojo = mapper.convertValue(statusObj.getRowValue().get(0),FormsStatus.class);
//		String statusSql="select student_details_form,academic_details_form,parent_deails_form,no_dues_form,tc_status,form_type from form_status where student_id='"+requestDTO.getStudentDetails().getStudentId()+"'";
//		QueryResult statusObj = nativeRepository.executeQueries(statusSql);
		
		studentObject.put("formStatus", statusPojo);
		studentObject.put("noDues", "");
		studentObject.put("tcApprovel", "");
//		rsObj.setRowValue(qrObj.getRowValue());
		

//		return staticReportBean;
		
		
//		Iterable<FormStatus> formStatusDetail = formStatusRepository.findByTcId(requestDTO.getFormStatus().get(0).getTcId());
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,studentObject));
	}
	
	
	@Override
	public ResponseEntity<?>  getAllMaster(){
		HashMap<String, Object> mp=new HashMap<String, Object>();
		MasterData msObj=new MasterData();
		mp.put("bloodMaster",  msObj.getBldmaster());
		mp.put("categoryMaster",msObj.getSoclmaster());
		mp.put("occupation",  occupationMasterRepository.findAll());
		mp.put("tcReason",  tcReasonMasterRepository.findAll());
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,mp));
	}
	
	
	@Override
	public ResponseEntity<?>  getPostOffice(Integer pincode){
		// System.out.println("pincode---"+pincode);
		if(pincode == null) {
			// System.out.println("Pincode is null");
			return ResponseEntity.ok(new ResponseDTO(Messages.ERROR));
		}
		
		String sql="select sp.office_name from sdmis_pincode sp where pincode ="+pincode;
		// System.out.println(sql);
		QueryResult qrObj = nativeRepository.executeQueries(sql);
		return ResponseEntity.ok(new ResponseDTO(Messages.SUCCESS,qrObj.getRowValue()));
	}
	
	
	
	
	
		
}
