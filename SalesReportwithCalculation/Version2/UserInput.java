package SalesReportProject;

import java.util.Scanner;

public class UserInput {
    Scanner sc;
    int [] values = new int[5]; // 5 values

    //constructor for scanner
    public UserInput(Scanner sc) {
        this.sc = sc;
    }
    public void getUserInput(){
        //this class  is used to take user input and store it in the array 'values'
        System.out.println("\t ___________SALES REPORT SYSTEM___________\n Enter necessary data.");
		System.out.print("Total gcash and paymaya: ");
		values[0] = sc.nextInt();
		System.out.print("Total coins: ");
		values[1]  = sc.nextInt();
		System.out.print("Total bills: ");
		values[2]  = sc.nextInt();
		System.out.print("Total expenses: ");
		values[3]  = sc.nextInt();
		System.out.print("Total bank and cheque: ");
		values[4]  = sc.nextInt();
    }
}
