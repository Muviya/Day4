import java.util.*;
public class stack{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Insertion:"+s);
        s.pop();
        System.out.println("Popped:"+s);
        System.out.println("Peek element;"+s.peek());
        System.out.println("Size of the stack:"+s.size());
        System.out.println("Is Empty?:"+s.isEmpty());
    }
}