package com.sist.collection;

import java.util.Stack;

public class MainClass_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println("s="+s);
		
		while(!s.empty()) {
			System.out.println(s.pop());
		}
	}

}
