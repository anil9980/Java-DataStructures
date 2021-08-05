package com.anil.learning.datastructures;

import java.util.Scanner;

public class Array {
private int arr[];
private Scanner sc=new Scanner(System.in);
public Array(int n){
	arr=new int[n];
}
public void insert(){
	System.out.println("enter a position" +0+ "to" +(arr.length-1)+"to insert " );
	int pos=sc.nextInt();
	System.out.println("enter an element");
	int elem=sc.nextInt();
	arr[pos]=elem;
}

public void delete(){
	System.out.println("enter a position to delete");
	int pos=sc.nextInt();
	System.out.println("the deleted elemeent is-"+arr[pos]);
	arr[pos]=0;
}
public void display(){
	for(int i=0;i<=arr.length-1;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a length to create array");
	int l=sc.nextInt();
	Array a=new Array(l);
	while(true){
		System.out.println("enter 1 for insert ");
		System.out.println("enter 2 for delete ");
		System.out.println("enter 3 for display ");
		System.out.println("enter any other key to exit ");
		System.out.println("enter your choice ");
		int choice=sc.nextInt();
		  switch(choice){
		  case 1: a.insert();
		      break;
		  case 2: a.delete();
		     break;
		  case 3: a.display();
		     break;
		   default:System.exit(0);
		  }
	}
}
}
