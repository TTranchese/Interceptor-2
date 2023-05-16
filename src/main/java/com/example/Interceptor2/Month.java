package com.example.Interceptor2;

import jakarta.persistence.*;

@Entity
@Table(name = "months")
public class Month {
	@Id
	@GeneratedValue
	private int id;
	private String englishName;
	private String italianName;
	private String germanName;
	
	public Month(int id, String englishName, String italianName, String germanName) {
		this.id = id;
		this.englishName = englishName;
		this.italianName = italianName;
		this.germanName = germanName;
	}
	
	public Month() {
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEnglishName() {
		return englishName;
	}
	
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	
	public String getItalianName() {
		return italianName;
	}
	
	public void setItalianName(String italianName) {
		this.italianName = italianName;
	}
	
	public String getGermanName() {
		return germanName;
	}
	
	public void setGermanName(String germanName) {
		this.germanName = germanName;
	}
}
