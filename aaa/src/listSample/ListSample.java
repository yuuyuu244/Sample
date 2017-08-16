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
		ls.lambda2_2(list2);
		ls.lambda2_3(list2);
	}

	public void methodReference(List<String> list) {
		System.out.println("---------- start methodReference method ----------");
		list.forEach(System.out::print);

	}

	public void lambda1 (List<String> list) {
		System.out.println("---------- start lambda1 method ----------");
		list.forEach((String word)->System.out.println(word));
	}

	public void lambda1_2 (List<String> list) {
		System.out.println("---------- start lambda1_2 method ----------");
		list.forEach(word -> System.out.println(word));

	}

	public void lambda2 (List<OwnBean> list) {
		System.out.println("---------- start lambda2 method ----------");
		list.forEach((OwnBean own)->System.out.println(own.getWord()));
	}

	/**
	 * 独自クラスを格納するListを
	 * lambda式でどんなかんじまで再現できるかチャレンジ!!.
	 * @param list list 独自クラスを格納したリスト
	 */
	public void lambda2_2 (List<OwnBean> list) {
		System.out.println("---------- start lambda2_2 method ----------");
		list.forEach(own->System.out.println(own.getWord()));
	}

	/**
	 * 独自クラスを格納するListを
	 * lambda式でどんなかんじで再現できるかチャレンジ!!.
	 * @param list 独自クラスを格納したリスト
	 */
	public void lambda2_3 (List<OwnBean> list) {
		System.out.println("---------- start lambda2_3 method ----------");
		list.forEach((OwnBean own)->{
			String tmp = own.getWord();
			System.out.println(tmp);
		});
	}

// TODO why canNOT i create return...?
//	public void lambda2_4 (List<OwnBean> list) {
//		System.out.println("---------- start lambda2 method ----------");
//		String word = list.forEach((OwnBean own)->{
//			String tmp = own.getWord();
//			System.out.println(tmp);
//			return tmp;
//		});
//	}



}