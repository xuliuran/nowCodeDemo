package com.nowcode.demo.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ArrayListMulti {
	
	
	
	
	public synchronized void testSynchronized(int i){
		System.out.println(i);
	}
	
	public static void main(String[] args) throws Exception {
		/*List<String> list = new ArrayList<>();
		new Thread(new T1(list)).start();
		new Thread(new T2(list)).start();
		Thread.sleep(10);
		for(String str : list){
			System.out.println(str);
		}*/
		List<Integer> list = new ArrayList<>();
	} 

}
