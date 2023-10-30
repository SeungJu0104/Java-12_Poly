package com.poly.test01;

public class Dog extends Animal {
	
	//추상 클래스를 상속받았으므로, 추상 클래스에 있는 추상메소드의 구현부를 구현해야한다.
	//메소드를 오버라이드한다.
	//안하면 에러 발생.
	@Override
	public void bark() {
		
		System.out.println("멍멍");
		
	}
	
	@Override
	public void eat(String animal) {
		
		System.out.print("강아지가 ");
		super.eat(animal);
		
	}

}
