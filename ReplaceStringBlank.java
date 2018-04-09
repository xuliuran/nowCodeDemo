package com.nowcode.demo;

public class ReplaceStringBlank {
	public static void main(String[] args) {
		String str = "We Are Happy";
		replaceSpace(new StringBuffer(str));
	}
	
	public static String replaceSpace(StringBuffer str) {
    	
		if(str == null){
			System.out.println("字符串为空");
			return new String();
		}
		
		String s = str.toString();
		
		
		String result = s.replaceAll("\\s", "%20");
		System.out.println(result);
		return result;
    }

}
