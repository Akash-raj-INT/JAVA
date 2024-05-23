import java.util.LinkedList;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.add(70);
        
        int midIndex = obj.size() / 2;

        obj.remove(midIndex);

        System.out.println(obj);
    }
}
 