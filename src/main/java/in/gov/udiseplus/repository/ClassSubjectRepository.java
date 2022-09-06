package in.gov.udiseplus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.udiseplus.model.ClassSubject;
import in.gov.udiseplus.model.FormStatus;


@Repository
public interface ClassSubjectRepository extends CrudRepository<ClassSubject, Integer>{
	Iterable<ClassSubject>  findByClassName(Integer className);
}
