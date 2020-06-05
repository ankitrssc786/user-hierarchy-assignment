package com.user.hierarchy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Column(name = "empid")
	private String empid;
	@Column(name = "accesskey")
	private String accesskey;
	@Column(name = "country")
	private String country;

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
}
