package LinkedLst;

public class CircularLL {

    private Node head;
     private int size;
     private Node tail;

    public CircularLL(Node head) {
        this.head = head;
    }

    public CircularLL(int size) {
        this.size = 0;
    }

    public CircularLL() {

    }

    private class Node{
        private int value;
        private Node next;

        public Node(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    public void Insert(int value){

        Node node =new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void Delete(int value){
      Node node =head;
      if(node == null)
          return;
      if(node.value==value){
          head=head.next;
          tail.next=head;
          return;
      }
      do {
          Node n=node.next;
          if(n.value==value){
              node.next=n.next;
              break;
          }
          node=node.next;
      }while (node!=head);
    }

    public void Display(){
        Node node=head;
        if (head!=null) {


            do {
                System.out.print(node.value + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }
    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.Insert(65);
        list.Insert(75);
        list.Insert(85);
        list.Insert(95);
        list.Insert(55);
        list.Delete(85);
        list.Display();
    }
}
