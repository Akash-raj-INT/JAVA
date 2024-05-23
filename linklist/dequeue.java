import java.util.*;
public class dequeue {
    public static void main(String[] args){
    Deque<Integer> obj = new LinkedList<>();
    obj.add(10);
    obj.offer(20);
    obj.offer(30);
    obj.offer(40);
    System.out.println(obj);
    obj.remove(1);
    obj.poll();
    obj.equals(obj);
    System.out.println(obj);
    obj.addAll(obj);
   // obj.clear();
    obj.contains(obj);
    System.out.println(obj);
    

    }
}