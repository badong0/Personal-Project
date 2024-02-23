package SalesReportProject;

import java.util.Scanner;

public class Main {
	int emoney,coins,bills;
	int grossnet1, expenxes, bankCheque;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t ___________SALES REPORT SYSTEM___________\n Enter necessary data.");

		Main calculate = new Main();

		System.out.print("Total gcash and paymaya: ");
		calculate.emoney = sc.nextInt();
		System.out.print("Total coins: ");
		calculate.coins = sc.nextInt();
		System.out.print("Total bills: ");
		calculate.bills = sc.nextInt();
		System.out.print("Total expenses: ");
		calculate.expenxes = sc.nextInt();
		System.out.print("Total bank and cheque: ");
		calculate.bankCheque = sc.nextInt();


		System.out.println("Your inputed: \nGrossnet: " + 	calculate.calculateGrossnet()+
							"\nCash on Hand: " + calculate.calculateCashonHand());

		System.out.println("End program");
	}
	
	//grossnet = emoney + coins and bills 
	//cash on hand = grossnet + expenxes + bank&cheque
	public int calculateGrossnet (){
		grossnet1 =  emoney + coins+ bills; 
		return grossnet1;
	}
	public int calculateCashonHand (){
		return grossnet1 + expenxes + bankCheque;
	}
}
