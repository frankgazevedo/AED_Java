package application;

import entities.LinkedList;

public class Program {

	public static void main(String[] args) {
		
		LinkedList<String> lkdlst = new LinkedList<String>();
		
		System.out.println("Length: " + lkdlst.getLength());
		
		lkdlst.addNodeEndingList("AM");		
		lkdlst.addNodeEndingList("PA");
		lkdlst.addNodeEndingList("PB");
		lkdlst.addNodeEndingList("SC");
		lkdlst.addNodeBeginningList("PR");

		System.out.println("First node is " + lkdlst.getFirst().getValue());
		System.out.println("Last node is " + lkdlst.getLast().getValue());
		System.out.println("Length: " + lkdlst.getLength());
		for (int i = 0; i < lkdlst.getLength(); i++) {
			System.out.println(lkdlst.get(i).getValue());
		}		

		lkdlst.removeNode("AM");
		
		System.out.println("First node is " + lkdlst.getFirst().getValue());
		System.out.println("Last node is " + lkdlst.getLast().getValue());
		System.out.println("Length: " + lkdlst.getLength());
		for (int i = 0; i < lkdlst.getLength(); i++) {
			System.out.println(lkdlst.get(i).getValue());
		}
		
		lkdlst.removeNode("PR");
		lkdlst.removeNode("PA");
		lkdlst.removeNode("PB");
		
		System.out.println("First node is " + lkdlst.getFirst().getValue());
		System.out.println("Last node is " + lkdlst.getLast().getValue());
		System.out.println("Length: " + lkdlst.getLength());
		for (int i = 0; i < lkdlst.getLength(); i++) {
			System.out.println(lkdlst.get(i).getValue());
		}		
		
		lkdlst.removeNode("SC");
		System.out.println("Length: " + lkdlst.getLength());
		for (int i = 0; i < lkdlst.getLength(); i++) {
			System.out.println(lkdlst.get(i).getValue());
		}
	}

}
