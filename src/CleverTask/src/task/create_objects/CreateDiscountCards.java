package task.create_objects;

import task.random.AnyRandom;
import task.classes.DiscountCard;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateDiscountCards {
    public int id=1;
    public List<DiscountCard> create(){
        return  Stream.generate(() -> new DiscountCard(id++, AnyRandom.randomDiscount()))
                .limit(100).collect(Collectors.toList());
    }

    public static int createID(int n){
        int x=0;
        for (int i = 0; i <n ; i++) {
            x=i;
        }
        return x;
    }
}
