package coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoCollections {

	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		
		Collections.sort((List)coll);
		
		Integer[] iArray = new Integer[]{4,20,10};
		Arrays.sort(iArray);

	}

}
