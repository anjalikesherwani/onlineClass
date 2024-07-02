import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collection {

    public static void main(String[] args) {
//ArrayList
        ArrayList al1 = new ArrayList();
        al1.add("A");
        al1.add("B");
        al1.add("C");
        al1.add(101);
        al1.add(102);
        al1.add(103);
        System.out.println("al1 :- "+ al1);
        System.out.println("----------------ArrayList--------------------------");

        for(int i=0; i<=al1.size()-1; i++){
            System.out.println("Index :- "+ i + " Value :- "+al1.get(i));
        }
        System.out.println("-----------------Iterator-------------------------");

//Iterator
        Iterator iterator = al1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+ " ");
        }
        System.out.println("--------------------ListIterator----------------------");



//ListIterator
        ListIterator listIterator = al1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next()+ " ");
            }
            System.out.println("---------------------------In Reverse Order---------------");

            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous()+ " ");
                }


                System.out.println("-----------------------Clone of ArrayList-------------------");

                //Creating Clone of ArrayList
                ArrayListclone arraylistclone = new ArrayListclone();
                System.out.println("Original ArrayList :- "+ al1);
                System.out.println("Clone ArrayList :- "+ arraylistclone);

                System.out.println("-----------------------Clone of ArrayList-------------------");

                ArrayListclone arraylistClone = (ArrayListclone) al1.clone();
                System.out.println("Original ArrayList :- "+ al1);
                System.out.println("Clone ArrayList :- "+ arraylistClone);
                

    }
}