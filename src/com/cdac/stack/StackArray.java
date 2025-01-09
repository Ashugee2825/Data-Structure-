package com.cdac.stack;

public class StackArray {
	int Max;
	int top;
	int arr[];
	
	StackArray()
	{
		Max=10;
		top=-1;
		arr=new int[Max];
	}
	StackArray(int max)
	{
		Max=max;
		top=-1;
		arr=new int[Max];
	}

	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
		
	}
	boolean isFull()
	{
		if(top==Max-1)
			return true;
		else
			return false;
		
	}
	
	void push(int value)
	{
		if(isFull())
			System.out.println("stack is full");
		else
		{
			top++;
			arr[top]=value;
		}
	}
	int pop()
	{
		int data=0;
		if(isEmpty())
			System.out.println("stack is empty");
		else
			{
			data =arr[top];
			arr[top]=0;
			top--;
			}
		return data;
	}
	
	int peek()
	{
		int data=0;
		if(isEmpty())
			System.out.println("stack is empty");
		else
			{
			data =arr[top];
			}
		return data;
	}
	void display()
	{
		if(isEmpty())
			System.out.println("stack is empty");
		else
		{
			for(int i=0;i<=top;i++)
				System.out.println(arr[i]);
		}
	}
}
