public class ReverseLinkedList {
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
    public void recursivreverse(node current,node prev)
    {
        if(head==null)
        {
            return;
        }
        if(current.next==null)
        {
            head=current;
            current.next=prev;
            return;
        }
        node temp=current.next;
        current.next=prev;
        recursivreverse(temp,current);
    }
    public void reverseOrder()
    {
        if(head==null ||head.next==null)
        {
            return;
        }
        node prev=head;
        node current=head.next;
        while(current!=null)
        {
            node temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        head.next=null;
        head=prev;
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
        ReverseLinkedList rl=new ReverseLinkedList();
        rl.insertnode(5);
        rl.insertnode(6);
        rl.insertnode(7);
        rl.insertnode(8);
        rl.disply();
        // rl.reverseOrder();
        // rl.disply();
        rl.recursivreverse(rl.head, null);
        rl.disply();
    }
}