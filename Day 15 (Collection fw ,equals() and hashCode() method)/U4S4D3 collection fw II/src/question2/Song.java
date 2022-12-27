package question2;

import java.util.Objects;

public class Song {

	public Song() {
		super();
	}

	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}

	private String movieName;
	
	private String songName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	void play() {
		System.out.println(songName +" of "+movieName+" is playing...!");
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(movieName, songName);
	}

	@Override
	public boolean equals(Object obj) {
		Song s1 = this;
		Song s2 = (Song) obj;
		
		return s1.getMovieName().equals(s2.getMovieName()) && s1.getSongName().equals(s2.getSongName());
	}
	
	
}
