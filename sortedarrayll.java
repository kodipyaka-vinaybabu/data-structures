import java.util.*;
public class sortedarrayll {
	static Node head=null;
	public static Node insert(int ele,Node head)
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
	public static void inorder(Node head)
	{
		if(head!=null)
		{
			inorder(head.left);
			System.out.println(head.data);
			inorder(head.right);
		}
	}
	public static void convertArrayToLl(int arr[],int n) {
		//sortedarrayll s=new sortedarrayll();
		for(int i=0;i<n;i++) {
			//System.out.println(arr[i]);
			head=insert(arr[i], head);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter no of elements of array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the elment");
			arr[i]=sc.nextInt();
		}
		convertArrayToLl(arr,n);
		
		System.out.println("inorder traversal are :");
		inorder(head);
				
	}

}
