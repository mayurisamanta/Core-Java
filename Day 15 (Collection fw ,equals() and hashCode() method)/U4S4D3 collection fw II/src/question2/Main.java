package question2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayList p = new PlayList();

		Scanner sc = new Scanner(System.in);
		
		HashSet<Song> songs = new HashSet<>();
		
		while (true) {

			System.out.println("Enter movie name");
			String movie = sc.nextLine();
			
			System.out.println("Enter song name");
			String song = sc.nextLine();
			
	
			Song s = new Song(movie, song);
			
			boolean b = songs.add(s);
			
			if (b == true) {
				 System.out.println("Song added to the playlist successfully.");
			 }
			 else {
				 System.out.println("Song is already added in the playlist");
			 }
			 
			
			System.out.println("Want to add another? y/n");
			String c = sc.next();
			
			sc.nextLine();
			
			if (c.equalsIgnoreCase("n")) {
				break;
			}
			
		}
		
		sc.close();
		
		for (Song s : songs) {
			p.addSong(s);
			
		}
		
		for (Song s : p.songs) {
			s.play();
		}
		
		
		
	}

}
