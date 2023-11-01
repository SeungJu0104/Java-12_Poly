package com.poly.test03;

public class Main {

	public static void main(String[] args) {
		
		Animal ani = new Cat();//업캐스팅
		
		ani.bark();//동적 바인딩. 오버라이딩 만족
		ani.eat("참치");//동적 바인딩. 오버라이딩 만족
		
		//얕은복사
		ani = new Dog();
		
		ani.bark();//동적 바인딩. 오버라이딩 만족
		ani.eat("개껌");//동적 바인딩. 오버라이딩 만족
		
		((Dog)ani).bite();//다운캐스팅 적용. 
		//상속관계이지만 오버라이딩하지 않는 메소드는 해당 자식 클래스로 강제 형변환 해야한다.
		
		ani = new Eagle();
		((Eagle)ani).fly();//다운캐스팅 적용.
		//상속관계이지만 오버라이딩하지 않는 메소드는 해당 자식 클래스로 강제 형변환 해야한다.
		
		//부모에는 있지만 자식 클래스에 없는 메소드는 어떻게 동적 바인딩이 작동하는가? (추상말고 일반 메소드)
		//(추상은 반드시 써야하니까)
		
		ani.bark();
		ani.eat("토끼");
		
		Bird b = new Eagle();//인터페이스 업캐스팅.
		b.fly();//인터페이스 동적바인딩. 오버라이딩 만족.
		((Eagle)b).bark();//인터페이스 다운캐스팅.

	}

}
