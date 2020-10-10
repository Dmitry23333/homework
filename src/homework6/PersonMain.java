package homework6;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {

        //Работа с LinkedList
        long startLinked=System.currentTimeMillis();
        LinkedList<Person> linkedList = new LinkedList<Person>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(new Person(GetNickPerson.getNickPerson(), Utils.randomPassword()));
        }
        long finishLinked =System.currentTimeMillis();
        linkedList.sort(new ComparatorPasswordPerson());
        linkedList.sort(new ComparatorPasswordPerson().thenComparing(new ComparatorNickPerson()));
        long startLinkedIteration=System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i).getNick()+" "+ linkedList.get(i).getPassword());
        }
        long finishLinkedIteration=System.currentTimeMillis();
        long startLinkedIterator=System.currentTimeMillis();
        Iterator<Person> iteratorList = linkedList.iterator();
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next().getNick() + " " + iteratorList.next().getPassword());
        }
        long finishLinkedIterator=System.currentTimeMillis();
        long startLinkedRemove=System.currentTimeMillis();
        Iterator<Person> iteratorListRemove = linkedList.iterator();
        while (iteratorListRemove.hasNext()){
            Person next = iteratorListRemove.next();
            iteratorListRemove.remove();
        }
        System.out.println(linkedList.size());
        long finishLinkedRemove=System.currentTimeMillis();

        //Работа с ArrayList
        long startArrayList=System.currentTimeMillis();
        ArrayList<Person> arrayList = new ArrayList<Person>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(new Person(GetNickPerson.getNickPerson(), Utils.randomPassword()));
        }
        long finishArrayList =System.currentTimeMillis();
        arrayList.sort(new ComparatorPasswordPerson());
        arrayList.sort(new ComparatorPasswordPerson().thenComparing(new ComparatorNickPerson()));
        long startArrayListIteration=System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getNick()+" "+ arrayList.get(i).getPassword());
        }
        long finishArrayListIteration=System.currentTimeMillis();
        long startArrayListIterator=System.currentTimeMillis();
        Iterator<Person> iteratorArrayList = arrayList.iterator();
        while (iteratorArrayList.hasNext()) {
            System.out.println(iteratorArrayList.next().getNick() + " " + iteratorArrayList.next().getPassword());
        }
        long finishArrayListIterator=System.currentTimeMillis();
        long startiteratorArrayListRemove=System.currentTimeMillis();
        Iterator<Person> iteratorArrayListRemove = arrayList.iterator();
        while (iteratorArrayListRemove.hasNext()){
            Person next = iteratorArrayListRemove.next();
            iteratorArrayListRemove.remove();
        }
        long finishArrayListRemove=System.currentTimeMillis();

        //Работ с HashSet
        long startHash=System.currentTimeMillis();
        HashSet<Person> hashSet = new HashSet<Person>();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(new Person(GetNickPerson.getNickPerson(), Utils.randomPassword()));
        }
        long finishHash =System.currentTimeMillis();
        List<Person> list = new ArrayList<Person>(hashSet);
        list.sort(new ComparatorPasswordPerson());
        list.sort(new ComparatorPasswordPerson().thenComparing(new ComparatorNickPerson()));
        long startHashIteration=System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNick() + " " + list.get(i).getPassword());
        }
        long finishHashIteration=System.currentTimeMillis();
        long startHashIterator=System.currentTimeMillis();
        Iterator<Person> iteratorHash = hashSet.iterator();
        while (iteratorHash.hasNext()) {
            System.out.println(iteratorHash.next().getNick() + " " + iteratorHash.next().getPassword());
        }
        long finishiteratorHashIterator=System.currentTimeMillis();
        long startiteratorHashRemove=System.currentTimeMillis();
        Iterator<Person> iteratorHashRemove = hashSet.iterator();
        while (iteratorHashRemove.hasNext()){
            Person next = iteratorHashRemove.next();
            iteratorHashRemove.remove();
        }
        long finishHashRemove=System.currentTimeMillis();

        // Работа с TreeSet
        long startTree=System.currentTimeMillis();
        TreeSet<Person> treeSet = new TreeSet<Person>(new ComparatorPasswordPerson().thenComparing(new ComparatorNickPerson()));
        for (int i = 0; i < 1000000; i++) {
            treeSet.add(new Person(GetNickPerson.getNickPerson(), Utils.randomPassword()));
        }
        long finishTree =System.currentTimeMillis();
        long startTreeIteration=System.currentTimeMillis();
        List<Person> list1 = new ArrayList<Person>(treeSet);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getNick() + " " + list.get(i).getPassword());
        }
        long finishTreeIteration=System.currentTimeMillis();
        long startTreeIterator=System.currentTimeMillis();
        Iterator<Person> iteratorTree = list1.iterator();
        while (iteratorTree.hasNext()) {
            System.out.println(iteratorTree.next().getNick() + " " + iteratorTree.next().getPassword());
        }
        long finishiteratorTreeIterator=System.currentTimeMillis();
        long startTreeRemove=System.currentTimeMillis();
        Iterator<Person> iteratorTreeRemove = treeSet.iterator();
        while (iteratorTreeRemove.hasNext()){
            Person next = iteratorTreeRemove.next();
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
