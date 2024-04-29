/**
 * This class represents a custom implementation of a queue data structure.
 * It internally uses MyArrayList for storing elements.
 * The class provides methods for queue operations such as enqueue, dequeue,
 * getting the front and back elements, checking if the queue is empty,
 * getting the size of the queue, and clearing the queue.
 */
public class MyQueue<T extends Comparable<T>> {
    MyArrayList<T> queue = new MyArrayList<>();
    public MyQueue(){
    }

    public T front (){
        return queue.getFirst();
    }                           //first element from queue

    public T back(){
        return queue.getLast();
    }                           //last element from queue

    public T dequeue(){
        T item = queue.getFirst();
        queue.remove(0);
        return item;
    }                           //removes first element and get it

    public void enqueue(T item){
        queue.add(item);
    }                          //enqueue add element

    public boolean isEmpty(){
        return queue.size() == 0;
    }                          //checking for empty is queue

    public int size(){
        return queue.size();
    }                         //the length of queue

    public void clear(){
        queue.clear();
    }                        //all elements will be deleted
}