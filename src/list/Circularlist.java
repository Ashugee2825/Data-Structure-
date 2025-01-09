package list;

import java.util.Scanner;

public class Circularlist {
	Node head;  //to hold first node address
	Node last;  // to hold last node address
	int count;
	public Circularlist() {
		head=last=null;
		count=0;
	}
	void createlist(int noOfNodes)
	{
		Scanner sc = new Scanner(System.in);
 
		Node temp;
		for (int i = 0; i < noOfNodes; i++) {
			System.out.println("enter the  integer data ");
			int data = sc.nextInt();
 
			Node newNode = new Node(data);
			if(head==null)
			{
				head=newNode;
			}
			else
			{
				last.next=newNode;
			}
			last=newNode;
			newNode.next=head;
			count++;
		}
 
	}
	void addlast(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			last.next=newNode;
		}
		last=newNode;
		newNode.next=head;
		count++;
	}
	void display()
	{
		if (head == null) {
			System.out.println("list is empty");
		}
 
		else {
 
			Node r = head;
			// System.out.println(head);
			do{
				System.out.print(r.data + " ");
				r = r.next;
 
			}while (r != head); 
			System.out.println("");
	}
	}
	void addfirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			last=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		last.next=head;
		count++;
	}
	void removelast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			if(head==last)
				head=last=null;
			else
			{
				Node t=head;
				while(t.next!=last)
				{
					t=t.next;
				}
				t.next=head;
				//delete last;
				last =t;
			}
			count--;
			}
		
	}
	void removefirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			if(head==last)
				head=last=null;
			else
			{
				
				head=head.next;
				last.next=head;
			}
			count--;
			}
		
	}
	int size()
	{
		return count;
	}
	public static void main(String[] args) {
		Circularlist l=new Circularlist();
		l.createlist(5);
		l.display();
		System.out.println("no of nodes present in list "+l.size());
		l.addlast(100);
		l.display();
		System.out.println("no of nodes present in list "+l.size());
		l.addfirst(5);
		l.display();
		System.out.println("no of nodes present in list "+l.size());
		
		l.removefirst();
		l.display();
		System.out.println("no of nodes present in list "+l.size());
		l.removelast();
		l.display();
		System.out.println("no of nodes present in list "+l.size());
	}
}