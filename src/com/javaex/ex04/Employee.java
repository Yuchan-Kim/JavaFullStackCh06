package com.javaex.ex04;

public class Employee extends User{

	private int salary;


	public Employee(String id, String password, String name, int Salary) {
		super(id, password, name);
		this.salary = Salary; 
	}


	public int getSalary() {
		
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println("#아이디: " + super.getId() 
		+ ", #패스워드: "+ super.getPassword() 
		+ ", #이름: " + super.getName() 
		+ ", #월급: " + salary);
		
		System.out.println(super.getName() +"의 월급은 "+salary +"0000원 입니다." );
	}

	
}
