package in.gov.udiseplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.NoDuesMaster;
import in.gov.udiseplus.model.StudentAcademicDetails;

@Repository
public interface NoDuesMasterRepository extends CrudRepository<NoDuesMaster, Integer> {
	List<NoDuesMaster> findBySchoolMgtId(Integer managentId);
}
