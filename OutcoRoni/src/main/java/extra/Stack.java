package extra;

/**
 * Created by ronim_000 on 10/26/2019.
 */
public class Stack {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
        this.data = data;
    }
}

   public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(4);
       stack.push(10);
       stack.push(7);
       stack.print();
       stack.pop();
       stack.print();
       stack.push(-19);
       stack.push(0);
       stack.print();
       System.out.println(stack.peek());
       stack.print();
       stack.pop();
       stack.print();
   }
    private Node top;

    public boolean isEmpty(){
        return top==null;
    }

    public int peek() throws NullPointerException{
        if (top==null){
            throw new NullPointerException("Nothing to peek : stack is empty");
        }
        return top.data;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if (top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    public int pop() throws NullPointerException{
        if (top==null){
            throw new NullPointerException("Nothing to pop : stack is empty");
        }
        int data=top.data;
        top=top.next;
        return data;
    }

    public int size(){
        int count=0;
        Node current =top;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void print(){
        Node current =top;
        while (current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println("");
    }

}
