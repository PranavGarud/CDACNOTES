package CollectionAssignment2;

import java.util.Comparator;
import java.util.TreeSet;

import assignment2.Song;

public class Songs implements Comparator<Songs> {
	protected int srno;
	protected String title;
	protected int ryear;
	TreeSet<String> artists;
	


	public Songs(int srno, String title, int ryear, TreeSet<String> artists) {
		super();
		this.srno = srno;
		this.title = title;
		this.ryear = ryear;
		this.artists = artists;
	}



	public int getSrno() {
		return srno;
	}



	public String getTitle() {
		return title;
	}



	public int getRyear() {
		return ryear;
	}



	public TreeSet<String> getArtists() {
		return artists;
	}



	@Override
	public String toString() {
		return "Songs [srno=" + srno + ", title=" + title + ", ryear=" + ryear + ", artists=" + artists + "]";
	}
	public int compareTo(Songs o) {
		
		return this.srno - o.srno;
		
	}



	@Override
	public int compare(Songs o1, Songs o2) {
		// TODO Auto-generated method stub
		return 0;
	}



	 
	}
