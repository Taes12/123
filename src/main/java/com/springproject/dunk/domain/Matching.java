package com.springproject.dunk.domain;

import java.sql.Timestamp;

public class Matching {
	// no, place_no, name, date, gender, level,	pay, possible _impossible,information,read_count																
	private int no;
	private int placeNo;	
	private String name;
	private Timestamp date;
	private String gender;
	private String level;
	private int pay;
	private int possibleImpossible;
	private String information;
	private int readCount;
	private String userId;
	
	public Matching() { }
	public Matching(int no, int placeNo, String name, Timestamp date, 
			String gender, String level, int pay, int possibleImpossible, String information, int readCount, String userId) 
	{
		this.no = no;
		this.placeNo = placeNo;
		this.name = name;
		this.date = date;		
		this.gender = gender;
		this.level = level;
		this.pay = pay;
		this.possibleImpossible = possibleImpossible;
		this.information = information;
		this.readCount = readCount;
		this.userId = userId;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPlaceNo() {
		return placeNo;
	}
	public void setPlaceNo(int placeNo) {
		this.placeNo = placeNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPossibleImpossible() {
		return possibleImpossible;
	}
	public void setPossibleImpossible(int possibleImpossible) {
		this.possibleImpossible = possibleImpossible;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
