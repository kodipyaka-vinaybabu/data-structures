

import java.util.Scanner;

public class loopdetect {
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
    public static void loopDetect() {
    	Node temp1=head;
    	Node temp2=head;
    	while(temp1!=null && temp2 !=null &&temp2.next!=null )
    	{
    		temp1=temp1.next;
    		temp2=temp2.next.next;
    		if(temp1==temp2)
    		{
    			System.out.println("there is a loop ");
    			return;
    		}
    	}
    	System.out.println("no loop");
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
    	loopdetect m=new loopdetect();
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
    	//System.out.println("middle element is");
    	m.loopDetect();
    	
    	
    	
    	
    		
    	}

}
