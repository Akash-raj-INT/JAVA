import java.util.LinkedList;
import java.util.Scanner;

public class dynamiclink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> obj = new LinkedList<>();

        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            obj.add(element);
        }

        int midIndex = obj.size() / 2;
        obj.remove(midIndex);

        System.out.println(obj);
    }
}
 {
    
}
