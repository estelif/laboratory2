public class MyQueue<T extends Comparable<T>> {
    MyArrayList<T> queue = new MyArrayList<>();  //MyArrayList
    public MyQueue(){
    }                            //my constructor

    public T front (){
        return queue.getFirst();
    }                           //firs element from queue

    public T back(){
        return queue.getLast();
    }                           //last element from queue

    public T dequeue(){
        T item = queue.getFirst();
        queue.remove(0);
        return item;
    }                           //removes 1st element and get it

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