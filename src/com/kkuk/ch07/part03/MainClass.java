package com.kkuk.ch07.part03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shape shape = new Shape() { // 추상클래스는 메모리에 객체를 생성할 수 없다.(인스턴스 생성 x)
			
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.gatArea());
		
		
		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println(circle.gatArea());
		
		Shape shape = new Triangle(10,20); // 업캐스팅
		System.out.println(shape.gatArea());
		
		Triangle tri; 
		tri = (Triangle) shape; // 다운캐스팅
		System.out.println(tri.gatArea());
		
		
		
		
		
		
		
		
		
	}

}
