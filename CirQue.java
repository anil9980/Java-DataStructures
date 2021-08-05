package com.anil.learning.Ds;

import java.util.Scanner;

public class CirQue {
private int arr[];
private int count=0;
private int r=-1,f=0;
private int size;
private Scanner sc=new Scanner(System.in);
public CirQue(int n){
	arr=new int[n];
	size=arr.length;
	
}

public void insert(){
	if(count==size){
		System.out.println("insertion not possible");
	}else{
		System.out.println("enter a element");
		int elem=sc.nextInt();
		r=(r+1)%size;
		arr[r]=elem;
		++count;
	}
}

public void delete(){
	if(count==0){
		System.out.println("deletion is not possible");
	}else{
		System.out.println("the deleted element is -->"+arr[f]);
		f=(f+1)%size;
		--count;
	}
}

public void display(){
	int f1=f;
	if(count==0){
		System.out.println("display is not possible");
	}else{
		for(int i=1;i<=count;i++){
			System.out.print(arr[f1]+" ");
			f1=(f1+1)%size;
		}
	}
}
}
