import java.util.*;
public class loop{
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
   boolean dloop(Node head){
 Node slow=head;
 Node fast=head;
 while(fast!=null && fast.next!=null){
 slow=slow.next;
 fast=fast.next.next;
 if(fast==slow)
 {
   return true;
   
 }
 }
 return false;
   }
   void rmvloop(Node head){
      Node slow=head;
 Node fast=head;
 Node prev=head;
 while(slow!=fast){
   prev=fast;
   slow=slow.next;
   fast=fast.next;
 }
 prev.next=null;
   }
   void display(Node head){
      Node temp=head;
      while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
      }
   }
   
   public static void main(String[] args){
      loop ll=new loop();
      head=new Node(1);
     Node temp=new Node(2);
     head.next=temp;
      head.next.next=new Node(3);
      head.next.next.next=temp;
      if(ll.dloop(head)){
         System.out.println("loop exists");
         ll.rmvloop(head); 
         ll.display(head);
         System.out.println(ll.dloop(head));
      }
      else{
         System.out.println("loop does not exist");
      }
}
}
