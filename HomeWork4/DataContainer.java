package HomeWork4;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
    private int size;
    private int capacity;

    private void increaseCapacity() {
        int newCapacity = this.size * 2;
        if (newCapacity == 0) {
            newCapacity = 10;
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

    public DataContainer(T[] data) {
        this.data = data;
        if(null != data) {
            this.size = data.length;
            this.capacity = this.size;
        }
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
            if((this.capacity / this.size > 4.0) && this.capacity > 20) {
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