import java.util.*;
public class bst {
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
	public static void main(String [] args) {
		int ch,ele;
		bst b=new bst();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter the element:");
			ele=sc.nextInt();
			head=b.insert(ele,head);
			System.out.println("do you want to continue(1 or 0");
			ch=sc.nextInt();
		}while(ch==1);
		b.inorder(head);
	}

}
