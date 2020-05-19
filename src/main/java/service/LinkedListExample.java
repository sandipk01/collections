package service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        //Adding elements into list.
        linkedList.add(5);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(7);
        linkedList.add(78);

        System.out.println("Add element on by one :" + linkedList);

        //Adding element to specific element and right of elements shifted right side one position a head.
        linkedList.add(2, 150);
        System.out.println("Add at index : " + linkedList);

        //Adding all element of list into another list.
        List<Integer> linkedList2 = new ArrayList<>();
        linkedList2.add(144);
        linkedList2.add(14);
        linkedList2.add(74);
        linkedList2.add(23);

        System.out.println("list to elements: " + linkedList2);

        linkedList.addAll(linkedList2);
        System.out.println("Add all list 2 elements into list : " + linkedList);

        //Clear all elements from the linkedList.
        linkedList2.clear();
        System.out.println("list 2" + linkedList2);

        //Create the same copy or clone same copy of the linkedList object.
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(111);
        linkedList3.add(222);
        linkedList3.add(333);

        System.out.println("original linkedList 3: " + linkedList3);

        List<Integer> arrayListClone = (List<Integer>) linkedList3.clone();

        System.out.println("cloned linkedList 3: " + arrayListClone);

        //Check if element is present in the list or not ?
        boolean isPresent = linkedList3.contains(222);
        System.out.println("is element is present in linkedList: " + isPresent);

        //Get element from particular index.
        int data = linkedList3.get(2);
        System.out.println("get the data from list 3 at index 2: " + data);

        //Get index number from particular object.
        int indexOf = linkedList3.indexOf(222);
        System.out.println("get index of 222 from list 3: " + indexOf);

        //Remove element from particular list at particular index.
        linkedList3.remove(2);
        System.out.println("After removing element from list 3:" + linkedList3);


        //Update element at given index.
        linkedList3.add(444);
        linkedList3.add(555);
        linkedList3.add(666);
        linkedList3.add(777);
        linkedList3.add(888);
        System.out.println("before updating list 3: " + linkedList3);
        linkedList3.set(3, 7845);
        System.out.println("After updating list 3: " + linkedList3);


        //Adding element at first position
        linkedList3.addFirst(65656);
        System.out.println("After adding at first index" + linkedList3);

        //Adding element at last position
        linkedList3.addLast(121212);
        System.out.println("After adding at last index" + linkedList3);


        //Getting the total size of a likedList.
        System.out.println("list 3 size: " + linkedList3.size());

        //Check if the list is empty or not.
        System.out.println("list 3 is empty?: " + linkedList3.isEmpty());
    }
}
