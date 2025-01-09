
package list;

import java.util.Scanner;

public class Linkedlist {
Node head;  //stores address of first node
int count;    // count no of nodes in list

public Linkedlist() {
	head=null;
	count=0;
}
void createlist(int n)
{
	Scanner sc=new Scanner(System.in);
	int value;
	for(int i=0;i<n;i++)
	{
		value=sc.nextInt();
		Node newNode=new Node(value);   //crete new node to connect in list
		
		//connect in list
		if(head==null)
			head=newNode;
		else
		{
			Node r=head;  // use reference to traverse started from first node
			while(r.next!=null)
			{
				r=r.next;
			}
			r.next=newNode;
		}
		count++;
	}
}
void display()
{
	if(head==null)
	{
		System.out.println("list is empty");
	}
	else
	{
		Node r=head;  // use reference to traverse started from first node
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
void addlast(int value)
{
	Node newNode=new Node(value);   //crete new node to connect in list
	
	//connect in list
	if(head==null)
		head=newNode;
	else
	{
		Node r=head;  // use reference to traverse started from first node
		while(r.next!=null)
		{
			r=r.next;
		}
		r.next=newNode;
	}
	count++;
}
void addbeg(int value)
{
Node newNode=new Node(value);   //crete new node to connect in list
	
	//connect in list
	if(head==null)
		head=newNode;
	else
	{
		newNode.next=head;
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
			Node newNode=new Node(value);
			//traverse till position
			Node r=head;
			for(int i=1;i<pos;i++)
				r=r.next;
			
			//connect in list
			newNode.next=r.next;
			r.next=newNode;
			
			count++;
		}
	}
}

}
