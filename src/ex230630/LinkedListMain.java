package ex230630;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyLinkedList{
	int num;
	MyLinkedList next;
	
}


public class LinkedListMain {
	public static void main(String[] args) {
		
		
		MyLinkedList myLinkedList1 = new MyLinkedList();
		MyLinkedList myLinkedList2 = new MyLinkedList();
		myLinkedList1.num = 10;
		myLinkedList1.next = myLinkedList2;
		myLinkedList2.num = 20;
		
		System.out.println(myLinkedList1.next== myLinkedList2);
		
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		
		for(int i =0;i<list.size();i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		list.remove(0);
		
		for(String str: list)
			System.out.print(str + '\t');
		System.out.println();
	}
}
