package com.SHC.domain;

import java.util.Date;

public class partyInfo {

	private long partyInfoId;
	private long enduserId;
	private String partyInfoName;
	private String partyInfoLicenseNoA;
	private String partyInfoLicenseNoB;
	private Date licenseExpireOn;
	private String partyAddress;

	//Generate getters and setters
	public long getPartyInfoId() {
		return partyInfoId;
	}

	public void setPartyInfoId(long partyInfoId) {
		this.partyInfoId = partyInfoId;
	}

	public long getEnduserId() {
		return enduserId;
	}

	public void setEnduserId(long enduserId) {
		this.enduserId = enduserId;
	}

	public String getPartyInfoName() {
		return partyInfoName;
	}

	public void setPartyInfoName(String partyInfoName) {
		this.partyInfoName = partyInfoName;
	}

	public String getPartyInfoLicenseNoA() {
		return partyInfoLicenseNoA;
	}

	public void setPartyInfoLicenseNoA(String partyInfoLicenseNoA) {
		this.partyInfoLicenseNoA = partyInfoLicenseNoA;
	}

	public String getPartyInfoLicenseNoB() {
		return partyInfoLicenseNoB;
	}

	public void setPartyInfoLicenseNoB(String partyInfoLicenseNoB) {
		this.partyInfoLicenseNoB = partyInfoLicenseNoB;
	}

	public Date getLicenseExpireOn() {
		return licenseExpireOn;
	}

	public void setLicenseExpireOn(Date licenseExpireOn) {
		this.licenseExpireOn = licenseExpireOn;
	}

	public String getPartyAddress() {
		return partyAddress;
	}

	public void setPartyAddress(String partyAddress) {
		this.partyAddress = partyAddress;
	}

}
