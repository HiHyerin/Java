package com.sist.collection;
import java.util.*;
public class MainClass_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		while(true) {
			int r=(int)(Math.random()*100)+1;
			set.add(r);
			if(set.size()==10)
				break;
		}
		System.out.println(set);
		
		TreeSet set2=new TreeSet(); // 자동정렬이 됨
		while(true) {
			int r=(int)(Math.random()*100)+1;
			set2.add(r);
			if(set2.size()==10)
				break;
		}
		System.out.println(set2);
		System.out.println("50보다 작은수:"+set2.headSet(50));
		System.out.println("50보다 큰수:"+set2.tailSet(50));
	}

}
