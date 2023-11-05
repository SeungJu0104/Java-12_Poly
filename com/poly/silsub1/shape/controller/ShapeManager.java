package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Circle;
import com.poly.silsub1.shape.model.vo.Rectangle;
import com.poly.silsub1.shape.model.vo.Triangle;
import com.poly.silsub1.shape.model.vo.Shape;
import com.poly.silsub1.shape.model.vo.Ishape;

public class ShapeManager{
	
	public void calcShape() {
		
		Shape s;
		
		s = new Circle(15.5);
		
		System.out.println("원 면적 : " + s.area());
		System.out.println("원 둘레 : " + s.perimeter());
		
		s = new Rectangle(34.5, 42.7);
		
		System.out.println("사각형 면적 : " + s.area());
		System.out.println("사각형 둘레 : " + s.perimeter());
		
	}
	
	public void calcShapeArray() {
		
		//Ishape 인터페이스와 상속관계의 클래스들
		Ishape [] iarr = new Ishape [5];
		//다형성
		iarr[0] = new Circle(10.0);
		iarr[1] = new Circle(15.5);
		iarr[2] = new Rectangle(34.5, 42.7);
		iarr[3] = new Rectangle(30.0, 15.0);
		iarr[4] = new Triangle(10.0, 10.0);
		
		int i = 0;
		
		for(;;) {
			
			if(i == iarr.length) break;
			
			//instanceof 연산자
			//현재 참조형 변수가 어떤 클래스형의 객체 주소를 참고하는지 확인
			if(iarr[i] instanceof Triangle) {
				//true일 때 처리할 내용
				System.out.println(iarr[i].area());
				System.out.println(iarr[i].perimeter());
				System.out.println(((Triangle)iarr[i]).getHypotenuse());//다운캐스팅
				
				}
			else if(iarr[i] instanceof Rectangle) {
				
				System.out.println(iarr[i].area());
				System.out.println(iarr[i].perimeter());
				
			}
			else if(iarr[i] instanceof Circle) {
				
				System.out.println(iarr[i].area());
				System.out.println(iarr[i].perimeter());
				
			}
			
			i++;
			
		}
		
	}

}
