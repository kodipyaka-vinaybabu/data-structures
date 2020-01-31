import java.util.*;
public class convertLlToBst {
	static Node head1=null;
	static Node head=null;
	Node tail=null;
	public void insert(int ele) {
		Node n=new Node(ele);
	    n.next=null;
		if(head==null)
		{
			head=tail=n;
			return;
		}
		else
		{
			tail.next=n;
			tail=tail.next;
		}
		
		
	}
	public static Node insert1(int ele,Node head)
	{
		if(head==null)
		{
			head=new Node(ele);
			head.data=ele;
			head.left=null;
			head.right=null;
			return head;
		}
		else if(head.data<ele)
		{
			head.right=insert1(ele,head.right);
		}
		else if(head.data>ele)
		{
			head.left=insert1(ele,head.left);
		}
		return head;
	}
	public static void inorder(Node head)
	{
		if(head!=null)
		{
			inorder(head.left);
			System.out.println(head.data);
			inorder(head.right);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,ele;
		convertLlToBst b=new convertLlToBst();
		do
		{
			System.out.println("enter the element to ll:");
			ele=sc.nextInt();
			b.insert(ele);
			System.out.println("do ou want to continue(1 or 0):");
			ch=sc.nextInt();
		}while(ch==1);
		Node temp=head;
		while(temp!=null)
		{
			head1=b.insert1(temp.data, head1);
			temp=temp.next;
			
		}
		System.out.println("elements in the bst are:");
        b.inorder(head1);		
	}

}
