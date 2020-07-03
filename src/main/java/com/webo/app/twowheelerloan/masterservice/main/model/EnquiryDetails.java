package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnquiryDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	private String customerName;
	private String customerDoB;
	private String customerEmailId;
	private String customerMobileNo;
	private String customerAdharCardNo;
	private String customerLocalAddress;
	private String customerPermanentAddress;
	private Double customerLoanAmountRequired;
	private String customerProfession;
	private String customerGender;

	public EnquiryDetails() {
	}

	public EnquiryDetails(Integer customerId, String customerName, String customerDoB, String customerEmailId,
			String customerMobileNo, String customerAdharCardNo, String customerLocalAddress,
			String customerPermanentAddress, Double customerLoanAmountRequired, String customerProfession,
			String customerGender) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerDoB = customerDoB;
		this.customerEmailId = customerEmailId;
		this.customerMobileNo = customerMobileNo;
		this.customerAdharCardNo = customerAdharCardNo;
		this.customerLocalAddress = customerLocalAddress;
		this.customerPermanentAddress = customerPermanentAddress;
		this.customerLoanAmountRequired = customerLoanAmountRequired;
		this.customerProfession = customerProfession;
		this.customerGender = customerGender;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerDoB() {
		return customerDoB;
	}

	public void setCustomerDoB(String customerDoB) {
		this.customerDoB = customerDoB;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCustomerAdharCardNo() {
		return customerAdharCardNo;
	}

	public void setCustomerAdharCardNo(String customerAdharCardNo) {
		this.customerAdharCardNo = customerAdharCardNo;
	}

	public String getCustomerLocalAddress() {
		return customerLocalAddress;
	}

	public void setCustomerLocalAddress(String customerLocalAddress) {
		this.customerLocalAddress = customerLocalAddress;
	}

	public String getCustomerPermanentAddress() {
		return customerPermanentAddress;
	}

	public void setCustomerPermanentAddress(String customerPermanentAddress) {
		this.customerPermanentAddress = customerPermanentAddress;
	}

	public Double getCustomerLoanAmountRequired() {
		return customerLoanAmountRequired;
	}

	public void setCustomerLoanAmountRequired(Double customerLoanAmountRequired) {
		this.customerLoanAmountRequired = customerLoanAmountRequired;
	}

	public String getCustomerProfession() {
		return customerProfession;
	}

	public void setCustomerProfession(String customerProfession) {
		this.customerProfession = customerProfession;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	@Override
	public String toString() {
		return "EnquiryDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerDoB="
				+ customerDoB + ", customerEmailId=" + customerEmailId + ", customerMobileNo=" + customerMobileNo
				+ ", customerAdharCardNo=" + customerAdharCardNo + ", customerLocalAddress=" + customerLocalAddress
				+ ", customerPermanentAddress=" + customerPermanentAddress + ", customerLoanAmountRequired="
				+ customerLoanAmountRequired + ", customerProfession=" + customerProfession + ", customerGender="
				+ customerGender + "]";
	}

}
