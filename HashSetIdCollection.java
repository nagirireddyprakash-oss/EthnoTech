/*import java.util.HashSet;
import java.util.Set;

public class HashSetIdCollection {

    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>();

        // add()
        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(104);
        ids.add(105);

        System.out.println("IDs: " + ids);

        // size()
        System.out.println("Total IDs: " + ids.size());

        // contains()
        System.out.println("Contains 103? " + ids.contains(103));

        // remove()
        ids.remove(104);
        System.out.println("After removing 104: " + ids);

        // isEmpty()
        System.out.println("Is Empty? " + ids.isEmpty());

        // addAll()
        Set<Integer> newIds = new HashSet<>();
        newIds.add(106);
        newIds.add(107);

        ids.addAll(newIds);
        System.out.println("After addAll(): " + ids);

        // iterator / for-each
        System.out.println("Printing IDs:");
        for (Integer id : ids) {
            System.out.println(id);
        }

        // clear()
        ids.clear();
        System.out.println("After clear(): " + ids);

        // isEmpty()
        System.out.println("Is Empty Now? " + ids.isEmpty());
    }
}*/

import java.util.HashSet;
import java.util.Set;

// Parent Class
class Parent {
    void title() {
        System.out.println("ID Collection Using HashSet");
    }
}

// Child Class
public class HashSetIdCollection extends Parent {

    public static void main(String[] args) {

        HashSetIdCollection obj = new HashSetIdCollection();

        obj.title(); // Parent class method

        Set<Integer> ids = new HashSet<>();

        // add()
        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(104);
        ids.add(105);

        System.out.println("IDs : " + ids);

        // size()
        System.out.println("Size : " + ids.size());

        // contains()
        System.out.println("Contains 103? " + ids.contains(103));

        // remove()
        ids.remove(104);
        System.out.println("After Remove : " + ids);

        // addAll()
        Set<Integer> newIds = new HashSet<>();
        newIds.add(106);
        newIds.add(107);
        ids.addAll(newIds);

        System.out.println("After addAll : " + ids);

        // forEach
        System.out.println("Printing IDs:");
        for (Integer id : ids) {
            System.out.println(id);
        }

        // isEmpty()
        System.out.println("Is Empty? " + ids.isEmpty());

        // clear()
        ids.clear();
        System.out.println("After Clear : " + ids);

        // isEmpty()
        System.out.println("Is Empty Now? " + ids.isEmpty());
    }
}