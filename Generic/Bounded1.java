
class A<T extends Number> {
    T a;
    void fun (T b){
    a=b;
    System.out.println(a.doubleValue()+ a.doubleValue());
    }
} 

public class Bounded1 {
    public static void main(String[] args) {
        A<Integer> obj = new A<>();
        obj.fun(10);
        A<Float> obj2 = new A<>();
        obj2.fun(21.0F);
    }
}
