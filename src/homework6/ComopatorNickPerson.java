package homework6;


import java.util.Comparator;

class ComopatorPasswordPerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length()-o2.getPassword().length();
    }
}
class ComopatorNickPerson implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNick().length()-o2.getNick().length();
    }

}
class CompatorAgeAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge()-o2.getAge();
    }
}
class CompatorNickAnimal implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().length()-o2.getNick().length();
    }
}

