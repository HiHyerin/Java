package com.sist.regex;
/*
 	<div class="thumb_cont">
  	<strong class="tit_item">
    <a href="/moviedb/main?movieId=149380" class="link_txt" data-tiara-layer="moviename">올빼미</a>
    </strong>	
 	
 */
import java.util.*;
import java.util.regex.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class MainClass_Regex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movie= {
				"올빼미 영화",
				"블랙 팬서: 와칸다 포에버",
				"동감",
				"데시벨",
				"스트레인지 월드",
				"원피스 필름 레드",
				"창밖은 겨울",
				"폴: 600미터",
				"유포자들",
				"한산 리덕스"
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("========영화목록========");
		for(int i=0;i<movie.length;i++) {
			System.out.println((i+1)+"."+movie[i]);
		}
		System.out.println("======================");
		System.out.print("영화선택: ");
		int movieId=scan.nextInt();
		
		String title=movie[movieId-1];
		System.out.println("선택된 영화명: "+title);
		try {
		String url="https://www.youtube.com/results?search_query="+title;
		Document doc = Jsoup.connect(url).get();
		String pattern="/watch\\?v=[^가-힣]+";
		String data=doc.toString();
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(data);
		String key="";
		int i=0;
		while(m.find()) {
			if(i==0) {
			key=m.group();
		
			break;
			}
			i++;
		}
		key=key.substring(key.indexOf("=")+1,key.indexOf("\""));
		System.out.println(key);
		Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://youtube.com/embed/"+key);
		}catch(Exception ex) {}
	}

}
