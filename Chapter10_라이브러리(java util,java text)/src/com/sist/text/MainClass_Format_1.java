package com.sist.text;
import java.text.*;
public class MainClass_Format_1 {
	public static void main(String[] args) {
		//숫자변환 => 오라클(패턴 9999999), 자바(패턴 #######)
		DecimalFormat df=new DecimalFormat("##,###,###");
		int value=1234567890;
		System.out.println("￦"+df.format(value));
		System.out.println("=====ChoiceFormat=====");
		double[] limit= {59,60,70,80,90}; //0~59, 60~69, 70~79, 80~89, 90이상
		String[] grade= {"F","D","C","B","A"};
		int[] score= {100,90,85,90,45,67,78};
		ChoiceFormat cf=new ChoiceFormat(limit,grade);
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]+":"+cf.format(score[i]));
		}
	}
}
