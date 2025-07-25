package com.kkuk.ch07.part03.ex;

public abstract class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    abstract void sayHello();
    
   public static void printHi() {
	   System.out.println("안녕하세요. 반갑습니다!");
   }
    
}

