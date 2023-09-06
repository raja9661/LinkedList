class Demo
{

    node head;
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
    public  node IsNull(int val)
    {
        if(head==null)
            head=new node(val);
            return head;
    }
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("Sorry linkedlist is empty");
        }
        head=head.next;
    }
    public void deleteSpecificNode(int loc)
    {
        if(head==null)
        {
            System.out.println("Sorry linkedlist is empty"); 
        }
        if(loc==0)
        {
            deletefirst();
            return;
        }
        node temp=head;
        int j=1;
        while(j<loc)
        {
            temp=temp.next;
            j++;
        }
        temp.next=temp.next.next;
    }
    public void deleteAtEnd()
    {
        node temp=head;
        if(head==null)
        {
            System.out.println("Sorry linkedlist is empty");    
        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void insertAtBeginning(int val)
    {
        node newNode=new node(val);
        if(head==null)
        {
            head=IsNull(val);
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertAtSpecificLoc(int val,int loc)
    {
        node newNode=new node(val);
        if(head==null)
        {
            head=IsNull(val);
            return;
        }
        if(loc==0)
        {
            insertAtBeginning(val);
            return;
        }
        newNode.next=null;
        node temp=head;
        int i=1;
        while(i<loc)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void insertAtEnd(int val)
    {
        node newNode=new node(val);
        if(head==null)
        {
            head=IsNull(val);
            return;
        }
        newNode.next=null;
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
        Demo d=new Demo();
        System.out.println("inserting at end");
        d.insertAtEnd(4);
        d.insertAtEnd(8);
        d.insertAtEnd(12);
        d.insertAtEnd(16);
        d.disply();
        // System.out.println("after inserting in beginning");
        // d.insertAtBeginning(1);
        // d.disply();
        System.out.println("after inserting at specific location");
        d.insertAtSpecificLoc(70, 0);
        d.disply();
        // d.deletefirst();
        // System.out.println("after deleting head node");
        // d.disply();
        d.deleteSpecificNode(4);
        d.disply();
        d.deleteAtEnd();
        d.disply();
    }
}