package oops;

import java.util.LinkedList;

public class JavaMain {

    public static void main(String[] args) {

        TraitInitialization.A obj = (var a, var b) -> a + b;

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);


        list.forEach(a -> System.out.println(a));
    }
}
