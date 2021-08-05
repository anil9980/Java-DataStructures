package com.anil.learning.Ds;

import java.util.Scanner;

public class QueueMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a length");
	int n=sc.nextInt();
	Queue q=new Queue(n);
	while(true){
		System.out.println("enter 1 for insert");
		System.out.println("enter 2 for delete");
		System.out.println("enter 3 for display");
		System.out.println("enter your choice");
		
		int choice=sc.nextInt();
		switch (choice) {
		case 1:q.insert();
			
			break;
		case 2:q.delete();
			break;
		case 3:q.display();
		break;

		default:System.exit(0);
			break;
		}
	}
}
}
