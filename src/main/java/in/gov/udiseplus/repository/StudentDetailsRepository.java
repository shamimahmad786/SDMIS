package in.gov.udiseplus.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.StudentDetails;

@Repository
public interface StudentDetailsRepository extends CrudRepository<StudentDetails, Integer>{
	
	StudentDetails findByStudentId(Integer studentId);
	
	List<StudentDetails> findBySchoolId(Integer schoolId);
	
	List<StudentDetails> findByUdiseSchCode(String udiseSchCode);
	
	List<StudentDetails> findAllByApplicantUserid(String applicantId);

}
