package com.anil.learning.Ds;

import java.util.Scanner;

public class LinkedList {
	class Node{
		int data;
		Node link;
	}
	
private	Scanner sc=new Scanner(System.in);
private Node first;

public void insertRear(){
	Node newnode=new Node();
	System.out.println("enter a elem");
	int elem=sc.nextInt();
	newnode.data=elem;
	newnode.link=null;
	if(first==null){
		first=newnode;
	}
	else{
		Node temp=first;
		while(temp.link!=null){
			temp=temp.link;
		}
		temp.link=newnode;
	}
	
	
}

public void deleteRear(){
	if(first==null){
		System.out.println("deletion not possible");
	}
	else if(first.link==null){
		first=null;
	}
	else{
		Node temp;
		temp=first;
		while(temp.link.link!=null){
			temp=temp.link;
		}
		temp.link=null;
	}
}


public void insertFront(){
	System.out.println("enter a element");
	int elem=sc.nextInt();
	Node newnode=new Node();
	newnode.data=elem;
	newnode.link=null;
	
	if(first==null){
		first=newnode;
	}
	else{
		newnode.link=first;
		first=newnode;
	}
}

public void deleteFront(){
	if(first==null){
		System.out.println("deletion not possible");
	}
	else if(first.link==null){
		first=null;
	}
	else{
		System.out.println("deleted element is"+first.data);
		first=first.link;
	}
}

public void display(){
	if(first==null){
		System.out.println("display not possible");
	}else if(first.link==null){
		System.out.println(first.data);
	}else{
		Node temp=first;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList ll=new LinkedList();
	
	while(true){
		System.out.println("enter 1 to insertrear");
		System.out.println("enter 2 to deleterear");
		System.out.println("enter 3 to insertfront");
		System.out.println("enter 4 to deletefront");
		System.out.println("enter 5 to display");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:ll.insertRear();
			
			break;
		case 2:ll.deleteRear();
			break;
		case 3:ll.insertFront();
			break;
		case 4:ll.deleteFront();
			break;
		case 5:ll.display();
			break;

		default:System.exit(0);
			break;
		}
	}
}
}
