package com.poly.test01;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		
		Cat cat  = new Cat();
		
		cat.bark();
		cat.eat("생선");
		
		Animal dog = new Dog();//업캐스팅.
		
		dog.bark();
		//동적바인딩
		//마우스 올리면, Animal 클래스의 bark 메소드가 나온다.
		//이건, Dog 객체가 업캐스팅되어서 Animal의 레퍼런스 변수 dog에 주소값이 담긴 것이다.
		//하지만 컴파일하며 동적바인딩에 의해 Dog라는 객체를 확인하고, 해당 오버라이드된 메소드를 실행한다.
		
		dog.eat("뼈다귀");//동적바인딩
		
		//동적 바인딩 - 실행 시 메모리 할당을 하면서 메소드를 동적으로 연동하는 방식
		
		System.out.print("선택 [1: 고양이 2: 강아지] : ");
		int select = new Scanner(System.in).nextInt();
		
		Animal ani = null;//Animal의 레퍼런스 변수 ani를 만들고 값을 null로 초기화.
		//null 없으면 초기화 에러 발생.
		
		switch(select) {
		
		case 1:
			ani = new Cat();//업캐스팅
			//상속관계에 있는 Animal 레퍼런스 변수 ani에 Cat 객체의 주소값이 담기는데 Animal의 객체형으로 자동 형변환해 담는다.
			break;
			
		case 2:
			ani = new Dog();//업캐스팅
			//상속관계에 있는 Animal 레퍼런스 변수 ani에 Dog 객체의 주소값이 담기는데 Animal의 객체형으로 자동 형변환해 담는다.
			break;
			
		}
		
		ani.bark();//동적 바인딩
		//컴파일하며 업캐스팅된걸 확인하고, Cat의 객체로 인식해 오버라이딩 메소드를 수행.
		ani.eat("점심");// 동적 바인딩
		//컴파일하며 업캐스팅된걸 확인하고, Dog의 객체로 인식해 오버라이딩 메소드를 수행.
		
	}

}
