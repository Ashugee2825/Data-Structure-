package com.cdac.list.dlist;

import java.util.Scanner;

import com.cdac.list.Node;

public class DoublyList {

	DNode head;   // first node address
	int count;
	DoublyList()
	{
	head=null;
	count=0;
	}
	void createlist(int n)
	{
		Scanner sc = new Scanner(System.in);
		int value;
		for(int i=0;i<n;i++)
		{
			value=sc.nextInt();
			DNode newNode=new DNode(value);   //create new node to connect in list
			
			//connect in list
			if(head==null)
				head=newNode;
			//Node = new value;   // error on this line.
            
			else
			{
				DNode r=head;  // use reference to traverse started from first node
				while(r.next!=null)
				{
					r=r.next;
				}
				r.next=newNode;
				newNode.prev=r;
			//	r.next=newNode;
			}
			count++;
		}
	}
	void addlast(int value)
	{
		DNode newNode=new DNode(value);   //create new node to connect in list
		
		//connect in list
		if(head==null)
			head=newNode;
		else
		{
			DNode r=head;  // use reference to traverse started from first node
			while(r.next!=null)
			{
				r=r.next;
			}
			r.next=newNode;
			newNode.prev=r;
		}
		count++;
	}
	void display()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			DNode r=head;  // use reference to traverse started from first node
			while(r!=null)
			{	if(r.next==null)
				System.out.println(r.data  );
				else
				System.out.print(r.data + "->");
			
				r=r.next;
			}
		}
	}
	int size()
	{
		return count;
	}
	void addfirst(int value)
	{
		DNode newNode=new DNode(value);   //create new node to connect in list
		
		//connect in list
		if(head==null)
			head=newNode;
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		count++;
	}
	void addbetween(int value,int pos)
	{
		if(count<2)
		{
			System.out.println("cannot insert. first insert few more elemnts");
		}
		else
		{
			if(pos>=count)
				System.out.println("invalid position");
			else
			{
				DNode newNode=new DNode(value);
				//traverse till position
				DNode r=head;
				for(int i=1;i<pos;i++)
					r=r.next;
				
				newNode.next=r.next;
				newNode.prev=r;
				newNode.next.prev=newNode;
				r.next=newNode;
				
				count++;
			}
		}
	}
				
				
				
}
