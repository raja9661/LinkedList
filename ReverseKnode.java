class ReverseKNode {
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
    public node  ReverseKNode(node head,int k)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        node prev=null;
        node current=head;
        // node temp;
        int count=0;
        while(current!=null && count<2)
        {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
            count++;
        }
        if(temp!=null)
        {
            head.next=ReverseKNode(temp,k);
        }
        return prev;
    }
    // public void  ReverseKNode()
    // {
    //     node prev=null;
    //     node current=head;
    //     node temp;
    //     while(current!=null)
    //     {
    //         temp=current.next;
    //         current.next=prev;
    //         prev=current;
    //         current=temp;
    //     }
    //     head=prev;
    // }
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
        ReverseKNode rk=new ReverseKNode();
        rk.insertnode(1);
        rk.insertnode(2);
        rk.insertnode(3);
        rk.insertnode(4);
        rk.disply();
        int k=2;
        rk.head=rk.ReverseKNode(rk.head,k);
        rk.disply();
    }
 
}
 