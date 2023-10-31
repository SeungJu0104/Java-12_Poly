package com.poly.test02;

public class Cat implements Animal {//implements 이용해 Animal 인터페이스를 상속 받는다.
	//인터페이스의 implements는 클래스의 extends와 다르게 다중상속을 지원한다.
	
	//추상메소드로 선언해 상속 받았으므로, 구현부를 작성해야한다.
	//오버라이딩할 때 매개변수 명은 달라도 상관없다.
	//오버라이딩할 때 접근 제한자는 부모클래스의 메소드보다 같거나 더 넓은 범위만 가능하다.
	@Override
	public void bark() {
		
		System.out.println("야옹");
		
	}
	
	//오버라이딩할 때 매개변수 명은 달라도 상관없다.
	//오버라이딩할 때 접근 제한자는 부모클래스의 메소드보다 같거나 더 넓은 범위만 가능하다.
	@Override
	public void eat(String feed) {
		
		System.out.println("고양이가 " + feed + "먹는다.");
		
	}
	
	

}
