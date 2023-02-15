// import java.util.*;
import java.util.Stack;
public class Infix_To_Postfix {
    public static void main(String[] args) {
        String s="23+4-";
        Stack<Integer> st=new Stack <>();
        for(Character ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int x=ch-'0';
                st.push(x);
            }else if(ch=='+'){
                int a1=st.pop();
                int a2=st.pop();
                st.push(a2+a1);
            }else if(ch=='-'){
                int a1=st.pop();
                int a2=st.pop();
                st.push(a2-a1);
            }else if(ch=='*'){
                int a1=st.pop();
                int a2=st.pop();
                st.push(a2*a1);
            }else if(ch=='/'){
                int a1=st.pop();
                int a2=st.pop();
                st.push(a2/a1);
            }
            System.out.println(st);
        }
    }
}   