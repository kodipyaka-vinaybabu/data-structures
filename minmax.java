import java.util.*;
public class minmax {
	static Node head=null;
	public Node insert(int ele,Node head)
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
			head.right=insert(ele,head.right);
		}
		else if(head.data>ele)
		{
			head.left=insert(ele,head.left);
		}
		return head;
	}
	public void inorder(Node head)
	{
		if(head!=null)
		{
			inorder(head.left);
			System.out.println(head.data);
			inorder(head.right);
		}
	}
	public Node min() {
		Node temp=head;
		while(temp.left!=null)
		{
			temp=temp.left;
			
		}
		return temp;
		
	}
	public Node max() {
		Node temp=head;
		while(temp.right!=null)
		{
			temp=temp.right;
			
		}
		return temp;
		
	}
	public static void main(String [] args) {
		int ch,ele;Node temp1;
		minmax b=new minmax();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter the element:");
			ele=sc.nextInt();
			head=b.insert(ele,head);
			System.out.println("do you want to continue(1 or 0");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("inorder traversal:");
		b.inorder(head);
		temp1=b.min();
		System.out.println("minimmum element is" +(temp1.data));
		temp1=b.max();
		System.out.println("maximmum element is:" +(temp1.data));
		
	}


}
