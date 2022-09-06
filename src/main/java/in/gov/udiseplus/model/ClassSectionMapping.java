package in.gov.udiseplus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "class_section_mapping")
@IdClass(ClassSectionMappingId.class)
public class ClassSectionMapping implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8389503750830496105L;

	@Column(name = "school_id")
	private Integer schoolId;
	
	@Id
	@Column(name = "udise_sch_code")
	private String udiseSchCode;
	
	@Id
	@Column(name = "school_class")
	private Integer schoolClassName;
	
	@Column(name = "class_section")
	private String[] classSection;
	
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

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getUdiseSchCode() {
		return udiseSchCode;
	}

	public void setUdiseSchCode(String udiseSchCode) {
		this.udiseSchCode = udiseSchCode;
	}

	public Integer getSchoolClassName() {
		return schoolClassName;
	}

	public void setSchoolClassName(Integer schoolClassName) {
		this.schoolClassName = schoolClassName;
	}

	public String[] getClassSection() {
		return classSection;
	}

	public void setClassSection(String[] classSection) {
		this.classSection = classSection;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
