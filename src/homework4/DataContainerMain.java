package homework4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataComporator dataComporator=new DataComporator();
        DataContainer<Integer> data= new DataContainer<>(Integer.class);
        data.add(2);
        data.add(6);
        data.add(221);
        data.delete(2);
        data.add(3);
        data.deleteItem(2);
        data.add(21);
        data.add(432);
        System.out.println(Arrays.toString(data.getItems()));
        System.out.println(data.toString(data.getItems()));
        System.out.println(data.get(3));
        System.out.println(data.add(7));
        data.sort(dataComporator);
        System.out.println(data.toString(data.getItems()));
        data.add(0);
        data.sort(dataComporator);
        System.out.println(data.toString(data.getItems()));
    }
}
