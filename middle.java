

import java.util.Scanner;

/*class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
*/
public class middle {
	static Node head=null;
	Node tail=null;
    public void insert(int ele) {
    	Node n=new Node(ele);
    	if(head==null) {
    		head=tail=n;
    	}
    	else {
    		tail.next=n;
    		tail=tail.next;
    	}
    }
    public void middlenode() {
    	Node temp1=head;
    	Node temp2=head;
    	while(temp2!=null&&temp2.next!=null) {
    		temp1=temp1.next;
    		temp2=temp2.next.next;
    		
    	}
    	System.out.println(temp1.data);
    }
    public void traverse() {
    	if(head!=null) {
    		Node temp=head;
    		while(temp!=null) {
    			System.out.print(temp.data+" ");
    			temp=temp.next;
    		}
    	}
    }
    public static void main(String[] args) {
    	int ch,ele;
    	middle m=new middle();
    	Scanner sc=new Scanner(System.in);
    	do
    	{
    		System.out.println("enter the elment:");
    		ele=sc.nextInt();
    		m.insert(ele);
    		System.out.println("do you want to continue(1 0r 0)");
    		ch=sc.nextInt();
    	}while(ch==1);
    	System.out.println("elements in list are:");
    	m.traverse();
    	System.out.println("middle element is");
    	m.middlenode();
    	
    	
    	
    	
    		
    	}
    		

}
