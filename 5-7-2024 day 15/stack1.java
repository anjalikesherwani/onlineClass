import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class stack1 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("3 nodes push kane ke baad"+stack);
        stack.push("Anjali");
        stack.push("vaishu");
        stack.push(-97.45f);
        System.out.println(stack);
        stack.pop();
        System.out.println("pop: "+stack);
        System.out.println("peek: "+stack.peek());

        System.out.println("-----------Itreator kane ke baad:------------ ");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------ListItreator kane ke baad:----------- ");
        ListIterator listIterator = stack.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            }

        System.out.println("---------Reverse Order:---------");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
            }

        
    }
}