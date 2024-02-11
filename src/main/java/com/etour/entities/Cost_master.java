package com.etour.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cost_master {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cost_id;
	
	private double child_with_bed;
	private double cost;
	private double extra_person_cost;
	private int packageid;
	private double single_person_cost;
	private int sub_sector_id;
	private String valid_from;
	private String valid_to;
	
	public int getCost_id() {
		return cost_id;
	}
	public void setCost_id(int cost_id) {
		this.cost_id = cost_id;
	}
	public double getChild_with_bed() {
		return child_with_bed;
	}
	public void setChild_with_bed(double child_with_bed) {
		this.child_with_bed = child_with_bed;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getExtra_person_cost() {
		return extra_person_cost;
	}
	public void setExtra_person_cost(double extra_person_cost) {
		this.extra_person_cost = extra_person_cost;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	public double getSingle_person_cost() {
		return single_person_cost;
	}
	public void setSingle_person_cost(double single_person_cost) {
		this.single_person_cost = single_person_cost;
	}
	public int getSub_sector_id() {
		return sub_sector_id;
	}
	public void setSub_sector_id(int sub_sector_id) {
		this.sub_sector_id = sub_sector_id;
	}
	public String getValid_from() {
		return valid_from;
	}
	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}
	public String getValid_to() {
		return valid_to;
	}
	public void setValid_to(String valid_to) {
		this.valid_to = valid_to;
	}
	public Cost_master() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cost_master(int cost_id, double child_with_bed, double cost, double extra_person_cost, int packageid,
			double single_person_cost, int sub_sector_id, String valid_from, String valid_to) {
		super();
		this.cost_id = cost_id;
		this.child_with_bed = child_with_bed;
		this.cost = cost;
		this.extra_person_cost = extra_person_cost;
		this.packageid = packageid;
		this.single_person_cost = single_person_cost;
		this.sub_sector_id = sub_sector_id;
		this.valid_from = valid_from;
		this.valid_to = valid_to;
	}
	@Override
	public String toString() {
		return "Cost_master [cost_id=" + cost_id + ", child_with_bed=" + child_with_bed + ", cost=" + cost
				+ ", extra_person_cost=" + extra_person_cost + ", packageid=" + packageid + ", single_person_cost="
				+ single_person_cost + ", sub_sector_id=" + sub_sector_id + ", valid_from=" + valid_from + ", valid_to="
				+ valid_to + "]";
	}
}
