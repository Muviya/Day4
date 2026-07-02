import java.util.*;
public class Hashset{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Input String:");
       String str = sc.next();
       Set<Character> set = new LinkedHashSet<>();
       for(int i=0;i<str.length();i++){
           set.add(str.charAt(i));
       }
       System.out.print(set);
    }
}