package sample;

import java.util.Scanner;



public class BioData {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

       System.out.println("Enter your name:");

       String name = sc.next();

       System.out.println("Enter your number:");

       Long phone = sc.nextLong();

       System.out.println("Enter your age:");

       int age = sc.nextInt();

       System.out.println("Enter your address:");

       String address = sc.next();

      System.out.println(name+" "+phone+" "+age+" "+address);

	}



}
