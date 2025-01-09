package queue;

public class QueueArray {
int front; // first inserted element index
int rear; // last inserted element index
int Max;
int[] arr;

public QueueArray() {
	front=rear=-1;
	Max=10;
	arr=new int[Max];
}
public QueueArray(int Max) {
	front=rear=-1;
	this.Max=Max;
	arr=new int[Max];
}

boolean isEmpty()
{
	if(front==-1)
		return true;
	else
		return false;
	
}
boolean isFull()
{
	if(rear==Max-1)
		return true;
	else
		return false;
	
}
void enQueued(int value)
{
	if(isFull())
		System.out.println("queue is full");
	else
	{
		rear++;
		arr[rear]=value;
		if(isEmpty())  // first insertion
			front=0;
			
	}
}
int deQueued()
{
	int data=0;
	if(isEmpty())
		System.out.println("Queue is empty");
	else
		{
		data =arr[front];
		arr[front]=0;
		if(front==rear)  //single
			front=rear=-1;
		else
			front++;
		}
	return data;
}



int deQueuedEnd()
{
	int data=0;
	if(isEmpty())
		System.out.println("Queue is empty");
	else
		{
		data =arr[front];
		arr[front]=0;
		if(front==rear)  //single
			front=rear=-1;
		else
			front++;
		}
	return data;
}




int peek()
{
	int data=0;
	if(isEmpty())
		System.out.println("queue is empty");
	else
		{
		data =arr[front];
		}
	return data;
}
void display()
{
	if(isEmpty())
		System.out.println("queue is empty");
	else
	{
		for(int i=front;i<=rear;i++)
			System.out.println(arr[i]);
	}
}
}
