package com.cpms.cpms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Contractor {

	@Id
	private int contractorID;
	
	@ManyToOne
	@JoinColumn(name = "userID", nullable = false)
	private User user;
	
	@Column(nullable=false, length = 100)
	private String contactInfo;
	
    @Column(nullable = false, length = 100)
    private String contractorName;

	
    // Getters and Setters
    public int getContractorID() {
        return contractorID;
    }

    public void setContractorID(int contractorID) {
        this.contractorID = contractorID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

