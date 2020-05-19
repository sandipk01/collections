package service;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        //Adding elements into list.
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(7);
        arrayList.add(78);

        System.out.println("Add element on by one :" + arrayList);

        //Adding element to specific element and right of elements shifted right side one position a head.
        arrayList.add(2, 150);
        System.out.println("Add at index : " + arrayList);

        //Adding all element of list into another list.
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(144);
        arrayList2.add(14);
        arrayList2.add(74);
        arrayList2.add(23);

        System.out.println("list to elements: " + arrayList2);

        arrayList.addAll(arrayList2);
        System.out.println("Add all list 2 elements into list : " + arrayList);

        //Clear all elements from the arrayList.
        arrayList2.clear();
        System.out.println("list 2" + arrayList2);

        //Create the same copy or clone same copy of the arraylist object.
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(111);
        arrayList3.add(222);
        arrayList3.add(333);

        System.out.println("original arrayList 3: " + arrayList3);

        List<Integer> arrayListClone = (List<Integer>) arrayList3.clone();

        System.out.println("cloned arrayList 3: " + arrayListClone);

        //Check if element is present in the list or not ?
        boolean isPresent = arrayList3.contains(222);
        System.out.println("is element is present in arrayList: " + isPresent);

        //Get element from particular index.
        int data = arrayList3.get(2);
        System.out.println("get the data from list 3 at index 2: " + data);

        //Get index number from particular object.
        int indexOf = arrayList3.indexOf(222);
        System.out.println("get index of 222 from list 3: " + indexOf);

        //Remove element from particular list at particular index.
        arrayList3.remove(2);
        System.out.println("After removing element from list 3:" + arrayList3);

        //Update element at given index.
        arrayList3.add(444);
        arrayList3.add(555);
        arrayList3.add(666);
        arrayList3.add(777);
        arrayList3.add(888);
        System.out.println("before updating list 3: " + arrayList3);
        arrayList3.set(3, 7845);
        System.out.println("After updating list 3: " + arrayList3);

        //Getting the total size of a arrayList.
        System.out.println("list 3 size: " + arrayList3.size());

        //Check if the list is empty or not.
        System.out.println("list 3 is empty?: " + arrayList3.isEmpty());
    }

}
