import java.io.*;
import java.util.Scanner;
public class DoublyLinkedList{
	class Node{
	int data;
	Node previous;
	Node next;
	
	public Node(int data){
	this.data=data;
	}
	}
	Node head,tail=null;
	public void addNode(int data){
	Node newNode=new Node(data);
	if(head==null){
	head=tail=newNode;
	head.previous=null;
	tail.next=null;
	}
	else{
	tail.next=newNode;
	newNode.previous=tail;
	tail=newNode;
	tail.next=null;
	}
	}
	
	public void display(){
	Node current=head;
	if(head==null){
	System.out.println("List is empty");
	return;
	}
	System.out.println("Nodes of doubly Linked list:");
	while(current!=null){
	System.out.print(current.data+"" );
	current=current.next;
	}
	System.out.println("\n");
	}
	public void delete (int data){
	Node current=head;
	if(head==null){
	System.out.println("list is empty");
	return;
	}
	while(current!=null){
	if(current.data==data)
	break;
	current=current.next;
	}
	if(current==head){
	head=current.next.previous=null;
	}
	else{
	if(current.next==null){
	tail=current.previous;
	current.previous.next=null;
	}
	
	else{
	current.next.previous=current.previous;
	current.previous.next=current.next;
	}
	}
	}
	public static void main(String[] args) throws 
	NumberFormatException,IOException{
	int num,chr;
	DoublyLinkedList dList=new DoublyLinkedList();
	Scanner br=new Scanner(System.in);
	do{
		System.out.println("\n1.insert\n2.delete \n3.display\n4.exit\nenter choice:");
		chr=br.nextInt();
		switch(chr){
			case 1:
			{
			System.out.println("enter the integer to be inserted:");
			num=br.nextInt();
			dList.addNode(num);
			break;
			}
			case 2:
			{
			System.out.println("enter the integer to be  deleted:");
			num=br.nextInt();
			dList.delete(num);
			break;
			}
			case 3:
			dList.display();
			break;
			case 4:
			{
			System.out.println("Exiting");
			System.exit(0);
			}
			default:{
			System.out.println("wrong choice");
			break;
			}
			}
			}while(true);
			}
			}
