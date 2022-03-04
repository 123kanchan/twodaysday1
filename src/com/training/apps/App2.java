package com.training.apps;

import com.training.utils.Calculator;

public class App2 {
	public static void main(String[] arr) {
		int x=10;
		int y =  0567;
		int x1= 0x8F;
		float z=21.343f;
		double d1= 34343.3434;
		boolean isStrong = true;
		Character data =  'n';
		char data1 = 'm';
		
		
		switch(data1) {
		
		case 'a':System.out.println("its a");
		 break;
		case 'n':System.out.println("its no");
		break;
		case 'm':System.out.println("its may be");
		break;
		default:System.out.println("some other val");
		
		
		}
		while(x<60) {
			
			System.out.println("hello there "+x);
			x+=10;
			if (x > 30) break;
		}
		//fixed iterations
		//array /collection
		//three parts
		//each part is separated by ;
		//first part initialization 
		//second part condition
		//third increment or decrement
		for(int c=10;c<15;c++) {
			
			System.out.println(c);
			
		}
		//separeted by  :
		for( String arrData  :   arr) {
			System.out.println(arrData);
		}
		
	}
}
