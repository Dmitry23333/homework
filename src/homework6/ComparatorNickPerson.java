package homework6;


import java.util.Comparator;

class ComparatorNickPerson implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNick().length()-o2.getNick().length();
    }

}

