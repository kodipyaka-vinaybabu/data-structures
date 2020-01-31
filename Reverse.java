
import java.util.*;


public class Reverse {
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
	public void reverse(Node head) {
    	if(head==null) {
    		return ;
    	}
    	reverse(head.next);
    	System.out.println(head.data);
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
    	Reverse r=new Reverse();
    	Scanner sc=new Scanner(System.in);
    	do
    	{
    		System.out.println("enter the elment:");
    		ele=sc.nextInt();
    		r.insert(ele);
    		System.out.println("do you want to continue(1 0r 0)");
    		ch=sc.nextInt();
    	}while(ch==1);
    	System.out.println("before reversing!");
    	r.traverse();
    	System.out.println("after reversing!");
    	r.reverse(head);;
    	
    	
    	
    		
    	}
    		
    
    	
    

}
