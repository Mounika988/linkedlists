import java.util.*;
public class pal{
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
      Node reve(Node mid){
         Node curr=mid;
         Node prev =null;
         Node next;
         Node right;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         right=prev;
         return right;
//It is used to point to last node
      }
      void display(Node head){
         Node temp=head;
         while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
         }
      }
      public Node mid(){
         Node slow=head;
         Node fast=head;
         while(fast!=null&&fast.next!=null){
slow=slow.next;
fast=fast.next.next;
         }
         return slow;
      }
      public boolean palindrome(){
         Node mid=mid();
      Node right=reve(mid);
      Node left =head;
      while(right.next!=null){
         if(left.data!=right.data){
            return false;
         }
         right=right.next;
         left=left.next;
      }
      return true;
      }
      public static void main(String[] args){
         pal ll=new pal ();
         ll.adl(1);
         ll.adl(2);
         ll.adl(1);
         if(ll.palindrome()){
System.out.println("It is a palindrome");
         }
         else{
            System.out.println("It is not a palindrome");  
         }
         
}
   }
