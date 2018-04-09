package com.nowcode.demo;


public class SearchFromTwoArray {
	
	public static void main(String[] args) {
		/*int[][] array2array = {   
                { 1, 2, 3 },   
                { 6, 8, 13 },   
                { 9, 17, 23 },   
                { 10, 11, 34} };*/
		
		int[][] array2array = {   
                { } };
		
		Find(15, array2array);
	}
	
	
	public static boolean Find(int target, int [][] array) {
        /*int length = array.length-1;
        int width = array[0].length-1;
        
        if(width < 0){
        	System.out.println("该数组为空");
        	return false;
        }
        
        //因为是递增数组,如果要找的数比第一个小或者比最后一个大，那么肯定不在数组中
        if(target > array[length][width] || target < array[0][0]){
        	System.out.println(target + "不在该数组中");
        	return false;
        }
        
        int row = 1;
       for(int[] i : array){
    	  int result= Arrays.binarySearch(i, target);
    	  if(result >= 0){
    		  System.out.println("找到啦，该数在数组的位置：第" + row + "行，第" + result + "列");
    		  return true;
    	  }
    	  row++;
       }
       
       System.out.println("很抱歉，该数组中没有您要找的数");
       return false;*/
		
		int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
	

}
