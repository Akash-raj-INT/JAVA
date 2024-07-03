interface A<T>{
    T fun( T a);
}

public class generic2 implements A<Integer> {
    public Integer fun(Integer a){
    System.out.println(a);
    return a;
    
}
public static void main(String[] args) {
    generic2 obj = new generic2();
    obj.fun(10);

}
}
