import java.util.Stack;

public class StackLL<E> {

    class Node<E>
    {
        E data;
        Node next;

        //constructor
        Node(E data)
        {
            this.data=data;
            next=null;
        }
    }

    Node head=null,top=null;

    boolean isEmpty()
    {
        return head==null;
    }

    void push(E data)
    {
        Node<E> n=new Node<E>(data);
        if(isEmpty())
        {
            head=n;
            top=n;
        }else{
            top.next=n;
            top=n;
        }
    }

    void pop()
    {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        if(head.next==null) {
            head = top = null;
            return;
        }
        Node<E> tmp=head;
        while(tmp.next.next==null)
            tmp=tmp.next;
        top=tmp;
        tmp.next=null;
    }

    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data);
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        Node<E> tmp=head;
        while(tmp!=null)
        {
            System.out.print(tmp.data+"--->");
            tmp=tmp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        StackLL ob=new StackLL();
//        ob.pop();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.display();
//        ob.peek();
    }

}
