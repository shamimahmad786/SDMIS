package in.gov.udiseplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tc_reason")
public class TcReasonMaster {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "reason")
	private String reason;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
