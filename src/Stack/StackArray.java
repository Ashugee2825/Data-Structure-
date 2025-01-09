package Stack;

public class StackArray {
	int Max;
	int top;
	E arr[];
	
	StackArray<E>()
	{
		Max=10;
		top=-1;
		arr=new E[Max];
		
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
	
	Void Push(int value) {
		if(isFull())
			System.err.println("Stack is Full");
		else {
			top++;
			arr[top]=value;
		}
		
	}
	int pop()
	{
		int data =0;
		if(isEmpty())
			System.out.println("Stack is Empty");
		else
		{
			data = arr[top];
			arr[top]=0;
			top--;
			
		}
		return data;
	}
int peek()
{
	int data =0;
	if(isEmpty())
		System.out.println("Satack is Empty");
	else
	{
		data = arr[top];
	}
	return data;
}
}
