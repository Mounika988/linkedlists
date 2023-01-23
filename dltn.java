import java.util.*;
public class dltn{
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
   void dlt(int n){
      int p=size-n;
      Node temp=head;
      int i=0;
      while(i<p-1){
temp=temp.next;
i=i+1;
      }
      temp.next=temp.next.next;
   }
   void display(Node head){
      Node temp=head;
      while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
      }
   }
   
   public static void main(String[] args){
      dltn ll=new dltn();
      ll.adl(1);
      ll.adl(2);
      ll.adl(1);
      ll.adl(3);
      ll.adl(2);
      ll.adl(1);
      ll.dlt(3);
      ll.display(head);
}
}
