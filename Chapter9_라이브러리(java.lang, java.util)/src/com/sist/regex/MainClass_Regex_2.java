package com.sist.regex;
import java.util.regex.*;
public class MainClass_Regex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="HP:010-1111-1111,OFFICE:02-2222-2222";
		String pattern="(0\\d{1,2})-(\\d{4})-(\\d{4})"; // 0뒤에 숫자 하나 또는 두개, 숫자 4개, 숫자4개
		
		//System.out.println(pattern);
		Pattern p=Pattern.compile(pattern);
		Matcher m =p.matcher(data);
		while(m.find()) //존재여부 봑인
		{
			System.out.println(m.group());
		}
		
		String ip="211.89.63.1,211.89.63.131,127.0.0.1,169.123.174.2,223.130.195.200,121.53.105.193,"
				+ "142.250.196.100, 12345.123.11111.5555,67676767.567";

		String pattern1="(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
		
		Pattern p1= Pattern.compile(pattern1);
		Matcher m1=p1.matcher(ip);
//		while(m1.find()) {
//			if(m1.group(1)+"."+m1.group(2)+"."+m1.group(3)).equals("211.89.63")){
//				System.out.println(m1.group());
//			}
//		}
		
		
		
	}
}
