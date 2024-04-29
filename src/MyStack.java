
/**
 * This class represents a custom implementation of a stack data structure.
 * It internally uses MyLinkedList for storing elements.
 * The class provides methods for stack operations such as pushing, popping,
 * getting the top element, checking if the stack is empty, and clearing the stack.
 */

public class MyStack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>();
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