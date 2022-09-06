package in.gov.udiseplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.gov.udiseplus.model.StudentDetails;
import in.gov.udiseplus.model.StudentParentDetails;
import in.gov.udiseplus.model.StudentProfile;

public interface StudentProfileRepository extends CrudRepository<StudentProfile, Integer> {
	Iterable<StudentProfile> findAllByApplicantUserid(String applicantId);
}
