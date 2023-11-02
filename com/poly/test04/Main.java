package com.poly.test04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도형을 선택해주세요 [1: 원, 2: 삼각형, 3:  사각형] : ");
		int no = sc.nextInt();
		
		Area ar = null;
		
		switch(no) {
		
		case 1:
			ar = new Circle();
			break;
			
		case 2:
			ar = new Triangle();
			break;
			
		case 3:
			ar = new Square();
			break;
			
		}
		
		//동적 바인딩으로인해 컴파일하며 레퍼런스 변수 ar에 들어가있는 각 객체를 찾아 해당 객체의 오버라이딩된 메소드가 실행된다.
		ar.make();//동적 바인딩
		ar.print();//동적 바인딩
		

	}

}
