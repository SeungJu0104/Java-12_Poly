package com.poly.test05;

public class Profile {
	
	//필드 선언
	private String name;
	private String phone;
	
	//생성자
	Profile () {}
	Profile(String name, String phone){
		
		this.name = name;
		this.phone = phone;
		
	}
	
	//getter 메소드
	//값을 가져오는 메소드
	//반환형은 필드의 자료형과 동일하게
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		
		return phone;
		
	}
	
	//setter 메소드
	//값을 저장하는 메소드
	//매개변수의 자료형은 필드의 자료형과 동일하게
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setPhone(String phone) {
		
		this.phone = phone;
		
	}
	
	public void printProfile() {
		
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		
	}

}
