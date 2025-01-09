package stack_linkedlist;
 
 
//Stack is implement by using Linked List
 
import java.util.Scanner;
 
public class Stacklinkedlist<E>
{
	
	int count=0;
	
	Node<E> top=null;			//top take address of last inserted node
	
	boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	
	void push(E val)			//Use to insert element in Stack
	{
		Node<E> n1=null;
		n1=new Node<E>(val);
		
		if(n1==null)				//Use to check heap memory is  full or not this condition only work in C++ case.
		{
			System.out.println("Satck is full");
		}
		else
		{
			if(isEmpty())
			{
				top=n1;
			}
			else
			{
				n1.next=top;
				top=n1;
			}
			count++;
		}
	}
	
	int size()
	{
		return count;
	}
	
	E pop()
	{
		E data=null;
		if(isEmpty())
			System.out.println("Stack is empty");
		else
		{
			data=top.data;
			top=top.next;
			count--;
			
		}
		return data;
	}
	
	void display()
	{
		if(isEmpty())
			System.out.println("Stack is Empty");
		else
		{
			Node<E> r=top;
			
			while(top!=null)
			{
				System.out.println(top.data+" ");
				top=top.next;
			}
			
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Stacklinkedlist<String> k=new  Stacklinkedlist<String>();
		
		Scanner s=new Scanner(System.in);
		
		k.push("val");
		k.push("value");
		k.display();
		
		System.out.println("Enter the no of element u insert");
		
		int n=s.nextInt();
		
		for(int i=0;i<n;i++);
		{
			System.out.println("Enter the string value ");
			String val=s.next();
			
			k.push(val);
		}
		
		k.display();
		
		
		
	}
	
}
 