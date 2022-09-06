package in.gov.udiseplus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.StudentParentDetails;

@Repository
public interface StudentParentDetailsRepository extends CrudRepository<StudentParentDetails, Integer> {
	StudentParentDetails findByStudentId(Integer schoolId);	
}
