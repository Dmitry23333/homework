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
        data.add(25);
        data.deleteItem(25);
        System.out.println(Arrays.toString(data.getItems()));
        data.sort(dataComporator);
        System.out.println(data.toString(data.getItems()));
        System.out.println(data.toString(data.getItems()));
        System.out.println(data.toString(data.getItems()));

    }
}
