package com.seyon.registration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@SequenceGenerator(name="user_sequence",	sequenceName ="user_sequence" , allocationSize = 1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "user_sequence")	
	private Long id;
	private String name;
	private String gender;
	private Integer age;
	private String mobile;
	private String mail;	
	private String role;		


	public User() {
		
	}


	public User(Long id, String name, String gender, Integer age, String mobile, String mail, String role) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobile = mobile;
		this.mail = mail;		
		this.role = role;
	}
	
	
	public User(String name, String gender, Integer age, String mobile, String mail, Long caseId, String caseSummary,
			String description) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobile = mobile;
		this.mail = mail;		
		this.role = role;
	}


	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = geder;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getCaseId() {
		return caseId;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + name + ", sex=" + sex + ", age=" + age + ", mobile=" + mobile
				+ ", mail=" + mail + ", role="
				+ role + "]";
	} 
	
	

}
