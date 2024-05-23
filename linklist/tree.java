import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {  
        TreeSet<Integer> obj = new TreeSet<>();
        obj.add(10);
        obj.add(20);
        obj.add(15);
        // obj.pollFirst();
        // obj.pollLast();
        obj.clone();
        System.out.println(obj);
    }
}

