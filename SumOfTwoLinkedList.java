public class SumOfTwoLinkedList {
    node head1;
    node head2;
    static class node
    {
        int data;
        node next;

        node(int val)
        {
            data=val;
            next=null;
        }
    }
    public int add(node h1,node h2)
    {
        node temp1=h1;
        int sum1=0;int maxPlaceVal1=100;
        while(temp1!=null)
        {
            sum1+=temp1.data*maxPlaceVal1;
            maxPlaceVal1=maxPlaceVal1/10;
            temp1=temp1.next;
        }
        int sum2=0;int maxPlaceVal2=100;
        node temp2=h2;
        while(temp2!=null)
        {
            sum2+=temp2.data*maxPlaceVal2;
            maxPlaceVal2=maxPlaceVal2/10;
            temp2=temp2.next;
        }
        int Fsum=sum1+sum2;
        return Fsum;
    }
    public void display(node newhead)
    {
        node temp=newhead;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        SumOfTwoLinkedList l=new SumOfTwoLinkedList();
        l.head1=new node(5);
        l.head1.next=new node(6);
        l.head1.next.next=new node(3);
        l.display(l.head1);
        l.head2=new node(8);
        l.head2.next=new node(4);
        l.head2.next.next=new node(2);
        l.display(l.head2);
        int sum=l.add(l.head1,l.head2);
        System.out.print(sum);
        
    }
}
