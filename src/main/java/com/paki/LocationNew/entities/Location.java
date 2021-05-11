package com.paki.LocationNew.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
	
	public Location(){
		
	}
	
	public Location(int id, String code, String name, String type){
		this.id=id;
		this.code=code;
		this.name=name;
		this.type=type;	
	}
	
	@Override
	public String toString() {
		return "Location [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
	}
	
	@Id
	private int id;
	private String code;
	private String name;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
