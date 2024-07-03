import java.util.*;
class Animal{
     void eat(){
        System.out.println("Animal is eating");
}
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat is eating");
    }
}
class Rat extends Animal{
    void eat(){
        System.out.println("Rat is eating");
    }
}
public class wildCard{
    public static void feed(List<? extends Animal>list) {
        for(Animal i:list){
            i.eat();
        }
    }
    public static void main(String[] args) {
        List<Animal> list1=new ArrayList<>();
        list1.add(new Animal());
        list1.add(new Animal());

        ArrayList<Dog> list2=new ArrayList<>();
        list2.add(new Dog());
        list2.add(new Dog());

        ArrayList<Cat> list3=new ArrayList<>();
        list3.add(new Cat());
        list3.add(new Cat());

        ArrayList<Rat> list4=new ArrayList<>();
        list4.add(new Rat());
        list4.add(new Rat());

        feed(list1);
        feed(list2);
        feed(list3);
        feed(list4);
}}