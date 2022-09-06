package in.gov.udiseplus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.StudentParentDetails;
import in.gov.udiseplus.model.TcApproval;

@Repository
public interface TcApprovalRepository extends CrudRepository<TcApproval, String>{
	TcApproval findByTcId(String schoolId);	
}
