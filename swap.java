import java.util.*;
public class swap{
  public static class Node{
      int data;
      Node next;
       public Node(int data){
         this.data=data;
         this.next=null;
         size++;
      }
   }
   public static Node head;
   public static Node tail; 
   public static int size; 
   void adl(int a){
      Node nn;
      nn=new Node(a);
      if(head==null){
         head=tail=nn;
      }
      tail.next=nn;
      tail=nn;
   }
  void swap1(int n1,int n2){
   Node temp0=head;
   Node temp00=head;
   Node temp1=head;
   Node temp11=head;
   Node temp2=head;
   Node temp22=head;
   while(temp0!=null)
   {
      if(temp0.data==n1){
temp1=temp00;
         temp11=temp0;
      }
      if(temp0.data==n2){
         temp2=temp00;
                  temp22=temp0;
               }
temp00=temp0;
temp0=temp0.next;
   }
   /*System.out.println(temp11.data);
   System.out.println(temp1.data);
   System.out.println(temp2.data);
   System.out.println(temp22.data);*/
   if(temp11==null|| temp22==null)
{
   return;
}
if(temp1!=null)
{
   temp1.next=temp22;

}
else{
   head=temp22;
}
if(temp2!=null){
   temp2.next=temp11;
}
else{
   head=temp11;
}
   
Node nxt1=temp11.next;
temp11.next=temp22.next;
   temp22.next=nxt1;
  }
   void display(Node head){
      Node temp=head;
      while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
      }
   }
   
   public static void main(String[] args){
      swap ll=new swap();
      ll.adl(1);
      ll.adl(2);
      ll.adl(3);
      ll.adl(4);
      ll.adl(5);
      ll.adl(6);
      ll.swap1(2,5);
     ll.display(head);
}
}
