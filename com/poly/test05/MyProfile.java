package com.poly.test05;

//extends는 implements 앞에 사용해야한다.
//뒤에 쓰면 에러 발생.
public class MyProfile extends Profile implements Job, Display {
	
	private String loc;
	
	//생성자
	//무조건 부모클래스의 생성자가 먼저 만들어지고, 자식 클래스의 생성자가 실행된다.
	MyProfile () {}
	MyProfile (String name, String phone) {
		//부모클래스 생성자 호출
		super(name, phone);
		
	}
	
	@Override
	public void jobLoc(String loc) {
		
		this.loc = loc;
		
	}
	
	@Override
	public void display() {
		
		super.printProfile();
		System.out.println("회사 주소 : " + loc);
		//Job 인터페이스의 jobId는 public 선언했기 때문에 필드에 직접 접근 가능하다.
		//static final 필드
		System.out.println("회사 직종 : " + Job.jobId);
		
	}
	
	
	
	

}
