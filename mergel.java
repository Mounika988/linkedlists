import java.util.*;
public class mergel{
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
      Node sortm(Node head1,Node head2){
         Node a=head1;
         Node b=head2;
         Node result=null;
         if(a==null){
            return b;
         }
         if(b==null){
            return a;
         }
         if(a.data<=b.data){
            result=a;
            result.next=sortm(a.next,b);
         }
         else{
            result=b;
            result.next=sortm(b.next,a);
         }
         return result;
      }
      Node mergek(Node arr[],int k)
      {
         while(k!=0){
            System.out.println("k is"+k);
            int i=0,j=k;
            System.out.println("imm is"+i+"jmm is"+j);
            while(i<j){
               System.out.println("i is"+i+"j is"+j);
               arr[i]=sortm(arr[i],arr[j]);
               i++;
               //System.out.println("i is"+i);
               j--;
               if(i>=j)
               {
                  //System.out.println("k is"+j);
                  k=j;
               }
            }
         }
         return arr[0];
      }
      public static void main(String[] args){
         mergel ll=new mergel();
         int k,N;
         k=3;
         N=4;
         Node arr[]=new Node[k];
        arr[0]=new Node(1);
        arr[0].next=new Node(3);
        arr[0].next.next=new Node(4);
        arr[0].next.next.next=new Node(5);

        arr[1]=new Node(0);
        arr[1].next=new Node(7);
        arr[1].next.next=new Node(11);
        arr[1].next.next.next=new Node(13);

        arr[2]=new Node(-1);
        arr[2].next=new Node(8);
        arr[2].next.next=new Node(17);
        arr[2].next.next.next=new Node(21);

         /*arr[3]=new Node(-3);
        arr[3].next=new Node(6);
        arr[3].next.next=new Node(15);
        arr[3].next.next.next=new Node(18);*/
       Node head=ll. mergek(arr,k-1);
         ll.display(head);

         
         
}
   }

