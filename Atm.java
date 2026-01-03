package sample;

import java.util.Scanner;



public class Atm {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int correctpin=1234;

		int balance=5000;

		System.out.println("Enter the pin:");

		int pin = sc.nextInt();

		if(pin==correctpin)

		{

			System.out.println("Enter the amount:");

			int withdraw_amt = sc.nextInt();

			if(withdraw_amt<=balance)

			{

				System.out.println("Withdrawn sucessfully...");

			}

			else

			{

				System.out.println("Insufficient amount...");

			}

		}

		else

		{

			System.out.println("Incorrect pin...");

		}

	}



}
