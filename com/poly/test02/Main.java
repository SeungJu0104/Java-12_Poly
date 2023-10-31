package com.poly.test02;

public class Main {

	public static void main(String[] args) {
		
		Animal ani = new Cat();
		
		ani.bark();
		ani.eat("생선");
		
		//얕은 복사
		ani = new Dog();//Animal의 레퍼런스 변수 ani에 Dog객체의 주소값이 Animal형으로 업캐스팅되어 담긴다.
		
		ani.bark();
		ani.eat("사료");

	}

}
