package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachImpl {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add("Sandeep");
		list.add("Thrinadh");
		list.add("Srinivas");
		list.add("Uday");
		list.forEach(a -> System.out.println(a));
	}
}
