package com.pojo;

public class PojoB extends PojoA{
	public static void main(String[] args) {
	
		PojoA refNmae = new PojoA();  //object creation 
		
		String value = refNmae.getA();
		System.out.println(value);
		
		refNmae.setA("imu");
		String newvalue = refNmae.getA();
				System.out.println(newvalue);
		
		int value1 = refNmae.getB();
		System.out.println(value1);
		
		refNmae.setB(20);
		int intvalue = refNmae.getB();
		System.out.println(intvalue);
		
		boolean value2 = refNmae.getC();
		System.out.println(value2);		

		refNmae.setC(false);
		boolean boolvalue = refNmae.getC();
		System.out.println(boolvalue);
		
	    
	}
	
	
	

}
