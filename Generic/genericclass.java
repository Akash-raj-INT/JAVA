interface A<T>{
    T fun( T a);
}

public class genericclass implements A {
    public object fun(object a){
    System.out.println(a);
    return a;
    
}
public static void main(String[] args) {
    genericclass obj = new genericclass();
    obj.fun(10);

}
}
