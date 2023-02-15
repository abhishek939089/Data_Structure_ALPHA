import java.util.Deque;
import java.util.LinkedList;
public class Implement_QueueUsingDeque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }
        
        public int peek() {
            return deque.getFirst();
        }
    }
    public static void main(String args[]) {
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println("peek = "+ s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}
