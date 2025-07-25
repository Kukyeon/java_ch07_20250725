package com.kkuk.ch07.part03;

public class Triangle extends Shape{

	private double width;
	private double height;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double gatArea() {
		// TODO Auto-generated method stub
		return width * height * 0.5;
	}

	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("삼각형 색갈 : " + color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
