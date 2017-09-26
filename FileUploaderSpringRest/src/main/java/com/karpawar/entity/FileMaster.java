package com.karpawar.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "FileMaster")
public class FileMaster implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fileId", unique = true, nullable = false)
	private long titleId;

	@Column(name = "fileName")
	private String titleName;

	@Column(name = "fileExtension")
	private String fileExtension;

	@Column(name = "filePath")
	private String filePath;

	@Column(name = "fileSize")
	private String fileSize;

	@Column(name = "isActive", columnDefinition = "binary(1) default true", nullable = false)
	private Boolean isActive = true;

	@Column(name = "isDeleted", columnDefinition = "binary(1) default false", nullable = false)
	private Boolean isDeleted = false;

	@Column(name = "createdDatetime", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdDatetime;

	@Column(name = "updatedDatetime", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date updatedDatetime;

	public long getTitleId() {
		return titleId;
	}

	public void setTitleId(long titleId) {
		this.titleId = titleId;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Date getUpdatedDatetime() {
		return updatedDatetime;
	}

	public void setUpdatedDatetime(Date updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

}
