package homework4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataComporator dataComporator=new DataComporator();
        DataContainer<Integer> data= new DataContainer<>(Integer.class);
        data.add(12);
        data.add(23);
        data.add(7);
        data.add(45);
        data.sort(dataComporator);
        System.out.println(data.toString(data.getItems()));
        data.delete(0);
        System.out.println(data.toString(data.getItems()));
        data.deleteItem(45);
        System.out.println(data.toString(data.getItems()));
    }
}
