package day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStringStream {

	public static void main(String[] args)
	{
		String[] str = {"Red","orange","Yellow","green","Blue","indigo","Violet"};
		List<String> istr = Arrays.asList(str);

		Stream<String> stream = istr.parallelStream();
		stream.map((n) -> n.toUpperCase()).forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		stream = istr.parallelStream();
		stream.map((n) -> n.toLowerCase()).forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		stream = istr.parallelStream();
		List<String> mcolor = stream.filter((n) -> n.compareToIgnoreCase("m")<0/*n.charAt(0) < 'm'*/).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
		System.out.println(mcolor);
		System.out.println("--------------------------------------------------");
		stream = istr.parallelStream();
		List<String> alpha = stream.filter((n) -> n.length() < 5).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
		System.out.println(alpha);
		System.out.println("--------------------------------------------------");
		stream = istr.parallelStream();
		List<String> uppchar = stream.filter((n) -> n.compareTo("A")>=0 && n.compareTo("Z")<=0).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());//n.codepointAt(0) < 97
		System.out.println(uppchar);
		System.out.println("--------------------------------------------------");
		stream = istr.parallelStream();
		List<String> lowchar = stream.filter((n) -> n.compareTo("a")>=0 && n.compareTo("z")<=0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList());//n.codepointAt(0) >= 97
		System.out.println(lowchar);
		System.out.println("--------------------------------------------------");
	}
}
