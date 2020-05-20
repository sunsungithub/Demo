package chapter13.queue;

import charpter05.equals.Employee;
import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> testQueue=new ArrayDeque<>();
        testQueue.add(1);
        testQueue.add(2);
        testQueue.add(3);
        testQueue.add(4);
        testQueue.add(5);

        System.out.println(testQueue.peek());

        Employee e=new Employee("test",123456,1989,12,10);
        List<Employee> list=new ArrayList<>();
        System.out.println("(List) first add =="+list.add(e));
        System.out.println("(List) second add=="+list.add(e));

        Set<Employee> set=new HashSet<>();
        System.out.println("(Set) first add=="+set.add(e));
        System.out.println("(Set) second add=="+set.add(e));

        LinkedList linkedList=new LinkedList();
        ListIterator iterator;



    }
}
