package com.kkuk.ch07.part03.ex;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankAccount = new BankAccount();
		bankAccount.setBalance(123123123);
		System.out.println(bankAccount.getBalance());
		
		Piano piano = new Piano();
		piano.play();
		
		Guitar guitar = new Guitar();
		guitar.play();
		
		
		Developer developer = new Developer();
		developer.work();
		
		Designer designer = new Designer();
		designer.work();
		
		Bus bus = new Bus();
		bus.move();
		
		Truck truck = new Truck();
		truck.move();
		
		Vehicle vehicle = new Truck();
		vehicle.stop();
		
		Laptop laptop = new Laptop();
		laptop.turnOn();
		laptop.turnOff();
		
		Desktop desktop = new Desktop();
		desktop.turnOn();
		desktop.turnOff();
		
		Student student = new Student("name");
		student.sayHello();
		
		Person person = new Student("name");
		person.printHi();
		
			
	}

}
