package listSample;

import java.util.Arrays;
import java.util.List;

public class ListSample {
	public static void main (String[] args) {
		ListSample ls = new ListSample();
		List<String> list = Arrays.asList("a", "b", "c", "d");
//		ls.methodReference(list);
		ls.lambda(list);
		ls.lambda2(list);
	}

	public void methodReference(List<String> list) {
		list.forEach(System.out::print);

	}

	public void lambda (List<String> list) {
		list.forEach((String word)->System.out.println(word));
	}

	public void lambda2 (List<String> list) {
		list.forEach(word -> System.out.println(word));

	}



}