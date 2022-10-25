import java.util.Scanner;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 실전_조건문 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		org.jsoup.select.Elements title = doc.select("td.info a.title");
		for(int i=0; i<title.size();i++) {
			System.out.println((i+1) + "." +title.get(i).text());
		};
		
		

	}

}
