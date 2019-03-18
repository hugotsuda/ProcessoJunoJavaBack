package br.com.bb.entity;

import javax.persistence.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn; 
import javax.persistence.ManyToOne; 

@Entity
@Table(name = "product")
public class ProductEntity {
	
	@Id
	@Basic
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private int productId;
	
	@Basic
	@Column(name = "name")
	private String name;
	
	@JoinColumn(name = "categoryId", referencedColumnName = "categoryid")
	@ManyToOne(optional = false)
	private CategoryEntity category;

	public CategoryEntity getCategoria() {
		return category;
	}

	public void setCategoria(CategoryEntity category) {
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int id) {
		this.productId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
