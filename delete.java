import java.util.*;
public class delete {
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
	public Node min(Node k)
	{
		if(k.left==null)
		
			return k;
		
		else
			return min(k.left);
	}
	public Node delete(Node k,int ele)
	{
		if(k.data>ele)
		{
			k.left=delete(k.left,ele);
			
		}
		else if(k.data<ele)
		{
			k.right=delete(k.right,ele);
		
		}
		else
		{
			if(k.right==null&&k.left==null)
			{
			
				return null;
			}
			else if(k.left==null)
			{
				k=k.right;
				return k;
			}
			else if(k.right==null)
			{
				k=k.left;
				return k;
			}
			else
			{
				Node k1=min(k.right);
				k.data=k1.data;
				k.right=delete(k.right,k1.data);
			}
		}
		return k;
	}
	public static void main(String[] args)
	{
		int ch,ele;
		delete b=new delete();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter the element:");
			ele=sc.nextInt();
			head=b.insert(ele,head);
			System.out.println("do you want to continue(1 or 0");
			ch=sc.nextInt();
		}while(ch==1);
		b.inorder(head);
		do {
			System.out.println("enter the element to delete:");
			ele=sc.nextInt();
			head=b.delete(head,ele);
			b.inorder(head);
			System.out.println("do you want to continue(1 or 0");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
