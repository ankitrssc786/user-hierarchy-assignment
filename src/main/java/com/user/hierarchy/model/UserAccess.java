package com.user.hierarchy.model;

import javax.persistence.*;

@Entity
@Table(name = "useraccess")
public class UserAccess {

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "users", joinColumns = @JoinColumn(name = "empid"), inverseJoinColumns = @JoinColumn(name = "empid"))
	private String empid;
	@Column(name = "accesskey")
	private String accesskey;
	@Column(name = "country")
	private String country;
	@Column(name = "subuser")
	private String subuser;
	@Column(name = "subuseraccesskey")
	private String subuseraccesskey;
	@Column(name = "subusercountry")
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

}
