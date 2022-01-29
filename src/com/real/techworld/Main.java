package com.real.techworld;

import com.real.techworld.data_structure_set.HashSetSample;
import com.real.techworld.data_structure_set.LinkedListSample;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
	ArraySample.printIntArray();
	HashSetSample hashSetSample = new HashSetSample();


	System.out.println("=========Array List =============");
	// can dynamially add item and maintain it's order
	ArrayListSample arrayListSample = new ArrayListSample();
	arrayListSample.getMyArrayList().add("BOB");
	arrayListSample.getMyArrayList().add("TOM");
	arrayListSample.getMyArrayList().add("Jolly");


	System.out.println(arrayListSample.getMyArrayList());;
	    //can  remove item
		arrayListSample.getMyArrayList().remove(0);
		System.out.println(arrayListSample.getMyArrayList());;





	System.out.println("=========Link List =============");

	// can dynamially add item and maintain it's order
	LinkedListSample linkedListSample = new LinkedListSample();
	linkedListSample.getMyLinkedList().add("BOB");
	linkedListSample.getMyLinkedList().add("TOM");
	linkedListSample.getMyLinkedList().add("Jolly");


	System.out.println(linkedListSample.getMyLinkedList());;
	//can  remove item
		linkedListSample.getMyLinkedList().remove(0);
		System.out.println(linkedListSample.getMyLinkedList());;

		// easy and faser to manupurate date
		linkedListSample.getMyLinkedList().getFirst();
		linkedListSample.getMyLinkedList().getLast();



}

}
