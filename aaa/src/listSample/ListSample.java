package listSample;

import java.util.Arrays;
import java.util.List;

public class ListSample {
	public static void main (String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d");
		list.forEach(System.out::println);
	}

}