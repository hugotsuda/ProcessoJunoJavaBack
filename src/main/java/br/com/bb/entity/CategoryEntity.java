package br.com.bb.entity;

import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "category")
public class CategoryEntity {

	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryid")
	private Integer categoryid;
	
	@Basic
	@Column(name = "name")
	private String name;

	public Integer getCategoryId() {
		return categoryid;
	}

	public void setCategoryId(Integer id) {
		this.categoryid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
