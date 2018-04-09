package com.nowcode.demo;

import java.math.BigDecimal;

public class DoubleSquare {
	
	public static void main(String[] args) {
		System.out.println(Power(2, 30));
		//System.out.println(new BigDecimal(1).divide(new BigDecimal(8)));
	}
	
	
	/*public static double Power(double base, int exponent) {
		if(base == 0){
			System.out.println("基数为0");
			return 0;
		}
		
		if(exponent == 0){
			System.out.println("幂为0");
			return 1;
		}
		
		BigDecimal bd = new BigDecimal(1);
		BigDecimal bs = new BigDecimal(Double.toString(base));
		
		// 防止幂为负数
		int count = new BigDecimal(exponent).abs().intValue();
		while(count>0){
			bd = bd.multiply(bs);
			count--;
		}
		
		if(exponent < 0){
			bd = new BigDecimal(1).divide(bd);
		}
		return bd.doubleValue();
	}*/
	
	public static double Power(double base, int exponent) {
        int n=Math.abs(exponent);
        if(n==0)
            return 1;
        if(n==1)
            return base;
        double  result=Power(base,n>>1);
        result*=result;
        if((n&1)==1)
            result*=base;
        if(exponent<0)
            result=1/result;
        return result;            
  }
}
