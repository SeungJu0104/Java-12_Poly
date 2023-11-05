package com.poly.silsub1.shape.model.vo;

public class Triangle implements Ishape{
	
	//필드 선언
	private double base;
	private double height;
	
	//생성자
	public Triangle () {}
	public Triangle (double base, double height){
		this.base = base;
		this.height = height;
	}
	
	//삼각형의 넓이 메소드
	@Override
	public double area() {
		return ((base * height) / 2);
	}
	
	//빗변 길이 메소드
	public double getHypotenuse() {
		return Math.sqrt((base * base) + (height * height));
	}
	
	//둘레 길이 메소드
	@Override
	public double perimeter() {
		return base + height + getHypotenuse();
	}
	
}
