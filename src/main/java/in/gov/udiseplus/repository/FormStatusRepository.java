package in.gov.udiseplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.FormStatus;
import in.gov.udiseplus.model.NoDuesCertificate;

@Repository
public interface FormStatusRepository extends CrudRepository<FormStatus, Integer>{
	
   List<FormStatus>	findByStudentId(Integer StudentId);
   List<FormStatus>	findByTcId(String StudentId);

}
