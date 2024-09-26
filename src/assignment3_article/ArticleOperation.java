package assignment3_article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleOperation {
	public static List<Article> initializeArticle(){
		
		
		List<Article> arti = new ArrayList<>();
		TreeSet<String> cat1 = new TreeSet<>();
		cat1.add("Olympics");
		cat1.add("fitness");
		cat1.add("Athlete");
		Article a1 = new Article( 1 , "Olympic opening Ceremony", 2024 , 15000 , cat1);
		
		
		TreeSet<String> cat2 = new TreeSet<>();
		cat2.add("Health Issues");
		cat2.add("fitness");
		cat2.add("Junk Food");
		Article a2 = new Article( 2 , "Health Issues", 2016 , 7000 , cat2);
		
		
		TreeSet<String> cat3 = new TreeSet<>();
		cat3.add("Country");
		cat3.add("GDP");
		cat3.add("Economy");
		Article a3 = new Article( 3 , "Devoloping Country Rate", 2023 , 4000 , cat3);
	
		
		TreeSet<String> cat4 = new TreeSet<>();
		cat4.add("Mobile");
		cat4.add("Technology");
		Article a4 = new Article( 4 , "Mobile", 2023 , 45000 , cat4);
		
		
		
		TreeSet<String> cat5 = new TreeSet<>();
		cat5.add("Social Issues");
		cat5.add("Child Abuse");
		cat5.add("Bihar");
		Article a5 = new Article( 5 , "Social Issues", 2018 , 12000 , cat5);
		
		TreeSet<String> cat6 = new TreeSet<>();
		cat6.add("Celebreties");
		cat6.add("Nepotism");
		Article a6 = new Article( 6 , "Celebreties", 2023 , 1000 , cat6);
		
		TreeSet<String> cat7 = new TreeSet<>();
		cat7.add("Pollution");
		cat7.add("Global Warming");
		cat7.add("Forest");
		Article a7 = new Article( 7 , "Deforestration", 2021 , 13000 , cat7);
		
		arti.add(a1);
		arti.add(a2);
		arti.add(a3);
		arti.add(a4);
		arti.add(a5);
		arti.add(a6);
		arti.add(a7);
		
		return arti;
	}
	
	public static void main(String args[])
	{
		List<Article> arti = initializeArticle();
		Stream<Article> stream = arti.stream();
		
		System.out.println("Articles Created in 2023 : ");
		stream.filter((emp) -> emp.getyear()==2023).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		System.out.println("List by Subject : ");
		stream = arti.stream();
		Comparator<Article> bysubject = Comparator.comparing(Article::getsubject);
		stream.sorted(bysubject).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		stream = arti.stream();
		Map<String, Long> dmap = stream.collect(Collectors.groupingBy(Article :: getsubject,Collectors.counting()));
		dmap.forEach((k,v) -> System.out.println("Subject : "+k + " | Total : " + v));
		System.out.println("--------------------------------------------------------------");
		stream = arti.stream();
		System.out.println("Articles got more than 10k : ");
		stream.filter((emp) -> emp.getviews()>10000).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		stream = arti.stream();
		System.out.println("Articles top 5 : ");
		Comparator<Article> byview = Comparator.comparing(Article::getviews);
		stream.limit(5).sorted(byview).collect(Collectors.toList()).reversed().forEach(System.out::println);
		
		//System.out.println();
	}

}
