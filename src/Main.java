/**
 * This class demonstrates the implementation and usage of custom data structures
 as MyArrayList, MyLinkedList, MyQueue, MyStack and MyMinHeap.
 It initializes instances of these data structures, adds elements,
 retrieves elements by index, removes elements, checks the size etc,
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        ArrayList arrayList = new ArrayList();
        myArrayList.add(11.5);
        myArrayList.add(10);
        myArrayList.add(9);
        myArrayList.add(8.7);
        myArrayList.add(7);
        myArrayList.add(6);
        System.out.println("Value of element by index 3: " + myArrayList.get(3));
        myArrayList.add(20, 3);
        System.out.println("Value of element by index 3 after adding new value: " + myArrayList.get(3));

        System.out.println("Size of myArrayList: " + myArrayList.size());
        myArrayList.remove(3);
        System.out.println("Size of myArrayList after removing: " + myArrayList.size());
        System.out.println("Value of index 3  after removing: " + myArrayList.get(3));
        myArrayList.clear();
        System.out.println("Size of myArrayList after clear: " + myArrayList.size());

        MyLinkedList myLinkedList = new MyLinkedList<>();
        myLinkedList.add(4);
        myLinkedList.add(1);
        myLinkedList.add(3);
        myLinkedList.add(7);
        myLinkedList.add(6);
        myLinkedList.add(5);


        System.out.println("Value of index 2: " + myLinkedList.get(2));
        System.out.println("Current size of a list:" + myLinkedList.size());
        System.out.println("Values of index 0 before remove: " + myLinkedList.get(0));
        myLinkedList.remove(0);
        System.out.println("Value of index 0 after remove: " + myLinkedList.get(0));
        System.out.println("Size of an list: " + myLinkedList.size());
        System.out.println("Value of index 1 before remove: " + myLinkedList.get(1));
        myLinkedList.remove(1);
        System.out.println("Value of index 1 after remove: " + myLinkedList.get(1));
        System.out.println("Current size of a list: " + myLinkedList.size());

        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        int dequeuedItem = myQueue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem);
        System.out.println("Is it empty? " + myQueue.isEmpty());
        System.out.println("Size of the queue: " + myQueue.size());
        myQueue.clear();
        System.out.println("After clearing " + myQueue.isEmpty());

        //MyStack
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        MyMinHeap<Integer> minheap = new MyMinHeap<>();
        minheap.insert(10);
        minheap.insert(5);
        minheap.insert(15);
        minheap.insert(3);
        minheap.insert(7);

        System.out.println("Is the stack empty? " + stack.isEmpty()); //checks if its empty or not
        System.out.println("Top one: " + stack.top()); //top element

        int min = minheap.extractMin();
        System.out.println("Extracted minimum element from the heap: " + min);//min element from the heap
        System.out.println("Size of the heap: " + minheap.size()); //prints size

    }
}