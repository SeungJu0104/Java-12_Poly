package com.poly.silsub1.shape.model.vo;

public class Rectangle extends Shape implements Ishape {
	//필드 선언
	private double width;
	private double height;
	
	//생성자
	public Rectangle () {}
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//getter method
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	//setter method
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return (width * height);
	}
	
	@Override
	public double perimeter() {
		return (2*height*width);
	}

}
