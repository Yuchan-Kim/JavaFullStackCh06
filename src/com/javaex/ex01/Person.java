package com.javaex.ex01;

public class Person {
	
	//Field variables
	private String name;
	private String hp;
	
	//Constructor
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}
	

	//Getter & Setter Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//Methods
	public void showInfo() {
		System.out.println("#이름:" + name+ ", #핸드폰:" +hp);
	}
	
	
	
	
	
}
