package com.poly.test03;

public class Dog extends Animal{
	
	//추상메소드로 선언해 상속 받았으므로, 구현부를 작성해야한다.
	@Override
	public  void bark() {
		
		System.out.println("멍멍");
		
	}
	
	public void bite() {
		
		System.out.println("깨물다.");
		
	}

}
