package homework4;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>{
    private T[] data;
    private int index = 0;
    DataContainer(Class<T> type) {   //КОНСТРУКТОР необходимо передать класс, чтобы он мог использовать его для создания массива с правильным типом среды выполнения
        this.data = (T[]) Array.newInstance(type, 17);
    }
    int add(T item) {
        if (this.index == this.data.length) {
            T[] tmp = Arrays.copyOf(this.data, this.data.length + 1);
            this.data = tmp;
        }
        this.data[this.index] = item;
        return this.index++;
    }

    T get(int index) {
        return this.data[index];
    }

    public int getIndex() {
        return this.index;
    }

    T[] getItems() {
        return (T[]) this.data;
    }

    boolean delete(int index) {
        if (index > this.index-1) {
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

    boolean deleteItem(T item) {
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
    void sort(Comparator<T> comparator){
        T tmp1;
        for (int i = 0; i < this.data.length-1; i++) {
            if (this.data[this.index]!=null)
            for (int j = 0; j < this.data.length - 1; j++) {
                if(comparator.compare(this.data[j], this.data[j + 1]) > 0) {
                    tmp1 = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = tmp1;
                }
            }
        }
    }
}