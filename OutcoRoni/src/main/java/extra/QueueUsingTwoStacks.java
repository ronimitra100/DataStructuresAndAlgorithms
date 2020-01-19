package extra;

/**
 * Created by ronim_000 on 10/26/2019.
 */
public class QueueUsingTwoStacks {
    private Stack newestOnTop = new Stack();
    private Stack oldestOnTop = new Stack();

    public static void main(String[] args){
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println("");
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println("");
        q.enqueue(10);
        q.enqueue(11);
        System.out.println(q.peek());

    }

    public void enqueue(int data){
       newestOnTop.push(data);
    }

    public int dequeue(){
       if (oldestOnTop.isEmpty()){
           shiftStacks();
       }
       return oldestOnTop.pop();
    }

    public int peek(){
        if (oldestOnTop.isEmpty()){
            shiftStacks();
        }
        return oldestOnTop.peek();
    }

    public void shiftStacks(){
        if (oldestOnTop.isEmpty()){
            while(!newestOnTop.isEmpty()){
                oldestOnTop.push(newestOnTop.pop());
            }
        }
    }
}
