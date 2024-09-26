package assignment3_article;

import java.util.TreeSet;

public class Article {
	public int srno;
	public String subject;
	public int year;
	public int views;
	TreeSet<String> category;
	
	public int getsrno() {
		return srno;
		
	}
	public String getsubject() {
		return subject;
	}
	public int getyear() {
		return year;
	}
	public int getviews() {
		return views;
	}
   public TreeSet<String> getcategory(){
	   return category;
   }
   public Article (int srno,String subject,int year,int views,TreeSet<String> category) {
	   
	   this.srno = srno;
	   this.subject= subject;
	   this.year= year;
	   this.views= views;
	   this.category= category;
   }
@Override
public String toString() {
	return "Article [srno=" + srno + ", subject=" + subject + ", year=" + year + ", views=" + views + ", category="
			+ category + "]";
}
   
}
