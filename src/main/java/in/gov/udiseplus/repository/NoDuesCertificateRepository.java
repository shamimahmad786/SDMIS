package in.gov.udiseplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.NoDuesCertificate;
import in.gov.udiseplus.model.StudentAcademicDetails;

@Repository
public interface NoDuesCertificateRepository extends CrudRepository<NoDuesCertificate, Integer> {
List<NoDuesCertificate> findByStudentId(Integer studentId);
}
