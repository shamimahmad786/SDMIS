package in.gov.udiseplus.repository;

import org.springframework.data.repository.CrudRepository;

import in.gov.udiseplus.model.TcApproval;
import in.gov.udiseplus.model.TcReasonMaster;

public interface TcReasonMasterRepository  extends CrudRepository<TcReasonMaster, String>{

}
