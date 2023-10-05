package StackAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr = -1;

    public  CustomStack(int size){
    this.data=new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println(" Stack is full !!");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int peek() throws Exception {
        if (isEmpty()){
            throw new Exception("Can't peek from empty stack !!");
        }
        return data[ptr];
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Can't pop from empty stack !!");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    private boolean isFull() {
        return  ptr== data.length-1;  //ptr is at last index
    }
    private boolean isEmpty() {
        return  ptr== -1; //ptr will not move
    }
}
class Main{
    public static void main(String[] args) throws Exception {
        CustomStack stack=new CustomStack(5);
        stack.push(34);
        stack.push(3);
        stack.push(30);
        stack.push(28);
        stack.push(23);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

