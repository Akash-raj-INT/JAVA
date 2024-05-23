import java.util.ArrayList;

class MyClass implements Comparable<MyClass> {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyClass other) {
        return Integer.compare(this.value, other.value);
    }

    public static void main(String[] args) {
        ArrayList<MyClass> myArrayList = new ArrayList<>();

        myArrayList.add(new MyClass(5));
        myArrayList.add(new MyClass(3));
        myArrayList.add(new MyClass(8));

        // Sort the ArrayList
        Collections.sort(myArrayList);

        System.out.println("Elements in ArrayList (sorted):");

        for (MyClass obj : myArrayList) {
            System.out.println(obj.getValue());
        }
    }
}
