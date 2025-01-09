package queue;

public class Elements {
	int data;
	int priority;
	int order;
	
	public Elements() {
		data=priority=order=0;
		order++;
	}
	public Elements(int data,int priority,int order) {
		
		this.data=data;
		this.priority=priority;
		this.order=order;
		
	}
}











