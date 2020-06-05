package com.user.hierarchy.dto;

public class UserAccessDto {

	private String empid;
	private String accesskey;
	private String country;
	private String subuser;
	private String subuseraccesskey;
	private String subusercountry;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getAccesskey() {
		return accesskey;
	}

	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSubuser() {
		return subuser;
	}

	public void setSubuser(String subuser) {
		this.subuser = subuser;
	}

	public String getSubuseraccesskey() {
		return subuseraccesskey;
	}

	public void setSubuseraccesskey(String subuseraccesskey) {
		this.subuseraccesskey = subuseraccesskey;
	}

	public String getSubusercountry() {
		return subusercountry;
	}

	public void setSubusercountry(String subusercountry) {
		this.subusercountry = subusercountry;
	}

	@Override
	public String toString() {
		return "useraccess [empid=" + empid + ", accesskey=" + accesskey + ", country=" + country + ", subuser="
				+ subuser + ", subuseraccesskey=" + subuseraccesskey + ", subusercountry=" + subusercountry + "]";
	}

}
