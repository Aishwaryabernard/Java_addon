package Selectionprogram;

import java.util.Scanner;

public class Calc {


	public static void main(String[] args) {

		Scanner ref=new Scanner(System.in);

        int choice;

        while(true) {

        	System.out.println("Enter your choice");

        	System.out.println("1.Addition");

        	System.out.println("2.Multiplication");

        	System.out.println("3.Subtraction");

        	System.out.println("4.Division");

        	choice=ref.nextInt();

        	if(choice>=1 && choice<=4) {

        		System.out.println("enter the first value");

        		int val1=ref.nextInt();

        		System.out.println("enter the second value");

        		int val2=ref.nextInt();

        	    switch(choice){

                case 1:

                	System.out.println("Addition"+(val1+val2));

                	break;

                case 2:

                	System.out.println("Multiplication"+(val1*val2));

                	break;

                case 3:

                	System.out.println("Subtraction"+(val1-val2));

                	break;

                case 4:

                	System.out.println("Division"+(val1/val2));

                }

            }

        else {

        	System.out.println("Exited");

        }

	}

	}

}

