package com.kkuk.ch07.part03;

public class Circle extends Shape{

	private double radius;
	
	
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double gatArea() {
		// TODO Auto-generated method stub
		return (radius * radius ) * 3.141592 ;
	
	
}
	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("동그라미 색갈 : " + color);
	}
}