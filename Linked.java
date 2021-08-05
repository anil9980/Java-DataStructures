package com.anil.learning.Ds;

import java.util.Scanner;

public class Linked {
 class Node1{
	int data;
	Node1 link;
 }
 Node1 first;
 Scanner sc=new Scanner(System.in);
 public void insertfront(){
	 System.out.println("enter a element");
	 int elem=sc.nextInt();
	 
	 
	 Node1 newnode=new Node1();
	 newnode.data=elem;
	 newnode.link=null;
	 Node1 temp=first;
	 
	 if(first==null){
		 first=newnode;
	 }else{
		 newnode.link=first;
		 first=newnode;
	 }
	 
 }
 public void insertBetween(){
	 System.out.println("enter a position");
	 int pos=sc.nextInt();
	 
	 System.out.println("enter a element");
	 int elem=sc.nextInt();
	 
	 Node1 temp=first;
	 Node1 newnode=new Node1();
	 newnode.data=elem;
	 newnode.link=null;
	 
	 int count=1;
	 while(count<=pos-1){
		 temp=temp.link;
		 count++;
	 }
	 Node1 next=temp.link;
	 
	 newnode.link=next;
	 temp.link=newnode;
	 
	
 }
 public void deleteBetween(){
	 System.out.println("enter a pos to delete");
	 int pos=sc.nextInt();
	 int count=1;
	 Node1 temp=first;
	 while(count<=pos-1){
		 temp=temp.link;
		 count++;
		 
	 }
	 System.out.println("deleted elem is->"+temp.link.data);
	 temp.link=temp.link.link;
 }
 
 public void display(){
	 if(first==null){
		 System.out.println("display not possible");
	 }else if(first.link==null){
		 System.out.print(first.data);
	 }else{
		 Node1 temp=first;
		 while(temp!=null){
			 System.out.print(temp.data+" ");
			 temp=temp.link;
		 }
		 System.out.println();
	 }
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Linked l=new Linked();
	while(true){
		System.out.println("enter 1 for insert");
		System.out.println("enter 2 for display");
		System.out.println("enter 3 for insertbetween");
		System.out.println("enter 4 for delete between");
		System.out.println("enter other num to exit");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:l.insertfront();
			
			break;
		case 2:l.display();
			break;
		case 3:l.insertBetween();
		
				break;
		case 4: l.deleteBetween();
		break;
		default:System.exit(0);
			break;
		}
	}
	
}
}

