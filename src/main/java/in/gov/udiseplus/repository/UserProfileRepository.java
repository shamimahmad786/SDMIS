package in.gov.udiseplus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.StudentParentDetails;
import in.gov.udiseplus.model.UserProfile;

@Repository
public interface UserProfileRepository   extends CrudRepository<UserProfile, Integer>{
	UserProfile findByApplicantUserid(String applicationId);
}
