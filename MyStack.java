package com.Bridgelabz;

public class MyStack {
	   private int maxSize;
	   private long[] stackArray;
	   private int top;
	   
	   public MyStack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	   System.out.println( "adding "+( stackArray[++top] = j));
	   }
	   public char pop() {
		   	int i = top--;
		 System.out.println("pop"+(stackArray[i]));
	      return (char) stackArray[i];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   
	}
