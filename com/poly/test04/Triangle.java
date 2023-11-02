package com.poly.test04;

import java.util.Scanner;

public class Triangle extends AreaImpl{
	
	@Override
	public void make() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 : ");
		int x = sc.nextInt();
		
		System.out.print("높이 : ");
		int y = sc.nextInt();
		
		//정수를 정수로 나누면 정수부분만 출력하고 소수점이하는 버린다.
		//그래서 실수로 강제 형변환해준다.
		double res = ((double)(x*y))/2;
		
		super.setResult(String.format("삼각형의 %.2f", res));
		//super. 없어도 작동한다.
		
	}

}
