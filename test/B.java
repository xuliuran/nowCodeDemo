package com.nowcode.demo.test;

public class B extends A{
	static{
		System.out.println("子类静态块");
	}
	
	{
		System.out.println("子类方法块");
	}
	public B(){
		System.out.println("子类构造函数");
	}
}
