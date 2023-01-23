import java.util.*;
public class ass1{
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
      void display(Node head){
         Node temp=head;
         while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
         }
      }
      void rmv(int m,int n){
         Node temp=head;
         int i=1;
         int j=0;
         int k=0;
      for(k=0;k<=size;k++){
        // while(temp!=null)
         //{
            j=0;
            if(k==0)
            {
               i=1;
            }
            else{
               i=0;
            }

         while(i<m && temp!=null )
      {
            temp=temp.next;
            i++;
         }
         Node temp2=temp;
         while(j<n&& temp2!=null && temp2.next!=null){
            temp2.next=temp.next.next;
            j++;
         }
      }
      }
      public static void main(String[] args){
         ass1 ll=new ass1();
         ll.adl(1);
         ll.adl(2);
         ll.adl(3);
         ll.adl(4);
         ll.adl(5);
         ll.adl(6);
         ll.adl(7);
         ll.adl(8);
         ll.adl(9);
         ll.adl(10);
         ll.rmv(3,2);
         ll.display(head);

         
         
}
   }

