import java.io.*;
public class Node
{
int data;
Node next;

public Node(int data,Node next)
{
this.data=data;
this.next=next;
}

public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("how many elements:");
int n=Integer.parseInt(br.readLine());
Node first=new Node(0,null);
Node curr=new Node(0,null);


for(int i=0;i<n;i++)
{
Node temp=new Node(0,null);
Node temp1=new Node(0,null);
System.out.println("Enter value:");
int val=Integer.parseInt(br.readLine());
temp.data=val;
temp.next=null;

  if(first.data==0)
  {   
   first.data=temp.data;
    first.next=curr;
   curr.next=temp1;

   }
else
  {   
 curr.data=temp.data;
    curr=curr.next;
    curr.next=temp1;
  }

}

System.out.print("linked list is as follows:");
for(Node ptr=first;ptr.data!=0;ptr=ptr.next)
{
System.out.print("-->"+ptr.data);
}
}
}