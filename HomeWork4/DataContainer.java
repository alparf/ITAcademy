package HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private final int DEFAULT_SIZE = 10;
    private T[] data;
    private int size;
    private int capacity;

    private void increaseCapacity() {
        int newCapacity = this.size * 2;
        if (newCapacity == 0) {
            newCapacity = this.DEFAULT_SIZE;
        }
        this.data = Arrays.copyOf(this.data, newCapacity);
        this.capacity = newCapacity;
    }

    private void decreaseCapacity() {
        int newCapacity = this.capacity / 2;
        this.data = Arrays.copyOf(this.data, newCapacity);
        this.capacity = newCapacity;
    }

    private int getFirstIndexOfNull() {
        for (int i = 0; i < this.size; i++) {
            if(null == this.data[i]) {
                return i;
            }
        }
        return -1;
    }

    public DataContainer() {
        this.data = (T[]) new Object[this.DEFAULT_SIZE];
        this.size = 0;
        this.capacity = 10;
    }

    public DataContainer(T[] data) {
        this.data = data;
        if(null != data) {
            this.size = data.length;
            this.capacity = this.size;
        }
    }

    public DataContainer(T item) {
        this.data = (T[]) Array.newInstance(item.getClass(), this.DEFAULT_SIZE);
        this.data[0] = item;
        this.size = 1;
        this.capacity = this.DEFAULT_SIZE;
    }

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
        return this.size;
    }

    public T get(int index) {
        if(index < this.size) {
            return data[index];
        }
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public T[] getItems() {
        return this.data;
    }

    public boolean delete(int index) {
        if(index < this.size) {
            if((this.capacity / this.size > 4.0)
                    && (this.capacity > (this.DEFAULT_SIZE * 2))) {
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

    public void sort(Comparator<T> comparator) {
        Arrays.sort(this.data, comparator);
    }

    @Override
    public String toString() {
        boolean isPut = false;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            if(null != this.data[i]) {
                if(isPut) {
                    sb.append(", ");
                } else {
                    isPut = true;
                }
                sb.append(this.data[i].toString());
            } else {
                if(isPut) {
                    sb.append(", ");
                }
                sb.append("null");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}