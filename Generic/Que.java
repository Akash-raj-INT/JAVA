import java.util.Arrays;

class A<T> {
    T[] num;

    A(T[] num) {
        this.num = num;
    }

    void c() {
        System.out.println(Arrays.toString(num));
    }
}

public class Que {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        A<Integer> obj = new A<>(arr);
        obj.c();
    }
}