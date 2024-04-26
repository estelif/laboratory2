import java.util.Iterator;

public class MyStack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>() {

        @Override
        public Iterator<T> iterator() {
            return null;
        }

        @Override
        public void set(int index, T item) {

        }

        @Override
        public void add(int index, T item) {

        }

        @Override
        public void addFirst(T item) {

        }

        @Override
        public void addLast(T item) {

        }

        @Override
        public T get(int index) {
            return null;
        }

        @Override
        public T getFirst() {
            return null;
        }

        @Override
        public T getLast() {
            return null;
        }

        @Override
        public void remove(int index) {

        }

        @Override
        public void removeFirst() {

        }

        @Override
        public void removeLast() {

        }

        @Override
        public void sort() {

        }

        @Override
        public int indexOf(Object object) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object object) {
            return 0;
        }

        @Override
        public boolean exists(Object object) {
            return false;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }
    };
    public MyStack(){
    }

    public T top(){
        return (T) stack.getLast();
    }                        // The top element of the stack

    public T pop(){
        T item = stack.getLast();
        stack.removeLast();
        return item;
    }                       // Gets top element of the stack and removes it

    public void push(T item){
        stack.addLast(item);
    }                       // Adds elements to the top of the stack

    public boolean isEmpty(){
        return stack.size() == 0;
    }                       // Returns true if stack is empty

    public void clear(){
        stack.clear();
    }                       // Removes all elements from the stack
}