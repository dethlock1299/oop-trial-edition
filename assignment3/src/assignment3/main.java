package assignment3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int smallest;
		int largest;
		int sum, flag;
		int n, i,m=0;//counter
		
		System.out.print("Enter the smallest number: ");
		smallest = input.nextInt();
		System.out.print("Enter the largest number: ");
		largest = input.nextInt();
		
		sum = 0;
		for(n=smallest;n<=largest;n++) {
			m = n/2;
			flag = 0;
			for(i=2;i<=m;i++){    
				   if(n%i==0 || n == 0 || n==1){        
				   flag=1;
				   break;
				   }
			}
			if(flag==0) {
				sum=sum+n;
			}
		}
		System.out.println("The sum of all prime values from " +smallest+" to "+largest+" is "+sum);
	}
}