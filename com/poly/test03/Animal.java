package com.poly.test03;

public abstract class Animal {//추상클래스
	//추상 메소드, 일반 메소드 모두 넣을 수 있다.
	//메소드가 아무것도 없어도 추상 클래스 선언 가능하다.
	//명시적으로 메소드에 추상 선언해야한다.
	
	public abstract void bark();//추상 메소드
	
	public void eat(String animal) {//일반 메소드
		
		System.out.println(animal + " 먹는다.");
		
	}

}
