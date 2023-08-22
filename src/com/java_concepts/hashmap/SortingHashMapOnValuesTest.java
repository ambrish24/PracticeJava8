package java_concepts.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SortingHashMapOnValuesTest {

    public static void main(String[] args) {

        HashMap<String, Double> map = new LinkedHashMap<String,
                Double>();

        ValueComparator bvc = new ValueComparator(map);

        TreeMap<String, Double> sorted_map = new
                TreeMap<String,Double>(bvc);

        map.put("A", 99.5);
        map.put("D", 67.3);
        map.put("E", 99.5);
        map.put("F", 96.5);
        map.put("B", 67.4);
        map.put("C", 67.4);

        System.out.println("unsorted map: " + map);

        sorted_map.putAll(map);

        System.out.println("sorted map: " + sorted_map);
    }
}
