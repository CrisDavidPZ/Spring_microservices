package com.crisdavidpz.restfulapi.versioning;

public class PersonV1 {
	private String fullName;
	
	public PersonV1() {
		super();
	}

	public PersonV1(String fullName) {
		super();
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
