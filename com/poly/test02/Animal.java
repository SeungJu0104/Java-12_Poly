package com.poly.test02;

public interface Animal {//인터페이스는 반드시 추상 메소드만 사용할 수 있다. 일반 메소드 사용 불가하다.
	//인터페이스 상속은 implements 키워드를 사용한다.
	//클래스 상속인 extends는 단일 상속만 지원, 인터페이스는 다중 상속을 지원한다.
	//모든 인터페이스 메소드는 추상 메소드. abstract 안써도 묵시적 적용.
	//변수는 묵시적으로 public static final
	
	public void bark();//따로 abstract 명시 안해도 추상 메소드
	
	void eat(String animal);//따로 abstract 명시 안해도 추상 메소드

}
