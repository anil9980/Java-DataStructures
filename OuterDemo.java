package com.anil.learning.Ds;

public class OuterDemo {
public static void main(String[] args) {
	OuterClass o=new OuterClass();
	int d;
	OuterClass.InnerClass i=o.new InnerClass();
	System.out.println(i.b);
}
}
