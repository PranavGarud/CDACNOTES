package CollectionAssignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import assignment2.Song;

public class SongCollection {
	public List<Songs> initializeSongData(){
		List<Songs> song= new ArrayList();
		
		TreeSet<String> art1 = new TreeSet<>();
		art1.add("AS");
		art1.add("SG");
		Songs a1= new Songs(1,"tera vada",2008,art1);
		
		TreeSet<String> art2 = new TreeSet<>();
		art2.add("sk");
		art2.add("pk");
		Songs a2 = new Songs(2,"jane man",2009,art2);
		 
		TreeSet<String> art3 = new TreeSet<>();
		art3.add("dk");
		art3.add("gk");
		Songs a3 = new Songs(3,"tu hi re",2011,art3);
		 
		TreeSet<String> art4 = new TreeSet<>();
		art4.add("sam");
		art4.add("samera");
		Songs a4 = new Songs(4,"hum tum",2023,art4);
		
		TreeSet<String> art5 = new TreeSet<>();
		art5.add("sk");
		art5.add("pk");
		Songs a5 = new Songs(5,"tere nal",2018,art5);
		
		song.add(a1);
		song.add(a2);
		song.add(a3);
		song.add(a4);
		song.add(a5);
		 return song;
		
	}
	public List<Songs> addSongs(List<Songs> song,Songs s){
		song.add(s);
		return song;
	}
	public Songs getSongs(List<Songs> song,int srno){
		for(Songs s : song) {
			if(s.getSrno()==srno) {
				return s;
			}
			 
		}
		return null;
	}
	public void printSongsInfo(List<Songs> song) {
		for(Songs s : song) {
			System.out.println(s);
		}
	}
	
	//Filter songs by year
	public ArrayList<Songs> filterList(List<Songs> song,int ryear){
		ArrayList<Songs> filtered = new ArrayList<>();;
		for(Songs s : song) {
			if(s.getRyear()==ryear) {
				filtered.add(s);
			}
		}
		return filtered;
	}
	public ArrayList<Songs> filterList(List<Songs> song, String predicate)
	{ 
		ArrayList<Songs> filtered = new ArrayList<>();
		for(Songs s : song)
		{
			if(s.getArtists().contains(predicate))
			{
				filtered.add(s);
			}
		}
		return filtered;

}
	public HashMap<String,Integer> Listing(List<Songs> list){
		HashMap<String,Integer> map = new HashMap<>();
		for(Songs s: list) {
			map.put(s.getTitle(), s.getRyear());
			
		}
		return map;
	}
}
