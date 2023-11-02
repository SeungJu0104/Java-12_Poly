package com.poly.test04;

public abstract class AreaImpl implements Area {
	
	private String result;
	
	@Override
	public void print() {
		
		System.out.println(Area.print + result);
		//static 이기 때문에 객체 선언할 필요가 없다.
		
	}
	
	//상속받아 오버라이드 이용해 추상 메소드 선언.
	//추상 메소드가 있으므로 해당 클래스는 반드시 추상 클래스여야 한다.
	@Override
	public abstract void make();
	
	//필드 값에 접근해 저장할 메소드.
	//setter 메소드
	//(접근제한자) void set필드 변수명 ( 매개변수명 ) { 필드 접근해 저장하는 내용의 코드 }
	public void setResult(String result) {
		
		this.result = result;
		//필드의 result = 매개변수 result;
		
	}
	
}
