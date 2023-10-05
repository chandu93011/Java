package LinkedLst;

//Insert at first
//insert at end
//insert at any particular index

//Delete at first
//Delete at last
//Delete at index

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    public LL(Node head,Node tail){
        this.head=head;
        this.tail=tail;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){

            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size=size+1;
    }
    public void insertAtEnd(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        node.next=null;
        size=size+1;

        if(tail==null)
            insertAtFirst(val);
    }
    public void insertAtIndex(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }if(index==size){
            insertAtEnd(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
            temp.next=node;

            size=size+1;
    }
    public int DeleteTheFirst(){
        int value =head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int DeleteTheLast(){
    if(size<=1){
        return DeleteTheFirst();
    }
    Node secondLast=get(size - 2);
       int value= tail.value;

        tail=secondLast;
        tail.next=null;
        size=size-1;

       return value;
    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index; i++) {
             node=node.next;
        }
        return node;
    }

    public int DeleteAtIndex(int index){
        if (index==0){
            return DeleteTheFirst();
        }
        if(index==size-1){
            return DeleteTheLast();
        }
        Node previous=get(index-1);
        int value= previous.next.value;

        previous.next=previous.next.next;

        return value;
    }
    public void DisplayLinkedList(){
        //we will not move head from it is  position until we modify the structure(some operation in it )ex:insert ,delete and etc .
        //SO WE WILL TAKE A TEMP VARIABLE WHICH WILL BE EQUAL TO HEAD AND WE WILL UPDATE IT FURTHER
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
}
class Main{
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);
        list.insertAtEnd(99);
        list.insertAtIndex(78,3);
        list.DisplayLinkedList();

        System.out.println(list.DeleteTheFirst());
        list.DisplayLinkedList();

        System.out.println(list.DeleteTheLast());
        list.DisplayLinkedList();

        System.out.println(list.DeleteAtIndex(2));
        list.DisplayLinkedList();
    }
}
