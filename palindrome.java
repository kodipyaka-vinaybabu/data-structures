

import java.util.Scanner;

public class palindrome {
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
	public void traverse() {
    	if(head!=null) {
    		Node temp=head;
    		while(temp!=null) {
    			System.out.print(temp.data+" ");
    			temp=temp.next;
    		}
    	}
    }
	 public static void isPalindrome()
	    {
	    	Node temp1=head;
	    	Node temp=head;
	    	while(temp.next!=null)
	    	{
	    		temp=temp.next;
	    	}
	    	
	    	Node last=temp;
	    	System.out.println(last.data);
	    	while(temp1!=null )
	    	{
	    		if(temp1.data==last.data) {
	    			temp1=temp1.next;
	    			temp=head;
	    			if(temp1==null)
	    			{
	    				System.out.println("given linked list is a palindrome");
	    				return;
	    			}
	    			while(temp.next!=last)
	    			{
	    				temp=temp.next;
	    			}
	    			last=temp;
	    		}
	    		else
	    		{
	    			System.out.println("given linkedlist is not PALINDROME");
	    			return;
	    		}
	    		
	    	}
	    	
	    }
	 public static void main(String[] args) {
	    	int ch,ele,k;
	    	palindrome m=new palindrome();
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
	    	m.isPalindrome();
	 }

}
