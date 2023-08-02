package com.raushan.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="CONTACT_DETAILS")
public class Contact {
	
	
	@Id
	@GeneratedValue
	@Column(name= "CONTACT_ID")
	private Integer contactId;
	
	@Column(name= "CONTACT_NAME")
	private String contactName;
	
	@Column(name= "CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name= "CONTACT_NUMBER")
	private Long contactNumber;
	
	@Column(name= "CREATE_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;
	
	@Column(name= "UPDATE_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
	
	@Column(name= "ACTIVE-SW")
	private String activeSw;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	
	
	
	
	

}
