package HomeWork4;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
    private int size;
    private int capacity;

    private void increaseCapacity() {
        int newCapacity = this.size * 2;
        T[] newArray = Arrays.copyOf(this.data, newCapacity);
        this.data = newArray;
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

    public int getSize() {
        return this.size;
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