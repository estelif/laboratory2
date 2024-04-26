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
        System.out.println("Top element: " + stack.top());
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Empty or not " + stack.isEmpty());
        stack.clear();
        System.out.println("After clearing " + stack.isEmpty());

        //MyMinHeap
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(5);
        minHeap.insert(4);

        System.out.println("Minimum element: " + minHeap.getMin());
        System.out.println("Removed minimum element: " + minHeap.extractMin());
        System.out.println("After 1st element, Minimum element: " + minHeap.getMin());
        minHeap.insert(0);
        System.out.println("After added, Minimum element: " + minHeap.getMin());
    }

}
