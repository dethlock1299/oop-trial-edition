package assignment4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String selection;
		String txt1, txt2;
		String albumname, year, songtitle, artist;
		ArrayList<Album> album = new ArrayList<Album>();
		int m,i;
		
		System.out.println("Main Menu");
		do {
			System.out.println("1. Input Album");
			System.out.println("2. Display Albums");
			
			System.out.print("User Input: ");
			selection = input.nextLine();
			
			System.out.print("txt1: ");
			txt1 = input.nextLine();
			System.out.print("txt2: ");
			txt2 = input.nextLine();
			System.out.println("txt1: " + txt1);
			System.out.println("txt2: " + txt2);
			
			if(selection.equals("1")) {
				
				System.out.println("Album Name: ");
				albumname = input.nextLine();
				System.out.print("Album Year: ");
				year = input.nextLine();
				Album objAlbum = new Album(year,albumname);
				System.out.println("How many songs do you want in?");
				System.out.print("Input: ");
				m = input.nextInt();
				for (i=0;i<m;i++) {
					System.out.print("Song Title: ");
					songtitle = input.nextLine();
					System.out.print("Artist: ");
					artist = input.nextLine();
					Song objSong = new Song(songtitle,artist);
					objAlbum.addSong(objSong);
				}
				album.add(objAlbum);
			}
			else if (selection.equals("2")) {
				System.out.println("Available Albums:");
				for(Album x:album) {
					System.out.println(x);
				}
			}
			
		} while(true);

	}

}
