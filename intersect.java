import java.util.*;
public class intersect{
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
  
   Node inter(Node head1,Node head2){
      while(head2!=null){
      Node temp=head1;
      while(temp!=null){
         if(temp==head2){
            return temp;
         }
         temp=temp.next;
      }
      head2=head2.next;
   }
      return null;
   }
   void adl(int a){
      Node nn;
      nn=new Node(a);
      if(head==null){
         head=tail=nn;
      }
      tail.next=nn;
      tail=nn;
   }
  
   void display(Node head){
      Node temp=head;
      while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
      }
   }
   
   public static void main(String[] args){
      intersect ll=new intersect();
      Node head1,head2;
      head1=new Node(10);
      head2=new Node(3);
      Node nn=new Node(6);
      head2.next=nn;
      nn=new Node(9);
      head2.next.next=nn;
      nn=new Node(34);
      head1.next=nn;
      head2.next.next.next=nn;
      nn=new Node(20);
      head1.next.next=nn;
      head1.next.next.next=null;
      Node temp=ll.inter(head1,head2);
      System.out.println(temp.data);
     ll.display(head);
}
}
