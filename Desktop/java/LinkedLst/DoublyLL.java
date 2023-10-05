package LinkedLst;

public class DoublyLL {
    private Node head;
    private Node size;
    public DoublyLL(){
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next,Node prev){
            this.next=next;
            this.prev=prev;
            this.value=value;
        }
    }
    public void InsertAtFirst(int value){
        Node node=new Node(value);
        if(head!=null){
            head.prev=node;
        }
        node.next=head;
        node.prev=null;
        head=node;

    }
    public void Display(){
        Node Temp=head;
        Node last=null;
        while(Temp!=null){
            System.out.print(Temp.value+" -> ");
            last=Temp;
            Temp=Temp.next;
        }
        System.out.println("End");
        System.out.println("Print in reverse order");
        while (last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("Start");
    }
    public void InsertAtEnd(int value){
        Node node=new Node(value);
        Node last=head;
        if(head==null){
            head=node;
            node.prev=null;
            node.next=null;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        node.next=null;
    }

    //to insert at particular index same code will be as in the singly linked list


    //WE will do some new  things here we want to add the new node after the particular node

    public Node find(int value){
        Node node =head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insertAtIndex(int after, int value){
        Node p=find(after);
        if(p==null){
            System.out.println("Item is not available in he linked list");
            return;
        }
        Node node=new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.InsertAtFirst(10);
        list.InsertAtFirst(11);
        list.InsertAtFirst(13);
        list.InsertAtFirst(16);
        list.InsertAtFirst(18);
        list.InsertAtEnd(22);
        list.insertAtIndex(13,56);
        list.Display();

    }
}
