package com.promotionengine.execute;

import java.util.Scanner;

import com.promotionengine.calculation.CalculateCost;

public class ExecutePromotionEngine {
	

	public void execute() {
		
		CalculateCost calc = new CalculateCost();

		System.out.println(" ############### Welcome to XYZ Promotion Engine ############## ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n Choose Active Promotion eg: 1 or 2 ... !!! (Note right now only one active promotion is enabled" );
		
		int option = sc.nextInt();
		
		
		switch (option) {
		case 1:
			System.out.println("Enter quantity value of SKUID A");
			int skuIdA = sc.nextInt();

			System.out.println("Enter quantity value of SKUID B");
			
			int skuIdB = sc.nextInt();
			
			System.out.println("Enter quantity value of SKUID C");
			
			int skuIdC = sc.nextInt();
			
			System.out.println("Enter quantity value of SKUID D");
			
			int skuIdD = sc.nextInt();
			
			int total = calc.calculateTotalCost(skuIdA, skuIdB, skuIdC, skuIdD);
			
			System.out.println(" Total Calculated Cost : "+ total);
			
			break;

		default:
			break;
		}
		
		
	}

}
