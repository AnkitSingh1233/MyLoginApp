package com.Curd.Operation.EmployeeModule;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees_RV1")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "CIRCULAR_NO")
	private Integer circular_No;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "FILE_LANGUAGE")
	private String fileLlanguage;

	@Column(name = "FILE_DESCRIPTION")
	private String file_Discription;

	@Column(name = "ISSUED_ON")
	private String dateOfIssued;

	@Column(name = "ISSUED_BY")
	private String issuedBy;

	@Column(name = "action")
	private String action;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCircular_No() {
		return circular_No;
	}

	public void setCircular_No(Integer circular_No) {
		this.circular_No = circular_No;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFileLlanguage() {
		return fileLlanguage;
	}

	public void setFileLlanguage(String fileLlanguage) {
		this.fileLlanguage = fileLlanguage;
	}

	public String getFile_Discription() {
		return file_Discription;
	}

	public void setFile_Discription(String file_Discription) {
		this.file_Discription = file_Discription;
	}

	public String getDateOfIssued() {
		return dateOfIssued;
	}

	public void setDateOfIssued(String dateOfIssued) {
		this.dateOfIssued = dateOfIssued;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", circular_No=" + circular_No + ", subject=" + subject + ", category=" + category
				+ ", fileLlanguage=" + fileLlanguage + ", file_Discription=" + file_Discription + ", dateOfIssued="
				+ dateOfIssued + ", issuedBy=" + issuedBy + ", action=" + action + "]";
	}
	
	
	
	
	

}
