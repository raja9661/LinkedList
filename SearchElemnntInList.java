class SearchElemnntInList
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
    public void push(int val)
    {
        node newNode=new node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void search(int key)
    {
        node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
            System.out.print(temp.data+":Yes given Key is present in Linkedlist:)");
            }
            temp=temp.next;
        }
        System.out.println("");
    }
    public void removeDuplicate()
    {
        node temp=head;
        node temp2=head.next;
        while(temp!=null)
        {
            if(temp.data==temp2.data)
            {
                temp.next=temp2.next;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
    }
    public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        SearchElemnntInList sl=new SearchElemnntInList();
        sl.push(2);
        sl.push(4);
        sl.push(8);
        sl.push(8);
        sl.display();
        sl.search(8);
        sl.removeDuplicate();
        sl.display();
    }
}