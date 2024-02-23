package SalesReportProject;

import java.util.Scanner;

public class Main {
	//array values based on UserInput 
	int[] values = new int[5];
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		UserInput userInput = new UserInput(sc); //setting the setter

		userInput.getUserInput(); //calling the getUserInput on UserInput.java

		Main calculate = new Main();

		System.out.println("Your inputed: \nGrossnet: " + 	calculate.calculateGrossnet(userInput.values)+
							"\nCash on Hand: " + calculate.calculateCashonHand(userInput.values));

		System.out.println("End program");
	}
	public int calculateGrossnet (int[] values){
		int grossnet1 =  values[0]+values[1]+values[2]; 
		return grossnet1;
	}
	public int calculateCashonHand (int[] values){
		return calculateGrossnet(values) +  values[3] + values[4];
	}
}
