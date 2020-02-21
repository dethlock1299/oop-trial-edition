package switchcase;

//import java.util.Scanner;
//import java.io.BufferedInputStream;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//int i=1;
		/*FOR
		  for(; ;) {
			System.out.println("Run -" + i);
			i+=2;
			if (i>=10) break;
		}*/
		
		/*while(i<=10) {
			System.out.println("Run -" + i);
			i+=2;
		}*/
		
		/*Scanner input = new Scanner(System.in);
		String answer;
		boolean again = true;
		while(again) {
			System.out.println("Run - " + i);
			i++;
			System.out.println("Again y/n?");
			answer = input.next();
			again = (answer.equals("y"))? true : false;
		}*/
		String name;
		name = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "Welcome "+name);
		int lecturer = JOptionPane.showConfirmDialog(null, "Are you a lecturer?");
		System.out.println(lecturer);
	}

}
