package com.cdac.list.dlist;

public class DNode {
	int data;
	DNode prev;
	DNode next;
	
	public DNode() {
		data=0;
		prev=next=null;
	}
	public DNode(int data) {
		this.data=data;
		prev=next=null;
	}
}
