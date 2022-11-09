/**
* Name: Kien Tran
* File: AssignmentISBN.java
* Description: This program 
*/
import java.util.Scanner;

public class AssignmentISBN 
{
	public static void main (String[] args)
	{
		System.out.println("************************************************");
		System.out.println("* Welcome to the Daily Book Inventory Program! *");
		System.out.println("************************************************");
		Scanner keyboard = new Scanner(System.in);
		
		String isbn;
		int returned = 0;
		int checkedOut = 0;
		int total = 0;
		char returnOrCheckout;
		char yesOrNo;
		
		do
		{
			System.out.println("Enter the first 12 digits of an ISBN-13 as a String: ");
			isbn = keyboard.next();
			
			while (isbn.length() != 12)
			{
				System.out.println("Invalid ISBN-13 number! Try again.");
				System.out.println("Enter the first 12 digits of an ISBN-13 as a String: ");
				isbn = keyboard.next();
			}
			
			int checksum = 0;
			for ( int i = 0; i < isbn.length(); i++)
			{
				char digitCharacter = isbn.charAt(i);
				int digit = Character.getNumericValue(digitCharacter);
				
				if ((i + 1) % 2 == 0)
				{
					checksum += digit * 3;
				}
				else 
				{
					checksum += digit;
				}
			}
			
			checksum = 10 - checksum % 10;
			if (checksum == 10)
			{
				checksum = 0;
			}
			
			System.out.println("The ISBN-13 number is " + isbn + checksum);
			System.out.println();
			System.out.println();
			System.out.print("Enter 'R' for return or 'C' for check out: ");
			returnOrCheckout = keyboard.next().charAt(0);
			if (returnOrCheckout == 'R')
			{
				returned++;
				total++;
			}
			if (returnOrCheckout == 'C')
			{
				checkedOut++;
				total++;
			}

			System.out.println("************************************************");
			System.out.println("*             Daily Book Inventory             *");
			System.out.println("************************************************");
			System.out.println("Number of books returned:      " + returned);
			System.out.println("Number of books checked out:   " + checkedOut);
			System.out.println("The total of books processed:  " + total);
			System.out.println("************************************************");
			System.out.print("Enter 'Y' to contine, 'N' to quit: ");
			yesOrNo = keyboard.next().charAt(0);
			System.out.println();
				
		} while (yesOrNo == 'Y');
		System.out.println("************************************************");
		System.out.println("*             Daily Book Inventory             *");
		System.out.println("************************************************");
		System.out.println("Number of books returned:      " + returned);
		System.out.println("Number of books checked out:   " + checkedOut);
		System.out.println("The total of books processed:  " + total);
		System.out.println("************************************************");
		
		keyboard.close();
	}
}
