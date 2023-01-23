import java.util.*;
public class doublell{
  public static class Node{
      int data;
      Node next;
      Node prev;
       public Node(int data){
         this.data=data;
         this.next=null;
         this.prev=null;
      }
   }
   public static Node head;
   public static Node tail; 
   void adf(int a){
      Node nn=new Node(a);
      if(head==null){
         head=tail=nn;
               }
               else{
      nn.next=head;
      nn.prev=null;
      head=nn;
               }
   }
   void display(Node head){
      Node temp=head;
      while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
      }
   }
   void adl(int a){
      Node nn=new Node(a);
      if(head==null){
         head=tail=nn;
      }
      else{
         tail.next=nn;
         nn.prev=tail;
         tail=nn;
      }
   }
   void arf(){
      if(head==null){
         System.out.println("There are no elements in the list");
      }
      else{
         head=head.next;
         head.prev=null;
      }
   }
   void arl(){
      if(head==null){
         System.out.println("There are no elements in the list");
      }
      else{
         Node temp=tail;
         tail.prev.next=null;
         temp=temp.prev;
      }
   }

   void rev(){
      Node temp=head;
      Node temp3=tail;
      Node temp2;
      while(temp!=null){
temp2=temp.next;
temp.next=temp.prev;
temp.prev=temp2;
temp=temp2;
      }
   tail=head;
   head=temp3; 

   }
   public static void main(String[] args){
      doublell ll=new doublell();
       ll.adl(1);
       ll.adl(2);
       ll.adl(3);
       ll.adl(4);
       ll.adl(5);
       ll.rev();
       ll.display(head);
       System.out.println("after removing:");
       ll.arf();
      ll.arl();
      ll.display(head);
     }
     }
