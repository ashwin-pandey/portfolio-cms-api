package com.portfolio.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int Id;
	
	@Column(name = "user_Name")
	private String userName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone_Number")
	private int phone_Number;
	
	@Column(name = "first_Name")
	private String firstName;
	
	
	@Column(name = "last_Name")
	private String lastName;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "description_id")
	private int descriptionId;
	
	@Column(name = "user_role_id")
	private int userRoleId;
	
	@Column(name = "project_id")
	private int projectId;
	
	@Column(name = "is_deleted")
	private boolean isDeleted;
	
	@Column(name = "created_date")
	private int creadtedDate;
	
	@Column(name = "updted_date")
	private int updatedDate;
	
	@Column(name = "token")
	private int token;
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(int phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getCreadtedDate() {
		return creadtedDate;
	}

	public void setCreadtedDate(int creadtedDate) {
		this.creadtedDate = creadtedDate;
	}

	public int getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(int updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}


	

}
