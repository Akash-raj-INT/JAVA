
class A<T, U> {
    T a;
    U d;
    void fun(T b, U c) {
        a = b;
        d = c;
        System.out.println(a + " " + c);
    }
}

public class abcd {
    public static void main(String[] args) {
        A<Integer, String> obj1 = new A<Integer, String>();
        A<Integer, String> obj2 = new A<Integer, String>();

        obj1.fun(20, "hi");
        obj2.fun(10, "Akash");
    }
}