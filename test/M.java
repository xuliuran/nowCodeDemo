package com.nowcode.demo.test;

/**
 * 类初始化顺序
 * 1.父类静态块
 * 2.子类静态块
 * 3.父类方法块
 * 4.父类构造方法
 * 5.子类方法块
 * 6.子类构造函数
 * @author admin
 *
 */
public class M {
	public static void main(String[] args) throws Exception {
		A a = new B();
		a = new B();
		Class.forName("com.nowcode.demo.test.B");
	}

}
