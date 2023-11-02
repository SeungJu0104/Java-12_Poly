package com.poly.test04;

import java.util.Scanner;

public class Square extends AreaImpl {
	
	@Override
	public void make() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		int x = sc.nextInt();
		
		System.out.print("세로 : ");
		int y = sc.nextInt();
		
		int res = x*y;
		
		//숫자 + 문자열은 문자열로 인식한다.
		//만약 문자열 앞에 숫자 연산이 있다면 연산 후 값을 문자열로 인식한다.
		//만약 문자열 사이에 숫자 연산이 있다면 연산하지 않고 숫자들 그대로 문자열로 인식한다.
		//문자열 뒤에 숫자 연산이 붙은 경우도 동일하게 숫자들 그대로 문자열로 인식한다.
		super.setResult(res + "");
		//super.setResult(String.valueOf(res));
		
	}
	

}
