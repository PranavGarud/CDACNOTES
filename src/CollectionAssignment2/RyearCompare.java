package CollectionAssignment2;

import java.util.Comparator;

public class RyearCompare implements Comparator<Songs>{
	public int compare(Songs o1,Songs o2) {
		return o1.getRyear()-o2.getRyear();
	}

	 
}
