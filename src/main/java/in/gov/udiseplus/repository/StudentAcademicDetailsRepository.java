package in.gov.udiseplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.StudentAcademicDetails;

@Repository
public interface StudentAcademicDetailsRepository extends CrudRepository<StudentAcademicDetails, Integer> {
	
	List<StudentAcademicDetails> findByStudentId(Integer studentId);
	
	List<StudentAcademicDetails> findBySchoolId(Integer schoolId);
	
	List<StudentAcademicDetails> findByUdiseSchCode(String udiseSchCode);
	
	

}
