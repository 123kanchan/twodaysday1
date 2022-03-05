package com.training.apps;

public class StringDemo {
	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = str ;
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		if(str==str2) {
			
			System.out.println("same str object");
		}
		else
			System.out.println("different object");
		
		
		String str3 = new String("hello");
		if(str==str3)
			System.out.println("equal");
		else
			System.out.println("unequal");
		
		
		if(str.equals(str3)){System.out.println("equal data");}
		else
			System.out.println("diff data");
		str=str + "world";
		System.out.println(str);
		System.out.println(str.hashCode());

	}

}
