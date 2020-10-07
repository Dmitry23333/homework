package homework6;

import java.util.*;

public class AnimalPerson {
    public static void main(String[] args) {

        //Работа с LinkedList
        long startLinked=System.currentTimeMillis();
        LinkedList<Animal> linkedList = new LinkedList<Animal>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(new Animal(Utils.randomAge(), GetNickAnimal.getNickAnimal()));
        }
        long finishLinked =System.currentTimeMillis();
        linkedList.sort(new CompatorAgeAnimal());
        linkedList.sort(new CompatorAgeAnimal().thenComparing(new CompatorNickAnimal()));
        long startLinkedIteration=System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i).getAge()+" "+ linkedList.get(i).getNick());
        }
        long finishLinkedIteration=System.currentTimeMillis();
        long startLinkedIterator=System.currentTimeMillis();
        Iterator<Animal> iteratorList = linkedList.iterator();
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next().getAge() + " " + iteratorList.next().getNick());
        }
        long finishLinkedIterator=System.currentTimeMillis();
        long startLinkedRemove=System.currentTimeMillis();
        Iterator<Animal> iteratorListRemove = linkedList.iterator();
        while (iteratorListRemove.hasNext()){
            Animal next = iteratorListRemove.next();
            iteratorListRemove.remove();
        }
        System.out.println(linkedList.size());
        long finishLinkedRemove=System.currentTimeMillis();

        //Работа с ArrayList
        long startArrayList=System.currentTimeMillis();
        ArrayList<Animal> arrayList = new ArrayList<Animal>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(new Animal(Utils.randomAge(),GetNickAnimal.getNickAnimal()));
        }
        long finishArrayList =System.currentTimeMillis();
        arrayList.sort(new CompatorAgeAnimal());
        arrayList.sort(new CompatorAgeAnimal().thenComparing(new CompatorNickAnimal()));
        long startArrayListIteration=System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getAge()+" "+ arrayList.get(i).getNick());
        }
        long finishArrayListIteration=System.currentTimeMillis();
        long startArrayListIterator=System.currentTimeMillis();
        Iterator<Animal> iteratorArrayList = arrayList.iterator();
        while (iteratorArrayList.hasNext()) {
            System.out.println(iteratorArrayList.next().getAge() + " " + iteratorArrayList.next().getNick());
        }
        long finishArrayListIterator=System.currentTimeMillis();
        long startiteratorArrayListRemove=System.currentTimeMillis();
        Iterator<Animal> iteratorArrayListRemove = arrayList.iterator();
        while (iteratorArrayListRemove.hasNext()){
            Animal next = iteratorArrayListRemove.next();
            iteratorArrayListRemove.remove();
        }
        long finishArrayListRemove=System.currentTimeMillis();

        //Работ с HashSet
        long startHash=System.currentTimeMillis();
        HashSet<Animal> hashSet = new HashSet<Animal>();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(new Animal(Utils.randomAge(),GetNickAnimal.getNickAnimal()));
        }
        long finishHash =System.currentTimeMillis();
        List<Animal> list = new ArrayList<Animal>(hashSet);
        list.sort(new CompatorAgeAnimal());
        list.sort(new CompatorAgeAnimal().thenComparing(new CompatorNickAnimal()));
        long startHashIteration=System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getAge() + " " + list.get(i).getNick());
        }
        long finishHashIteration=System.currentTimeMillis();
        long startHashIterator=System.currentTimeMillis();
        Iterator<Animal> iteratorHash = hashSet.iterator();
        while (iteratorHash.hasNext()) {
            System.out.println(iteratorHash.next().getAge() + " " + iteratorHash.next().getNick());
        }
        long finishiteratorHashIterator=System.currentTimeMillis();
        long startiteratorHashRemove=System.currentTimeMillis();
        Iterator<Animal> iteratorHashRemove = hashSet.iterator();
        while (iteratorHashRemove.hasNext()){
            Animal next = iteratorHashRemove.next();
            iteratorHashRemove.remove();
        }
        long finishHashRemove=System.currentTimeMillis();

        // Работа с TreeSet
        long startTree=System.currentTimeMillis();
        TreeSet<Animal> treeSet = new TreeSet<Animal>(new CompatorAgeAnimal().thenComparing(new CompatorNickAnimal()));
        for (int i = 0; i < 1000000; i++) {
            treeSet.add(new Animal(Utils.randomAge(), GetNickAnimal.getNickAnimal()));
        }
        long finishTree =System.currentTimeMillis();
        long startTreeIteration=System.currentTimeMillis();
        List<Animal> list1 = new ArrayList<Animal>(treeSet);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getAge() + " " + list.get(i).getNick());
        }
        long finishTreeIteration=System.currentTimeMillis();
        long startTreeIterator=System.currentTimeMillis();
        Iterator<Animal> iteratorTree = list1.iterator();
        while (iteratorTree.hasNext()) {
            System.out.println(iteratorTree.next().getAge() + " " + iteratorTree.next().getNick());
        }
        long finishiteratorTreeIterator=System.currentTimeMillis();
        long startTreeRemove=System.currentTimeMillis();
        Iterator<Animal> iteratorTreeRemove = treeSet.iterator();
        while (iteratorTreeRemove.hasNext()){
            Animal next = iteratorTreeRemove.next();
            iteratorTreeRemove.remove();
        }
        long finishTreeRemove=System.currentTimeMillis();
        System.out.println("Операция: Заполнение LinkedList заняла "+(finishLinked - startLinked)+"мс\n"+
                "Операция: Итерирование без итератора LinkedList  заняла "+(finishLinkedIteration - startLinkedIteration)+"мс\n"+
                "Операция: Итерирование с итератором LinkedList  заняла "+(finishLinkedIterator - startLinkedIterator)+"мс\n"+
                "Операция: Удаление LinkedList  заняла "+(finishLinkedRemove - startLinkedRemove)+"мс\n");
        System.out.println("Операция: Заполнение ArrayList заняла "+(finishArrayList - startArrayList)+"мс\n"+
                "Операция: Итерирование без итератора ArrayList  заняла "+(finishArrayListIteration - startArrayListIteration)+"мс\n"+
                "Операция: Итерирование с итератором ArrayList  заняла "+(finishArrayListIterator - startArrayListIterator)+"мс\n"+
                "Операция: Удаление ArrayList  заняла "+(finishArrayListRemove - startArrayListIterator)+"мс\n");
        System.out.println("Операция: Заполнение HashSet заняла "+(finishHash - startHash)+"мс\n"+
                "Операция: Итерирование без итератора HashSet  заняла "+(finishHashIteration - startHashIteration)+"мс\n"+
                "Операция: Итерирование с итератором HashSet  заняла "+(finishiteratorHashIterator - startHashIterator)+"мс\n"+
                "Операция: Удаление HashSet  заняла "+(finishHashRemove - startiteratorHashRemove)+"мс\n");
        System.out.println("Операция: Заполнение TreeSet заняла "+(finishTree - startTree)+"мс\n"+
                "Операция: Итерирование без итератора TreeSet  заняла "+(finishTreeIteration - startTreeIteration)+"мс\n"+
                "Операция: Итерирование с итератором TreeSet  заняла "+(finishiteratorTreeIterator - startTreeIterator)+"мс\n"+
                "Операция: Удаление TreeSet  заняла "+(finishTreeRemove - startTreeRemove)+"мс\n");
    }
}
