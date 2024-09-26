package assignment2;

import java.util.TreeSet;

import day6.Employee;

public class Song implements Comparable<Song> {
	private int srno;
	private String title;
	private int ryear;
	TreeSet<String> artist;
	
	public int getSrno()
	{
		return srno;
	}
	public String getTitle()
	{
		return title;
	}
	public int getryear()
	{
		return ryear;
	}
	public TreeSet<String> getartist()
	{
		return artist;
	}
	
	public Song(int srno,String title,int ryear,TreeSet<String> artist)
	{
		this.srno = srno;
		this.title = title;
		this.ryear = ryear;
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Song [srno=" + srno + ", title=" + title + ", Release year=" + ryear + ", artist=" + artist + "]";
	}
	public int compareTo(Song o) {
		
		return this.srno - o.srno;
		
	}
}
