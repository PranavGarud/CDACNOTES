package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import day6.Employee;

public class SongCollection {
	
	public List<Song> initializeSongData()
	{
		List<Song> songs = new ArrayList<>();
		TreeSet<String> artist1 = new TreeSet<>();
		artist1.add("Arijit Singh");
		artist1.add("Shreya Goshwal");		
		Song s1 = new Song(1,"Ashiqui",2008,artist1);
		
		TreeSet<String> artist2 = new TreeSet<>();
		artist2.add("Honey Singh");
		artist1.add("Badshah");		
		Song s2 = new Song(2,"Desikalakar",2011,artist2);
		
		TreeSet<String> artist3 = new TreeSet<>();
		artist3.add("Ajay Ghogavle");
		artist3.add("Atul Ghogavle");		
		Song s3 = new Song(3,"Zingat",2017,artist3);

		TreeSet<String> artist4 = new TreeSet<>();
		artist4.add("Abhijit Sawant");
		artist4.add("Prem Hardeep");		
		Song s4 = new Song(4,"Mohabbatein Lutaaunga",2005,artist4);
		
		TreeSet<String> artist5 = new TreeSet<>();
		artist5.add("Sanju");
		artist5.add("Spxrk");		
		Song s5 = new Song(5,"Gulabi Sadi",2024,artist5);
		
		TreeSet<String> artist6 = new TreeSet<>();
		artist6.add("Arijit Singh");
		artist6.add("Jonita Gandhi");		
		Song s6 = new Song(6,"What Jhumka",2023,artist6);
		
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s4);
		songs.add(s5);
		songs.add(s6);
		
		return songs;
	}
	
	public List<Song> addSong(List<Song> songs,Song s)
	{
		songs.add(s);
		return songs;
	}
	
	public Song getSong(List<Song> songs,int srno)
	{
		for(Song s : songs)
		{
			if(s.getSrno() == srno)
			{
				return s;
			}
		}
		return null;
	}
	
	public void printSongInfo(List<Song> songs)
	{
		for(Song s : songs)
		{
			System.out.println(s);
		}
	}
	
	public ArrayList<Song> filterList(List<Song> songs,int year)
	{
		ArrayList<Song> filtered = new ArrayList<>();
		for(Song s : songs)
		{
			if(s.getryear()==year)
			{
				filtered.add(s);
			}
		}
		return filtered;
	}
	public ArrayList<Song> filterList(List<Song> songs, String predicate)
	{ 
		ArrayList<Song> filtered = new ArrayList<>();
		for(Song s : songs)
		{
			if(s.getartist().contains(predicate))
			{
				filtered.add(s);
			}
		}
		return filtered;
	}
	public HashMap<String,Integer> Listing(List<Song> list)
	{
		HashMap<String,Integer> map = new HashMap<>();
		for(Song s: list)
		{
			map.put(s.getTitle(),s.getryear());
		}
		return map;
	}

}
