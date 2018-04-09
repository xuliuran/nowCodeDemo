package com.nowcode.demo.test;

import java.util.List;

public class T1 implements Runnable{
	private List list;
	public T1(List list){
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			//count.await();
			list.add("T1");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
