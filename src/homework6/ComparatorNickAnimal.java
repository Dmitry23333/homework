package homework6;

import java.util.Comparator;

public class ComparatorNickAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().length()-o2.getNick().length();
    }
}
