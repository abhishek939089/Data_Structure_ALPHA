// Using Stack
import java.util.Stack;
public class Next_Greater_Element {
    public static void main(String args[]){
        int arr[] = {6, 8, 0, 1, 3};
        // int arr[] = {6, 8, 0, 7, 1, 3};
        // int arr[] = {6, 8, 0, 2, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //1.  While
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();

            }
            // 2. If - else
            if(s.isEmpty()){
                nxtGreater[i] = -1;

            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            // 3. push in s
            s.push(i);

        }
        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+ " ");
        }
        System.out.println();

    }
}
// Next Greater Right
// Next Greater Left
// Next Smaller Right
// Next Smaller Left
// import java.util.*;

// public class Next_Greater_Element {
//     public static void print(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>();
//         int nxtGreat[] = new int[arr.length];

//         for(int i=arr.length-1; i>=0; i--) {
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 nxtGreat[i] = -1;
//             } else {
//                 nxtGreat[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }

//         print(nxtGreat);
//     }
// }
