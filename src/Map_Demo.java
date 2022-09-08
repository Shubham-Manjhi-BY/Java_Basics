//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Demo {
    public static HashMap<Integer, String> map = new HashMap();

    public static void Printer() {
        Iterator var0 = map.entrySet().iterator();

        while(var0.hasNext()) {
            Map.Entry m = (Map.Entry)var0.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }

    public static void Printer2() {
        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {

        map.put(101, "Manish");
        map.put(102, "Pratham");
        map.put(103, "Shubham");
        map.put(104, "Other1");
        map.put(105, "Other2");
        map.put(106, "Other3");
        System.out.println("Original Map : " + map);
        Printer();
        Printer2();




        System.out.println("Original Map Keys : " + map.keySet());
        System.out.println("Original Map Value : " + map.values());
        Printer2();

        System.out.println("Original Map Size : " + map.size());



        // Put all to hashmap
        // Creating a new hash map and copying
        HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
        new_hash_map.putAll(map);
        System.out.println("Copy Map : " + new_hash_map);
        new_hash_map.put(125,"Other5");





        // Print and display the HashMap
        System.out.println("Initial Mappings are: "+ map);

        // Print and display the cloned HashMap
        // using clone() method
        System.out.println("The cloned map look like this: "+ map.clone());

        System.out.println("Original Map is Empty : " + map.isEmpty());
        map.clear();
        System.out.println("Original Map is Empty : " + map.isEmpty());





    }
}
