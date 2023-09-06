public class DeductTheCycle {
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
   public void makeCycle(int pos)
   {
    node temp=head;
    node cyclepoint=null;
    int count=1;
    while(temp.next!=null)
    {
        if(count==pos)
        {
            cyclepoint=temp;
        }
        temp=temp.next;
        count++;
    }
      temp.next=cyclepoint;
   }
   public boolean deductCycle()
   {
    node fast=head;
    node slow=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(fast==slow)
        {
            return true;
        }
    }
    return false;
   }
   public void RemoveCycle()
   {
    node fast=head;
    node slow=head;
    node remv;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(fast==slow)
        {
            fast.next=null;
        }
    }
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
   public static void main(String args[])
   {
    DeductTheCycle dc=new DeductTheCycle();
    dc.insertnode(1);
    dc.insertnode(2);
    dc.insertnode(3);
    dc.insertnode(4);
    dc.insertnode(5);
    dc.insertnode(6);
    dc.insertnode(7);
    dc.insertnode(8);
    dc.insertnode(9);
    dc.disply();
    dc.makeCycle(4);
    // dc.disply();
    System.out.println(dc.deductCycle());
    dc.RemoveCycle();
    System.out.println(dc.deductCycle());
    dc.disply();
   }
}
