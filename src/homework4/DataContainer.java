package homework4;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>{
    private T[] data;
    private int index = 0;
    DataContainer(Class<T> type) {   //КОНСТРУКТОР необходимо передать класс, чтобы он мог использовать его для создания массива с правильным типом среды выполнения
        this.data = (T[]) Array.newInstance(type, 13);
    }
    public int add(T item) {
        if (this.index == this.data.length) {
            T[] tmp = Arrays.copyOf(this.data, this.data.length + 1);
            this.data = tmp;
        }
        this.data[this.index] = item;
        return this.index++;
    }

    public T get(int index) {
        return this.data[index];
    }

    public int getIndex() {
        return this.index;
    }

    public T[] getItems() {
        return (T[]) this.data;
    }

    public boolean delete(int index) {
        if (index > this.index) {
            System.out.println("не сущ. индекс");
            return false;
        }
        T[] tmp = Arrays.copyOf(this.data, this.data.length - 1);
        int j = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (i != index) {
                tmp[j] = this.data[i];
                j++;
            }
        }
        this.data = tmp;
        this.index--;
        return true;
    }

    public boolean deleteItem(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i]==item) {
                return delete(i);
            }
        }
        System.out.println("не сущ. элемент");
        return false;
    }


    public String toString(T[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        b.append(String.valueOf(a[0]));
        for (int i = 1; ; i++) {
            if (a[i] != null){
                b.append(",");
                b.append(String.valueOf(a[i]));
            }
            if (i == iMax)
                return b.append(']').toString();
            }
        }
    public void checkNull(T[] arr){
        int count=0;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                    count++;
            }
        }
        T[] tmp = Arrays.copyOf(this.data, this.data.length - count);
        int k=0;
        for (int j = 0; j < data.length; j++) {
            tmp[k]=this.data[j];
            k++;
            this.data=tmp;
        }
    }

    public void sort(Comparator<T> comparator){
        checkNull(this.data);
        T tmp;
        for (int i = 0; i < this.data.length - 1; i++) {
            for (int j = 0; j < this.data.length - 1; j++) {
                if (comparator.compare(this.data[j], this.data[j + 1]) > 0) {
                    tmp = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = tmp;
                }
            }
        }
    }
    public static <V extends Comparable> void sort(DataContainer<V> container){
        V tmp;
        for (int i = 0; i < container.data.length - 1; i++) {
            for (int j = 0; j < container.data.length - 1; j++) {
                if (container.data[j].compareTo(container.data[j + 1]) > 0) {
                    tmp = container.data[j];
                    container.data[j] = container.data[j + 1];
                    container.data[j + 1] = tmp;
                }
            }
        }
    }

    public static <V> void sort(DataContainer<V> container, Comparator<V> comparator){
        V tmp;
        for (int i = 0; i < container.data.length - 1; i++) {
            for (int j = 0; j < container.data.length - 1; j++) {
                if (comparator.compare(container.data[j], container.data[j + 1]) > 0) {
                    tmp = container.data[j];
                    container.data[j] = container.data[j + 1];
                    container.data[j + 1] = tmp;
                }
            }
        }
    }
}