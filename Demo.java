import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class List{
	private Node first;

	public void add(int data){
		Node n1=new Node(data);
		//find the last node
		if(isEmpty()){
			first=n1;
		}else{
			Node lastNode=first;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=n1;
		}

	}
	public void add(int index, int data){
		
	}
	public void remove(int index){
		//	
	}


	public int get(int index){
		//
		return -1;
	}
	public void printList(){
		System.out.print("[");
		Node temp=first;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(isEmpty() ?"empty]":"\b\b]");
	}
	public int size(){
		Node temp=first;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public boolean isEmpty(){
		return first==null;
	}
	public void clear(){
		first=null;
	}
	public int search(int data){
		Node temp=first;
		int index=0;
		while(temp!=null){
			if(temp.data==data){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public int[] toArray(){
		int[] tempDataArray=new int[size()];
		Node temp=first;
		for (int i = 0; i < tempDataArray.length; i++)	{
			tempDataArray[i]=temp.data;
			temp=temp.next;
		}
		return tempDataArray;
	}
}



class Demo{
	public static void main(String args[]){
		List intList=new List();
		intList.add(100); //add(data)-->Insertion order[Queue]
		intList.add(200);
		intList.add(300);
		intList.add(400);
		intList.add(500);
		intList.printList();//[100, 200, 300, 400, 500]
		
		intList.add(2,250);//[100, 200, 250, 300, 400, 500]
	}
}
