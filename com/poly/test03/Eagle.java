package com.poly.test03;

public class Eagle extends Animal implements Bird{//클래스와 인터페이스 동시에 상속 받는 것이 가능하다.
	
	//인터페이스 Bird의 추상메소드(fly)를 구현.
	@Override
	public void fly() {
		
		System.out.println("파닥파닥");
		
	}
	
	//추상클래스 Animal의 추상메소드(bark)를 구현.
	@Override
	public void bark() {
		
		System.out.println("삐룩삐룩");
		
	}

}
