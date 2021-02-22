package com.portfolio.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills")

public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo_link() {
		return logo_link;
	}

	public void setLogo_link(String logo_link) {
		this.logo_link = logo_link;
	}

	public int getSkill_type_id() {
		return skill_type_id;
	}

	public void setSkill_type_id(int skill_type_id) {
		this.skill_type_id = skill_type_id;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "name")
	private String name;
	
	@Column(name = "logo_link")
	private String logo_link;
	
	@Column(name = "skill_type_id")
	private int skill_type_id;
	
	@Column(name = "isDeleted")
	private boolean isDeleted;
}
