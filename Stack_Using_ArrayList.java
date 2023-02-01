import java.util.ArrayList;

public class Stack_Using_ArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        // isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek() or top()
        public static int peek(){
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
