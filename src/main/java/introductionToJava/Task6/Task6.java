package introductionToJava.Task6;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(200);
        mySet.add(12);
        mySet.add(5);
        System.out.println(mySet.toString());
        System.out.println(mySet.get(2));
    }
}
class MySet {

    private  HashMap<Integer, Object> map = new HashMap<>();
    private final Object OBJECT = new Object();

    public void add(Integer i) {
        map.put(i, OBJECT);
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Integer get(Integer i){
        return (Integer) map.keySet().toArray()[i];
    }
}