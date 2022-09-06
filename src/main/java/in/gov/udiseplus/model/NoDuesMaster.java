package in.gov.udiseplus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "no_dues_master")
public class NoDuesMaster {

	@Id
	@Column(name = "no_dues_id")
	private Integer noDuesId; 
	
	@Column(name = "no_dues_desc")
	private String noDuesDesc;
	
	@Column(name = "school_mgt_id")
	private Integer schoolMgtId;
	
	@Column(name = "is_modified")
	private Integer ismodified;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_time")
	private Date createdTime;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "modified_time")
	private Date modifiedTime;

	public Integer getNoDuesId() {
		return noDuesId;
	}

	public void setNoDuesId(Integer noDuesId) {
		this.noDuesId = noDuesId;
	}

	public String getNoDuesDesc() {
		return noDuesDesc;
	}

	public void setNoDuesDesc(String noDuesDesc) {
		this.noDuesDesc = noDuesDesc;
	}

	public Integer getSchoolMgtId() {
		return schoolMgtId;
	}

	public void setSchoolMgtId(Integer schoolMgtId) {
		this.schoolMgtId = schoolMgtId;
	}

	public Integer getIsmodified() {
		return ismodified;
	}

	public void setIsmodified(Integer ismodified) {
		this.ismodified = ismodified;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
	
	
}
