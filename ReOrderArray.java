package com.nowcode.demo;

import java.util.ArrayDeque;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author admin
 *
 */
public class ReOrderArray {
	
	public static void reOrderArray(int [] array) {
		
		
        //利用JDK自带的双端队列
        //保存技术的队列
        ArrayDeque<Integer> oad = new ArrayDeque<Integer>();
        
        //保存偶数的队列
        ArrayDeque<Integer> ead = new ArrayDeque<Integer>();
        for(int num : array){
        	if(num%2==0){
        		ead.offer(num);
        	}else{
        		oad.offer(num);
        	}
        }
        
        if(oad.isEmpty()){
        	//数组中都是偶数
        	return;
        }
        
        if(ead.isEmpty()){
        	//数组中都是奇数
        	return;
        }
        
        int count = 0;
        for(Integer num : oad){
        	array[count] = num.intValue();
        	count++;
        }
        
        for(Integer n : ead){
        	array[count] = n.intValue();
        	count++;
        }
        
        for(int i : array){
        	System.out.println(i);
        	
        }
		
    }
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		reOrderArray(array);
		
	}

}
