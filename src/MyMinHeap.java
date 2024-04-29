/**
 * This class represents a custom implementation of a minimum heap data structure.
 * It internally uses MyArrayList for storing elements.
 * The class provides methods for heap operations such as insertion, extraction of minimum,
 * getting the minimum element, and heapifying to maintain the heap property.
 */

public class MyMinHeap<T extends Comparable<T>> {
    MyArrayList<T> minheap = new MyArrayList<>();

    public MyMinHeap(){
    }

    public int size(){
        return minheap.size();
    }

    public void clear(){
        minheap.clear();
    }                          // all elements will be deleted from heap

    public T getMin(){
        return minheap.getFirst();
    }                          //first element get


    public T extractMin(){
        T min = minheap.getFirst();
        swap(0, minheap.size()-1);
        minheap.removeLast();
        heapify(0);
        return min;
    }                       // Gets minimum and swaps with last element and removes last element

    public void insert(T item){
        minheap.add(item);
        int i = minheap.size() - 1;
        heapify(i);
    }                      // inserts new item at the end of heap

    private void heapify(int i){
        int left = leftChildOf(i);
        int right = rightChildOf(i);
        int minimum = i;
        if (left < minheap.size() && minheap.get(left).compareTo(minheap.get(minimum)) < 0){
            minimum = left;
        }
        if (right < minheap.size() && minheap.get(right).compareTo(minheap.get(minimum)) < 0){
            minimum = right;
        }
        if (minimum != i){
            swap(i, minimum);
            heapify(minimum);
        }
    }                        // heapify function to maintain the heap functions after deletion or insertion

    private void traverse(int i){
        if (i < minheap.size()){
            System.out.println(minheap.get(i));
            traverse(leftChildOf(i));
            traverse(rightChildOf(i));
        }
    }              // print the heap
    public int leftChildOf(int i){
        return 2 * i;
    }                 //returns left child
    public int rightChildOf(int i){
        return 2 * i + 1;
    }                  //returns right child
    public int parentOf(int i){
        return i / 2;
    }                // returns parent
    private void swap(int k, int z) {
        T temp = minheap.get(k);
        minheap.set(k, minheap.get(z));
        minheap.set(z, temp);
    }               // swapping of two elements
}