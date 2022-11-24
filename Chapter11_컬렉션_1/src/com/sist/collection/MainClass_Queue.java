package com.sist.collection;
import java.util.*;
public class MainClass_Queue {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		System.out.println("q="+q);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
