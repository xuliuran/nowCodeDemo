package com.nowcode.demo.test;

public class A {
	static{
		System.out.println("父类静态块");
	}
	
	{
		System.out.println("父类方法块");
	}
	
	public A(){
		System.out.println("父类构造方法");
	}

}
