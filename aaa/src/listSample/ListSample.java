package listSample;

import java.util.Arrays;
import java.util.List;

public class ListSample {
	public static void main (String[] args) {
		ListSample ls = new ListSample();
		List<String> list = Arrays.asList("a", "b", "c", "d");
//		ls.methodReference(list);
		ls.lambda1(list);
		ls.lambda1_2(list);

		List<OwnBean> list2 = Arrays.asList(new OwnBean("a"), new OwnBean("b"), new OwnBean("c"), new OwnBean("d"));
		ls.lambda2(list2);
	}

	public void methodReference(List<String> list) {
		list.forEach(System.out::print);

	}

	public void lambda1 (List<String> list) {
		list.forEach((String word)->System.out.println(word));
	}

	public void lambda1_2 (List<String> list) {
		list.forEach(word -> System.out.println(word));

	}

	public void lambda2 (List<OwnBean> list) {
		list.forEach((OwnBean own)->System.out.println(own.getWord()));
	}




}