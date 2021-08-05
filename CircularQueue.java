package com.anil.learning.Ds;

import java.util.Scanner;

public class CircularQueue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the length");
	int l=sc.nextInt();
	CirQue c=new CirQue(l);
	while(true){
		System.out.println("enter 1 for insert");
		System.out.println("enter 2 for delete");
		System.out.println("enter 3 for display");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch (choice) {
		
		case 1:c.insert();
			
			break;
		case 2:c.delete();
		break;
		case 3:c.display();
		break;
		default:System.exit(0);
			break;
		}
	}
}
}
