import java.util.Scanner;
import java.util.*;
public class deQ {
    public static void main(String[] args) {
        
    
    Scanner scanner=new Scanner(System.in);
    Deque<Integer> obj = new LinkedList<>();
     
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
        int element = scanner.nextInt();
        obj.add(element);
}
System.out.println(obj);
}
}