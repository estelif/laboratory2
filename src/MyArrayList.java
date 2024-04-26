import java.util.Iterator;

class MyArrayList<T> implements MyList<T> {
    private T[] arr = (T[]) new Object[5];
    private int size;

    public MyArrayList() {
        size = 0;
    }

    public void add(T item) {
        if(size==arr.length)
            resize();
        arr[size++] = item;
    }

    @Override
    public void add(int index, T item) {
        if(size==arr.length)
            resize();
        checkIndex(index);
        arr[index]= item;
    }
    private void resize() {
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i<size; i++)
            newArr[i]= arr[i];
        arr=newArr;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        arr[index]=item;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index is not correct");
    }
    @Override
    public void addFirst(T item) {
        add(0,item);
    }

    @Override
    public void addLast(T item) {
        add(size,item);
    }

    @Override
    public T get(int index){
        checkIndex(index);
        return arr[index];

    }

    @Override
    public T getFirst() {
        return arr[0];
    }

    @Override
    public T getLast() {
        return arr[size];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++)
            arr[i-1] = arr[i];
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size);
    }

    @Override
    public void sort() {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length-1-i; j++){
                if (((Comparable)arr[j]).compareTo(arr[j+1]) > 0){
                    Object temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = (T) temp;
                }
            }
        }
    } // Sorting in ascending order

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (object == arr[i]) return i;
        }
        return -1; //if object not found
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (object==arr[i])
                return i;
        }
        return -1; //also if object not found
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1; //true if there is an object
    }

    @Override
    public Object[] toArray() {
        Object[] array =  new Object[size];
        for (int i = 0; i < size; i++)
            array[i] = arr[i];
        return array;
    }

    @Override
    public void clear() {
        arr=(T[]) new Object[5];
        size=0;
    }

    @Override
    public int size() {
        return size;
    }


    public Iterator<T> iterator() {
        return null;
    }
}