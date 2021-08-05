package com.anil.learning.Ds;

import java.util.Scanner;

public class Queue {
private int arr[];
private int r=-1;
private int f=0;
//private int size;
private Scanner sc=new Scanner(System.in);

public Queue(int n){
	arr=new int[n];
	//size=arr.length;
}

public void insert(){
	if(r==arr.length-1){
		System.out.println("queue is full");
	}
	else{
		System.out.println("enter a element");
		int elem=sc.nextInt();
		++r;
		arr[r]=elem;
	}
}

public void delete(){
	if(f>r){
		System.out.println("queue is empty");
	}
	else{
		System.out.println("the deleted element is"+arr[f]);
		f++;
	}
}
 public void display(){
	if(r==-1){
		System.out.println("display not possible");
		
	}
	else{
		for(int i=f;i<=r;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
}

