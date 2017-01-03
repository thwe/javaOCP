package coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class B02_Iterieren {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(20);
		arrList.add(30);
		arrList.add(70);

		Iterator<Integer> iterator = arrList.iterator();
		while( iterator.hasNext() ) {
			Integer element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("---------------------------------");
		for (Integer element : arrList) {
			System.out.println(element);
		}
		
		
		System.out.println("----------------------------------");
		List<Date> listDate = Arrays.asList(new Date(0), new Date(13124141243L), new Date());
		
		for (Date element : listDate) {
			System.out.println(element);
		}
		
		//Map<String, Date> map;
		
		
	}

}
