package assignment2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int flag=0, m=0, i;
		int n;
		
		System.out.print("Enter a number: ");
		n = input.nextInt();
		m = n/2;
		if(n == 0 || n==1) {
			System.out.println(n+" is not prime number");
		}
		else {
			for(i=2;i<=m;i++){    
			    if(n%i==0){    
			     System.out.println(n+" is not prime number");    
			     flag=1;
			     break;
			    }
			}
		}
		if(flag == 0) {
			System.out.println(n+" is a prime number");
		}
	}
}
