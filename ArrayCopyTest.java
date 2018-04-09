package com.nowcode.demo;

import java.util.Arrays;
import java.util.List;

public class ArrayCopyTest {
	
	public static void main(String[] args) {
		int[][] array2array = {   
	                { 1, 2, 3, 4, 5 },   
	                { 11, 12, 13, 14, 15 },   
	                { 21, 22, 23, 24, 25 },   
	                { 31, 32, 33, 34, 35} 
                };
		
		int length = array2array.length;
		int width = array2array[0].length;
		
		System.out.println("原数组长度length:" + length + "原数组的宽度width:" + width);
		
		int[][] tempArray = new int[length/2][];
		
		System.arraycopy(array2array, 1, tempArray, 0, length/2);
		for(int[] i : tempArray){
			
		}
	}
}
