package queue;

// import Node;

public class QueueList<E> {
	Node<E> front;
	Node<E>  rear;
	int count;
	
	public QueueList() {
		front=rear=null;
		count=0;
		}

	boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
		
	}
	
	void enQueued(E value)
	{
		Node<E> newNode=null;
		newNode=new Node<E>(value);
		if(newNode==null)
		{
			System.out.println("queue is full");
		}
		else
		{
			if(isEmpty())
				front=rear=newNode;
			else
				{
				rear.next=newNode;
				rear=newNode;
				}
			count++;
			
		}
	}
	E deQueued()
	{
		E data=null;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			data=front.data;
			if(front==rear)
				front=rear=null;
			else
				front=front.next;
			count--;
		}
		return data;
	}
}
