package com.sist.collection2;
/*
 	properties
 	- 파일을 읽어서 데이터를 가지고 온다
 		=> 중요한 데이터가 있는 경우(데이터베이스 정보)
 		=> 유효성 검사(마이바티스 , 스프링에서 자주 사용)
 		Spring 4 => XML
 		Spring 5 => Java
 		------------------요즘엔 SpringBoot가 대세
 		
 		1) 객체생성
 		2) 파일읽기
 		3) 키 (값 읽기)
 */

import java.util.*;
import java.io.*;
public class MainClass_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Properties prop=new Properties();
			//파일 읽기 p.660(*****)
			prop.load(new FileInputStream("C:\\javaDev\\JavaStudy\\Chapter11_컬렉션_2\\src\\com\\sist\\collection2\\info.properties"));
			String name=prop.getProperty("name");
			String address=prop.getProperty("address");
			String tel=prop.getProperty("tel");
			System.out.println(name+" "+address+" "+tel);
			
			// p.663
			Properties props=System.getProperties(); //시스템에 저장된 걸 갖고올 때
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("user.language"));
			props.list(System.out);
			
			// p.662
			Properties props2=new Properties();
			props2.setProperty("driver","orcle.jdbc.driver.OracleDriver");
			props2.setProperty("url","jdbc:oracle:thin:@localhost:1521:XE");
			props2.setProperty("username","hr");
			props2.setProperty("password","happy");
			try {
				props2.store(new FileOutputStream("db.propertis"), "데이터베이스 정보");
				props2.storeToXML(new FileOutputStream("db.xml"), "database info");
			} catch(Exception ex) {}
			
			
			
		}catch(Exception ex) {}
	}

}
