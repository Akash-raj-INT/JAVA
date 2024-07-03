// class A<T extends Number> {
//     T a;
//     void fun (T b){
//     a=b;
//     System.out.println(a);
//     }
// } 

// public class Bounded {
//     public static void main(String[] args) {
//         A<Integer> obj = new A<>();
//         obj.fun(10);
//         A<Float> obj2 = new A<>();
//         obj2.fun(21.0F);
//     }
// }

import java.util.*;
import java.util.Scanner;
class  Bounded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.equals("file.txt")){
            System.out.println("abcd");
        } else if(str.equals("file2.txt")){
            System.out.println("defgh");
        } 

    }

}