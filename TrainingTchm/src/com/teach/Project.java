package com.teach;

import java.util.ArrayList;

public class Project {

	private int pid;
	private String pname;
	ArrayList<Employee> al = new ArrayList<>();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public ArrayList<Employee> getAl() {
		return al;
	}

	public void setAl(ArrayList<Employee> al) {
		this.al = al;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", al=" + al + "]";
	}

}
