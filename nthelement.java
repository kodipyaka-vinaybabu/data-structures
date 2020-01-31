

import java.util.Scanner;

public class nthelement {
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
	public int length()
    {
		int k;
		Node temp=head;
		k=0;
		while(temp!=null)
		{
			k++;
			temp=temp.next;
		}
    	return k;
    }
    public void nthElement(int k)
    {
    	
        Node temp=head;;
    	int c=length();
    	int c1=c-k+1;
    	for(int i=0;i<c1;i++)
    	{
    		temp=temp.next;
    	}
    	System.out.println(temp.data);
    }
    public static void main(String[] args) {
    	int ch,ele,k;
    	nthelement m=new nthelement();
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
    	System.out.println("enter the nth element position from end");
	    k=sc.nextInt();
	    
    	System.out.println("nth element from end is:");
    	m.nthElement(k);
    }

}
