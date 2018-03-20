import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pichaaun Popukdee
 */

public class Recursion {
    /**
     * Remove duplicate consecutive items from a list, changing the list parameter.
     * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
     * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
     * Objects are compared using their own equals method.
     * @param list of any kind of object. The elements are not null.
     * @return reference to the list parameter with consecutive duplicates removed.
     */
    public static List unique(List list) {
        if (list.size()<=1) return list;
        if (list.get(0).equals(list.get(1))){
            list.remove(0);
           unique(list);
        }
        else unique(list.subList(1,list.size()));
       return list;
    }
    public static long fibonacci(int n) {
        // the base case
        if (n < 2) return 1;
        // the recursive step
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main (String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list.toString());
        System.out.println(unique(list).toString());
        System.out.println(fibonacci(45));
    }

}

