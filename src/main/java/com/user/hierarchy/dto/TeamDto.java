package com.user.hierarchy.dto;

public class TeamDto {

	private String empid;
	private String managerid;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getManagerid() {
		return managerid;
	}

	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}

	@Override
	public String toString() {
		return "TeamDto [empid=" + empid + ", managerid=" + managerid + "]";
	}

}
