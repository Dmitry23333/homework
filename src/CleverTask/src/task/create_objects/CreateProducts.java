package task.create_objects;

import task.random.AnyRandom;
import task.classes.Product;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateProducts {
    public int id=1;
    public List<Product> create(){
        return  Stream.generate(() -> new Product(AnyRandom.randomNameProduct(),id++,
                AnyRandom.randomPriceProduct(),true))
                .limit(100).collect(Collectors.toList());

    }
}
