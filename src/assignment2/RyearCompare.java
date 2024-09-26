package assignment2;

import java.util.Comparator;

public class RyearCompare implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return o1.getryear()-o2.getryear();
	}

}
