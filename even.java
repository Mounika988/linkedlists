import java.util.*;
public class even{
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
   Node evene(){
      Node temp=head;
      Node es=null;
      Node ee=null;
      Node os=null;
      Node oe=null;
      while(temp!=null){

         if(temp.data%2==0){
            if(es==null)
            {
            es=temp;
            ee=temp;
            }
            else{
               ee.next=temp;
               ee=ee.next;
            }
         }
         else{
   
            if(os==null)
            {
            os=temp;
            oe=temp;
            }
            else{
               oe.next=temp;
               oe=oe.next;
            }
         }
         temp=temp.next;
         }
         if(oe!=null){
            oe.next=null;
         }
          if(es!=null&& os!=null){
            ee.next=os;
         }
         if(es==null){
            es=oe;
         }
          if(os==null){
            ee.next=null;
         }
         return es;
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
      even ll=new even();
      ll.adl(8);
      ll.adl(2);
      ll.adl(10);
      ll.adl(5);
      ll.adl(4);
      ll.adl(1);
      ll.adl(6);
     Node temp= ll.evene();
     ll.display(temp);
    // ll.display(head);
}
}
