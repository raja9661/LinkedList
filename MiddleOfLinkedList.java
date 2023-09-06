public class MiddleOfLinkedList {
    node head;
    node temp;
   class node
   {
       int data;
       node next;

       node(int val)
       {
           data=val;
           next=null;
       }
   }
   public int middleNum()
   {
    node temp=head;
    int count=0;
    int mid;
    while(temp!=null)
    {
        temp=temp.next;
        count++;
    }

    mid=count/2+1;
    return mid;
   }
   public int midofList()
   {
    //  int mid=middleNum();
    //  System.out.println(mid);
    //  int start=1;
    //  node temp=head;
    //  while(start<mid)
    //  {
    //     temp=temp.next;
    //     start++;
    //  }
    //  int midVal=temp.data;
    //  return midVal;
    //two pointer approach
    node fast=head;
    node slow=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow.data;
   }
   public void insertnode(int val)
    {
        node newNode=new node(val);
        if(head==null)
        {
            head=new node(val);
            return;
        }
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void disply()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void main(String arge[])
    {
        MiddleOfLinkedList ml=new MiddleOfLinkedList();
        ml.insertnode(1);
        ml.insertnode(2);
        ml.insertnode(3);
        ml.insertnode(4);
        ml.insertnode(5);
        // ml.insertnode(6);
        // int m=ml.middleNum();
        // System.out.println(m);
        System.out.println(ml.midofList());


    }
    
}
