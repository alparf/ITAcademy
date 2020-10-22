package HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] data;
    private int size;
    private int capacity;

    private class Itr implements Iterator<T> {
        private int marker;

        @Override
        public boolean hasNext() {
            return marker != size ? true : false;
        }

        @Override
        public T next() {
            return data[marker++];
        }
    }

    /**
     *
     * @param container DataContainer<C>
     * @param <C> C - generic Class implement Comparable interface
     * This method sort the collection using the interface Comparable implementation
     */

    public static <C extends Comparable> void sort(DataContainer<C> container) {
        Arrays.sort(container.getItems());
    }

    /**
     *
     * @param container DataContainer<C>
     * @param comparator have to implement Comparator<C>
     * @param <C> C - generic Class
     * This method sort the collection using comparator
     */

    public static  <C> void sort(DataContainer<C> container, Comparator<C> comparator) {
        Arrays.sort(container.getItems(), comparator);
    }

    /**
     * This method increase the capacity of collection by 2 times
     */

    private void increaseCapacity() {
        int newCapacity = this.size * 2;
        if (newCapacity == 0) {
            newCapacity = this.DEFAULT_CAPACITY;
        }
        this.data = Arrays.copyOf(this.data, newCapacity);
        this.capacity = newCapacity;
    }

    /**
     * This method decrease capacity of collection by 2 times
     */

    private void decreaseCapacity() {
        int newCapacity = this.capacity / 2;
        this.data = Arrays.copyOf(this.data, newCapacity);
        this.capacity = newCapacity;
    }

    /**
     *
     * @return the position first null within size
     * Because task №4
     */

    private int getFirstIndexOfNull() {
        for (int i = 0; i < this.size; i++) {
            if(null == this.data[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Default constructor
     */

    public DataContainer() {
        this.data = (T[]) new Object[this.DEFAULT_CAPACITY];
        this.size = 0;
        this.capacity = 10;
    }

    /**
     *
     * @param data - Class<T>[] variable
     * Constructor based on argument data
     */

    public DataContainer(T[] data) {
        this();
        if(null != data) {
            this.size = data.length;
            this.capacity = this.size;
            this.data = data;
        }
    }

    /**
     *
     * @param item - Class<T> variable
     * Constructor based on argument item
     */

    public DataContainer(T item) {
        this();
        if(null != item) {
            this.data = (T[]) Array.newInstance(item.getClass(), this.DEFAULT_CAPACITY);
            this.data[0] = item;
            this.size = 1;
            this.capacity = this.DEFAULT_CAPACITY;
        }
    }

    /**
     *
     * @param item variable type of T
     * @return the position of element when it was to add or -1 if item == null
     * if the capacity is insufficient call increaseCapacity()
     */

    public int add(T item) {
        if(null == item) {
            return -1;
        }
        int nullIndex = getFirstIndexOfNull();
        if(nullIndex >= 0) {
            this.data[nullIndex] = item;
            return nullIndex;
        }
        if(!(this.size < this.capacity)) {
            this.increaseCapacity();
        }
        this.data[size++] = item;
        return this.size - 1;
    }

    /**
     *
     * @param index element index
     * @return the element if it exists in the array or Null
     */

    public T get(int index) {
        if(index < this.size) {
            return data[index];
        }
        return null;
    }

    /**
     *
     * @return the size of collection
     */

    public int getSize() {
        return this.size;
    }

    /**
     *
     * @return the array of collection
     */

    public T[] getItems() {
        return this.data;
    }

    /**
     *
     * @param index element index
     * @return the true if the element is exist and remove it
     * or return false. If capacity > size by 4 times call decreaseCapacity()
     */

    public boolean delete(int index) {
        if(index < this.size) {
            if((this.capacity / this.size > 4)
                    && (this.capacity > (this.DEFAULT_CAPACITY * 2))) {
                this.decreaseCapacity();
            }
            T[] newArray = (T[]) new Object[this.capacity];
            for(int i = 0; i < this.size; i++) {
                if(i < index) {
                    newArray[i] = this.data[i];
                }
                if(i > index) {
                    newArray[i - 1] = this.data[i];
                }
            }
            this.data = newArray;
            this.size = this.size - 1;
            return true;
        }
        return false;
    }

    /**
     *
     * @param item type of T argument
     * @return the true if the element is exist and remove it with delete(int index)
     */

    public boolean delete(T item) {
        if(null != item) {
            for (int i = 0; i < this.size; i++) {
                if (item.equals(this.data[i])) {
                    this.delete(i);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param comparator have to implement Comparator<T>
     * This method sort collection using the argument: comparator
     */

    public void sort(Comparator<T> comparator) {
        Arrays.sort(this.data, comparator);
    }

    @Override
    public String toString() {
        boolean isPut = false;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            if(isPut) {
                sb.append(", ");
            } else {
                isPut = true;
            }
            sb.append(this.data[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @return iterator
     */

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }
}