package CollectionAssignment2;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SongPortal {

	public static void main(String[] args) {
	 SongCollection s = new SongCollection();
	 List<Songs> songlist = s.initializeSongData();
	 s.printSongsInfo(songlist);
	 
	 System.out.println("\nSorting songs by title: ");
	 Collections.sort(songlist, new TitleCompare());
	 s.printSongsInfo(songlist);
	   
	 System.out.println("\nSorting by release year: ");
	 Collections.sort(songlist, new RyearCompare());
	 s.printSongsInfo(songlist);
	 
	 System.out.println("\nSearching songs by title: ");
	 Collections.sort(songlist,new TitleCompare());
	 Songs w = new Songs(0,"jane man",0,null);
	 int index=Collections.binarySearch(songlist, w,new TitleCompare());
	 System.out.println("Found at index: "+index);
	 
	 System.out.println("\nfiltered By release year; ");
	 ArrayList<Songs> filtered = s.filterList(songlist,2023);
	 s.printSongsInfo(filtered);
	 
	 System.out.println("\nFilter by Artist Name: ");
	 filtered=s.filterList(songlist, "sk");
	 s.printSongsInfo(filtered);
	 
	 System.out.println("\nListing by Title and Release year: ");
	 HashMap<String,Integer> map =s.Listing(songlist);
	 Set<java.util.Map.Entry<String,Integer>> entries=map.entrySet();
	 for(java.util.Map.Entry<String, Integer> entry : entries) {
		 System.out.println(entry.getKey()+ " : "+entry.getValue());
		 
	 }
	}

}
