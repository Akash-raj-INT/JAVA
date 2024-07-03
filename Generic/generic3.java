interface A<T>{
    T fun( T a);
}

public class generic3 implements A<Integer> {
    public T fun(T a){
    System.out.println(a);
    return a;
    
}
public static void main(String[] args) {
    generic3<Integer> obj = new generic3<>();
    obj.fun(10);
    generic3<String> obj1 = new generic3<>();
    obj1.fun("Akash");

}
}
