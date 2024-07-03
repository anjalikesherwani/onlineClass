import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("E");
        linkedList.add("D");
        System.out.println("------------Initial LinkedList------------");
        System.out.println("Initial LinkedList :- "+ linkedList);

        System.out.println("------------Iterating the list through Iterator------------");
        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
            }

            linkedList.addFirst("q");
            linkedList.addLast("z");
            System.out.println("------------After adding elements at first and last------------");
            System.out.println("Updated LinkedList :- "+ linkedList);

            String polledElement = linkedList.pollFirst();
            System.out.println("------------After removing first element------------");
            System.out.println("Polled Element :- "+polledElement);
            System.out.println("Updated LinkedList :- "+ linkedList);

            Collections.sort(linkedList);
            System.out.println("------------After sorting the list------------");
            System.out.println("Sorted LinkedList :- " + linkedList);
          

            Collections.sort(linkedList, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                    }
                    });

            System.out.println("Reverse Sorted LinkedList :- "+ linkedList);
          

            linkedList.add("A");
            linkedList.add("C");
            linkedList.add("B");
            System.out.println("After Duplicacy :- " + linkedList);

            linkedList.removeAll(Collections.singleton("A"));
            System.out.println("After removing A :- " + linkedList);

            linkedList.clear();
            System.out.println("After clearing the list :- " + linkedList);



            // System.out.println("------------Adding element at the end of the list------------");
            // linkedList.add("F");
            // System.out.println("After adding element at the end of the list :- "+ linkedList);
            // System.out.println("------------Adding element at the beginning of the list------------");
            // linkedList.addFirst("G");
            // System.out.println("After adding element at the beginning of the list :- "+ linkedList);
            // System.out.println("------------Adding element at the specified position of the list------------");
            // linkedList.add(2, "H");
            // System.out.println("After adding element at the specified position of the list :- "+ linkedList);
            // System.out.println("------------Removing element at the end of the list------------");
            // linkedList.removeLast();
            // System.out.println("After removing element at the end of the list :- "+ linkedList);
            // System.out.println("------------Removing element at the beginning of the list------------");
            // linkedList.removeFirst();
            // System.out.println("After removing element at the beginning of the list :- "+ linkedList);
            // System.out.println("------------Removing element at the specified position of the list------------");
            // linkedList.remove(2);
            // System.out.println("After removing element at the specified position of the list :- "+ linkedList);

    }
}