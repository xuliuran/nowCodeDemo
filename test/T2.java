package com.nowcode.demo.test;

import java.util.List;

public class T2 implements Runnable{
	private List list;
	public T2(List list){
		this.list = list;
	}

	@Override
	public void run() {
		try {
			//count.await();
			list.add("T2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
