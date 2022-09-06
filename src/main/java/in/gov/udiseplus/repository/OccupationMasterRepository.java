package in.gov.udiseplus.repository;

import org.springframework.data.repository.CrudRepository;

import in.gov.udiseplus.model.NoDuesMaster;
import in.gov.udiseplus.model.OccupationMaster;

public interface OccupationMasterRepository  extends CrudRepository<OccupationMaster, Integer> {

}
