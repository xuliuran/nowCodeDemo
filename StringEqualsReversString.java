package com.nowcode.demo;

/**
 * 判断字符串正序和逆序是否一致
 * @author admin
 *
 */
public class StringEqualsReversString {
	public static void main(String[] args) {
		isStringReverse("aawaa");
	}
	
	public static void isStringReverse(String orgStr){
		
		StringBuffer sb = new StringBuffer(orgStr);
		
		StringBuffer resb = sb.reverse();
		System.out.println("逆序为:" + resb.toString());
		
		if(resb.toString().equals(orgStr)){
			System.out.println("该字符串是骈文");
		}else{
			System.out.println("该字符串不是骈文");
		}
		
		
	}

}
