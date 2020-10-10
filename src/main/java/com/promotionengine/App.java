
package com.promotionengine;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	public static final int SKUA = 50;
	public static final int SKUB = 30;
	public static final int SKUC = 20;
	public static final int SKUD = 15;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value A");
		int valueOfA = sc.nextInt();

		System.out.println("Enter Value B");
		int valueOfB = sc.nextInt();
		System.out.println("Enter Value C");
		int valueOfC = sc.nextInt();
		System.out.println("Enter Value D");
		int valueOfD = sc.nextInt();

		int total = 0;

		if (valueOfA >= 3) {
			int quotient = valueOfA / 3;
			int remainder = valueOfA % 3;

			total = (quotient >= 0) ? total + quotient * 130 : total;

			total = (remainder >= 0) ? total + remainder * 50 : total;
		} else {

			total = total + valueOfA * 50;
		}

		//System.out.println(" Total after A : " + total);

		if (valueOfB >= 2) {
			int quotient = valueOfB / 2;
			int remainder = valueOfB % 2;

			total = (quotient >= 0) ? total + quotient * 45 : total;

			total = (remainder >= 0) ? total + remainder * 30 : total;
		} else {

			total = total + valueOfB * 30;
		}
		
		if(valueOfC >=1 && valueOfD >=1 ) {
			total = (valueOfC == valueOfD ) ? total + valueOfC*30 : total;
			System.out.println(" C==D " + total);
			total = (valueOfC > valueOfD ) ?  total + (valueOfD*30  + (valueOfC - valueOfD )*20) : total ;
			System.out.println(" C>D " + total);
			total = (valueOfD > valueOfC ) ?  total + (valueOfC*30  + (valueOfD - valueOfC )*15) : total;
			System.out.println(" D>C " + total);
			
			
		}else {
			total =total + valueOfC * 20;
			total =total + valueOfD * 15;
		}
		System.out.println(" Total value is : " + total);
	}
	
	
}
