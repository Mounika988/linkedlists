import java.util.*;
public class zigzag{
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
      void zigzagi(Node head){
Node mid=mid();
Node righth=reve(mid);
Node left=head;
while(righth!=null && left!=null){
Node leftn=left.next;
left.next=righth;
Node rightn=righth.next;
righth.next=leftn;
left=leftn;
righth=rightn;
}
      }
      public static void main(String[] args){
         zigzag ll=new zigzag();
          ll.adl(1);
          ll.adl(2);
          ll.adl(3);
          ll.adl(4);
          ll.adl(5);
          ll.zigzagi(head);
         ll.display(head);
        }
      }

