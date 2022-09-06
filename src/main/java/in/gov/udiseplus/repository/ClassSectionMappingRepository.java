package in.gov.udiseplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.ClassSectionMapping;
import in.gov.udiseplus.model.ClassSectionMappingId;

@Repository
public interface ClassSectionMappingRepository extends CrudRepository<ClassSectionMapping, ClassSectionMappingId>{
	
	ClassSectionMapping findByUdiseSchCodeAndSchoolClassName(String udiseSchCode, Integer className);
	
	List<ClassSectionMapping> findByUdiseSchCode(String udiseSchCode);

}
