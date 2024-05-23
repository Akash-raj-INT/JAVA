import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dymap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();


        System.out.println("Enter the number of key-value pairs:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter key:");
            String key = scanner.nextLine();
            System.out.println("Enter value:");
            int value = scanner.nextInt();
            scanner.nextLine();
            hashMap.put(key, value);
        }


        System.out.println("Enter the key to search:");
        String searchKey = scanner.nextLine();

        boolean found = false;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey().equals(searchKey)) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Key not found!");
        }

        scanner.close();
    }
}

