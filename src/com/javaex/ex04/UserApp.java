package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User user01 = new Customer("jws","j1234","정우성",1000);
		User user02 = new Customer("yjs","y2345","이효리",2000);
		User admin01 = new Employee("master","m7788","운영자",500);
		
		User userArr[] = new User[3];
		
		userArr[0] = user01;
		userArr[1] = user02;
		userArr[2] = admin01;
		
		for (int i = 0; i < userArr.length; i++) {
			userArr[i].showInfo();
		}
		

	}

}
