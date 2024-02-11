package com.etour.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subcategory_id;
	private String subcategory_name;
	private String subcategory_imgage_path;
	private String subcategory_info;
	private int category_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "subcategory_id", referencedColumnName = "subcategory_id")
	private Set<Packages> packages;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "subcategory_id", referencedColumnName = "subcategory_id")
	private Set<Cost_master> cost_master;
	
	
	public Set<Packages> getPackages() {
		return packages;
	}
	public void setPackages(Set<Packages> packages) {
		this.packages = packages;
	}
	
	public int getSubcategory_id() {
		return subcategory_id;
	}
	public void setSubcategory_id(int subcategory_id) {
		this.subcategory_id = subcategory_id;
	}
	public String getSubcategory_name() {
		return subcategory_name;
	}
	public void setSubcategory_name(String subcategory_name) {
		this.subcategory_name = subcategory_name;
	}
	public String getSubcategory_imgage_path() {
		return subcategory_imgage_path;
	}
	public void setSubcategory_imgage_path(String subcategory_imgage_path) {
		this.subcategory_imgage_path = subcategory_imgage_path;
	}
	public String getSubcategory_info() {
		return subcategory_info;
	}
	public void setSubcategory_info(String subcategory_info) {
		this.subcategory_info = subcategory_info;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public SubCategory(int subcategory_id, String subcategory_name, String subcategory_imgage_path, String subcategory_info,
			int category_id) {
		super();
		this.subcategory_id = subcategory_id;
		this.subcategory_name = subcategory_name;
		this.subcategory_imgage_path = subcategory_imgage_path;
		this.subcategory_info = subcategory_info;
		this.category_id = category_id;
	}
	public SubCategory() {
		super();
	}
	@Override
	public String toString() {
		return "SubCategory [subcategory_id=" + subcategory_id + ", subcategory_name=" + subcategory_name
				+ ", subcategory_imgage_path=" + subcategory_imgage_path + ", subcategory_info=" + subcategory_info
				+ ", category_id=" + category_id + "]";
	}
}
