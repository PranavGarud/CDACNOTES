package CollectionAssignment2;

import java.util.Comparator;

public class TitleCompare implements Comparator<Songs>{
	public int compare(Songs o1,Songs o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

 

}
