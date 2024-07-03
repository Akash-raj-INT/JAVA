import java.util.ArrayList;
import java.util.List;
class A<T>{
    T a;
    void fun(T b)
    {
        a=b;
        System.out.println(a);
    }
}
public class MutiParaGen {
    public static void main(String[] args) {
        A<Integer> obj1 = new A<Integer>();
        A<String> obj2 = new A<String>();
        obj1.fun(20);
        obj2.fun("hello");
    }
}

