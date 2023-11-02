package com.poly.test04;

import java.util.Scanner;

public class Circle extends AreaImpl{
	
	@Override
	public void make() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		
		//실수를 소수 둘째 자리까지 format함수로 형태 맞춰서 String으로 변환.
		super.setResult(String.format("%.2f",res));
		//super. 생략해도 작동 가능.
		
	}
	
	
	@Override
	public void print() {
		
		//AreaImpl의 print 메소드를 오버라이딩으로 수정.
		System.out.print("원의 ");
		super.print();
		//super. 생략해도 작동 가능.
		
	}

}
