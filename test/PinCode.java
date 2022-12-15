package test;

import java.util.Scanner;

public class PinCode {

	public static void main(String[] args) {
		
		int pin,i ;
		int guess;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		pin=12345;
		
		System.out.println("Welcome ...");
	
		
		for( i=1;i<=3;i++) {
			count++;
			
			System.out.println("Enter your pin..");
			
			guess= sc.nextInt();
			
			if(guess==pin) {
				System.out.println("welcome back...");
				break;
				
			}
			else {
					System.out.println("incorrect,try again ");
					
				}
		}
		
			if(count==3)
			{
				System.out.println("you have been locked out");
				
			}
		
		
		
sc.close();
		}

}
