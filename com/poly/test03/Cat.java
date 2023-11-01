package com.poly.test03;

public class Cat extends Animal {
	
	//추상메소드로 선언해 상속 받았으므로, 구현부를 작성해야한다.
	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	//매개변수명은 오버라이드에 영향을 주지 않는다.
	//매개변수 자료형, 개수는 오버라이드에 영향을 준다.
	@Override
	public void eat(String feed) {
		System.out.println("고양이는 " + feed + " 먹는다.");
	}

}
