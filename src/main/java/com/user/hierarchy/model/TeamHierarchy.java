package com.user.hierarchy.model;

import javax.persistence.*;

@Entity
@Table(name = "teamhierarchy")
public class TeamHierarchy {

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "users", joinColumns = @JoinColumn(name = "empid"), inverseJoinColumns = @JoinColumn(name = "empid"))
	private String empid;
	@Column(name = "managerid")
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

}
