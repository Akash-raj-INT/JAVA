class A<M> {
    M a;
    void fun(M b){
        a=b;
        System.out.println(a);
    }
} 
public class generic {
    public static void main(String[] args) {
        A<Integer> obj = new A<>();
        obj.fun(10);
        A<String> obj2 = new A<>();
        obj2.fun("Hello");
        A<Float> obj4 = new A<>();
        obj4.fun(4.5F);
        A<Double> obj3 = new A<>();
        obj3.fun(4.34);
    
    }
}
