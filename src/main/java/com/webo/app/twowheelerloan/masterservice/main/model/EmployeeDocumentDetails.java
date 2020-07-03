package com.webo.app.twowheelerloan.masterservice.main.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class EmployeeDocumentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeDocumentId;
    @Column(name = "AdharCard")
    @Lob
	private byte[] employeeAdharcard;
    @Column(name = "PanCard")
    @Lob
    private byte[] employeePanCard;
    @Column(name = "Photo")
    @Lob
    private byte[] employeePhoto;
  //  private String ctreated;
//	private String updated;

	public EmployeeDocumentDetails() {
	}

	public EmployeeDocumentDetails(MultipartFile[] file) {
	}
	public EmployeeDocumentDetails(Integer employeeDocumentId, byte[] employeeAdharcard, byte[] employeePanCard,
			byte[] employeePhoto) {
		super();
		this.employeeDocumentId = employeeDocumentId;
		this.employeeAdharcard = employeeAdharcard;
		this.employeePanCard = employeePanCard;
		this.employeePhoto = employeePhoto;
		//this.ctreated = ctreated;
		//this.updated = updated;
	}

	public Integer getEmployeeDocumentId() {
		return employeeDocumentId;
	}

	public void setEmployeeDocumentId(Integer employeeDocumentId) {
		this.employeeDocumentId = employeeDocumentId;
	}

	public byte[] getEmployeeAdharcard() {
		return employeeAdharcard;
	}

	public void setEmployeeAdharcard(byte[] employeeAdharcard) {
		this.employeeAdharcard = employeeAdharcard;
	}

	public byte[] getEmployeePanCard() {
		return employeePanCard;
	}

	public void setEmployeePanCard(byte[] employeePanCard) {
		this.employeePanCard = employeePanCard;
	}

	public byte[] getEmployeePhoto() {
		return employeePhoto;
	}

	public void setEmployeePhoto(byte[] employeePhoto) {
		this.employeePhoto = employeePhoto;
	}

	@Override
	public String toString() {
		return "EmployeeDocumentDetails [employeeDocumentId=" + employeeDocumentId + ", employeeAdharcard="
				+ Arrays.toString(employeeAdharcard) + ", employeePanCard=" + Arrays.toString(employeePanCard)
				+ ", employeePhoto=" + Arrays.toString(employeePhoto) + "]";
	}

//	public String getCtreated() {
//		return ctreated;
//	}
//
//	public void setCtreated(String ctreated) {
//		this.ctreated = ctreated;
//	}
//
//	public String getUpdated() {
//		return updated;
//	}
//
//	public void setUpdated(String updated) {
//		this.updated = updated;
//	}


}
