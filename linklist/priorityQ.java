import java.util.*;
public class priorityQ {
    public static void main(String[] args){
    PriorityQueue<Integer> obj = new PriorityQueue<>();
    obj.add(10);
    obj.offer(20);
    obj.offer(30);
    obj.offer(40);
    System.out.println(obj);
    obj.remove(1);
    obj.poll();
    obj.contains(obj);
    System.out.println(obj);

    }
}