package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;



public class SongPortal {
	
	public static void main(String[] args)
	{
		SongCollection s = new SongCollection();
		List<Song> songlist = s.initializeSongData();
		s.printSongInfo(songlist);
		
		System.out.println("\nSorting Songs by title : ");
		Collections.sort(songlist,new TitleCompare());
		s.printSongInfo(songlist);
		
		System.out.println("\nSorting Songs by Release Year : ");
		Collections.sort(songlist,new RyearCompare());
		s.printSongInfo(songlist);
		
		System.out.println("\nSearching Songs by title : ");
		Collections.sort(songlist,new TitleCompare());		
		Song w = new Song(0,"What Jhumka",0,null);
		int index = Collections.binarySearch(songlist,w,new TitleCompare());
		System.out.println("Found at index:" + index);
		
		System.out.println("\nFilter by Release Year ");
		ArrayList<Song> filtered = s.filterList(songlist,2024);
		s.printSongInfo(filtered);
		
		System.out.println("Filter by Artist Name :");
		filtered = s.filterList(songlist, "Arijit Singh");
		s.printSongInfo(filtered);
		
		System.out.println("Listing by Tile and Release Year :");
		HashMap<String,Integer> map = s.Listing(songlist);
		Set<Entry<String,Integer>> entries = map.entrySet();
		for(Entry<String,Integer>entry : entries)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
