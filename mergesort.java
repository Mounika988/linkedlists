import java.util.*;
public class mergesort{
   public  class Node{
      int data;
      Node next;
       public Node(int data){
         this.data=data;
         this.next=null;
      }
   }
   public   Node head;
     private Node mid(Node head){
      Node slow=head;
      Node fast=head.next;
      while(fast!=null&&fast.next!=null){
slow=slow.next;
fast=fast.next.next;
      }
      return slow;
   }
   private  Node merge(Node head1,Node head2){
      Node mergell=new Node(-1);
      Node temp=mergell;
      while(head1!=null && head2!=null){
         if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
         }
         else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
         }
      }
      while(head1!=null){
         temp.next=head1;
         head1=head1.next;
         temp=temp.next;
      }
      while(head2!=null){
         temp.next=head2;
         head2=head2.next;
         temp=temp.next;
      }
      return mergell.next;
   }
  public  Node merges(Node head){
      if(head==null || head.next==null){
return head;
      }
      Node mid=mid(head);
      Node righth=mid.next;
      mid.next=null;
    Node Nl= merges(head);
    Node NR= merges(righth);
    return merge(Nl,NR);
   }
   void display(){
      Node temp=head;
      while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
      }
   }
   void adf(int a){
      Node nn;
      nn=new Node(a);
      if(head==null){
         head=nn;
      }
      else{
         nn.next=head;
         head=nn;
      }
   }

public static void main(String[] args){
 mergesort ll=new mergesort();
  ll.adf(11);
  ll.adf(2);
  ll.adf(0);
  ll.adf(4);
  ll.adf(7);
  ll.head=ll.merges(ll.head);
 ll.display();
}
}