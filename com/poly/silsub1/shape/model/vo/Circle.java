package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape implements Ishape {
	
	//필드 선언
	private static final double PI = Math.PI;
	private double radius;
	
	//생성자
	public Circle () {}
	public Circle (double radius){
		this.radius = radius;
	}
	
	//getter 메소드
	public double getPI() {
		return PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	//setter 메소드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//원 면적
	@Override
	public double area() {
		return radius*radius*PI;
	}
	
	//원 둘레
	@Override
	public double perimeter() {
		return 2*radius*PI;
	}

}
