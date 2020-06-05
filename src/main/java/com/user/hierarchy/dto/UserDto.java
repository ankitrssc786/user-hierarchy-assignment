package com.user.hierarchy.dto;

public class UserDto {

	private long id;
	private String empid;
	private String accesskey;
	private String country;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getAccesskey() {
		return accesskey;
	}

	public void setAccessKey(String accesskey) {
		this.accesskey = accesskey;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public UserDto(long id, String empid, String accesskey, String country) {
		super();
		this.id = id;
		this.empid = empid;
		this.accesskey = accesskey;
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", empid=" + empid + ", accesskey=" + accesskey + ", country=" + country + "]";
	}

}
