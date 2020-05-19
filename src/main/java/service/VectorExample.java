package service;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(6);
        vector.add(9);
        vector.add(10);
        vector.add(99);
        // Add and Remove elements in list
        vector.add(2, 8);
        vector.remove(4);
        System.out.println("Vector: " + vector);
        // Using addAll()
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(56);
        vector2.add(95);
        vector2.add(25);
        vector2.addAll(vector);
        // Using iterator to print elements in teacher list
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        // Using Stream to print elements
        System.out.println("\n using stream iterate elements");
        vector.stream().forEach(elements -> System.out.print(elements + ", "));
    }
}
