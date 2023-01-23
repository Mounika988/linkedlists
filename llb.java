import java.util.*;
public class llb{
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
   void display(Node head){
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
         head=tail=nn;
      }
      else{
         nn.next=head;
         head=nn;
      }
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
   void mid(Node head,int key){
      Node nn=new Node(key);
      Node temp=head;
      int p;
       p=(size%2==0)?(int)(size+1/2):(int)size/2;
       int i=0;
       if (p==0){
         adf(key);
       }
       else{
       while(i<p-1){
         temp=temp.next; 
         i++;
       }
       nn.next=temp.next;
       temp.next=nn;
      }
   }
   void arf(){
      if(head==null){
       System.out.println("there is no element in the list");
      }
      else{
         head=head.next;
      }
   }
   void arl(){
      if(head==null){
       System.out.println("there is no element in the list");
      }
      else{
         Node temp=head;
         while(temp.next.next!=null){
            temp=temp.next;
         }
         temp.next=null;
         tail=temp;
      }
   }
   int search(int k)
   {
      Node temp=head;
      int i=0;
      while(temp!=null)
      {
         i=i+1;
         if(temp.data==k){
            return i;
         }
         temp=temp.next;
      }
      return -1;
   }
   //recursive approach
   int search2(int k,Node temp)
   {
      int i;
      if(temp==null){
         return -1;
      }
     if(temp.data==k)
     {
      return 0;
     }
     i=search2(k,temp.next);
     if(i==-1){
      return -1;
     }
     return i+1;

   }

   public static void main(String[] args){
llb ll=new llb();
ll.adf(1);
ll.adf(2);
ll.adf(3);
ll.adl(5);
ll.adl(6);
ll.adl(7);
ll.display(head);
System.out.println();
ll.mid(head,9);
ll.display(head);
ll.arf();
ll.arl();
System.out.println("after removing");
ll.display(head);
 System.out.println(ll.search2(100,head));
   }
}