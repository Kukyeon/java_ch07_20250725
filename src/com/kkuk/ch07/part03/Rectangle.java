package com.kkuk.ch07.part03;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double gatArea() {
		
		return width * height;
	}


	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("사각형 색갈 : " + color);
	}	
	
}
