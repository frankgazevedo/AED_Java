package application;

import java.util.ArrayList;

import entities.IteratorLinkedList;
import entities.LinkedList;

public class ProgramIterator {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		ArrayList<Integer> vector = new ArrayList<>();
		
		int limit = 100000;
		
		// adding element(s)
		long timeBeginning = System.currentTimeMillis();
		for (int i = 0; i < limit; i++) {
			vector.add(i);
		}
		long timeEnding = System.currentTimeMillis();
		System.out.println("Adding " + limit + " element(s) in the vector");
		System.out.println(timeEnding - timeBeginning);
		
		timeBeginning = System.currentTimeMillis();
		for (int i = 0; i < limit; i++) {
			list.addNodeBeginningList(i);
		}
		timeEnding = System.currentTimeMillis();
		System.out.println("Adding " + limit + " element(s) in the linked list");
		System.out.println(timeEnding - timeBeginning);
		
		// reading element(s)
		timeBeginning = System.currentTimeMillis();
		for (int i = 0; i < vector.size(); i++) {
			vector.get(i);
		}
		timeEnding = System.currentTimeMillis();
		System.out.println("Elements reading time in the vector");
		System.out.println(timeEnding - timeBeginning);
		
		// reading element(s) with no Iterator
		timeBeginning = System.currentTimeMillis();
		for (int i = 0; i < list.getLength(); i++) {
			list.get(i);
		}
		timeEnding = System.currentTimeMillis();
		System.out.println("Elements reading time in the linked list without Iterator");
		System.out.println(timeEnding - timeBeginning);
		
		// reading element(s) with Iterator		
		timeBeginning = System.currentTimeMillis();
		IteratorLinkedList<Integer> iterator = list.getIterator();		
		while(iterator.hasNext()) {
			iterator.getNext();
		}
		timeEnding = System.currentTimeMillis();
		System.out.println("Elements reading time in the linked list with Iterator");
		System.out.println(timeEnding - timeBeginning);
		


	}

}
