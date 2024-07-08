package com.javaex.ex01;

public class Customer extends Person{
	
	//Field Variables
	private int cNo;
	private int point;
	
	//Constructor
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	
	//Getter & Setter Methods
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//Methods
	public void showInfo() {
		System.out.println("#이름:" + super.getName()+ ", #핸드폰:" + super.getHp() 
		+ ", #고객번호: " + this.cNo + ", 포인트 점수:" + this.point );
	}
	
	
}
