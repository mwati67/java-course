import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        // ============================================================
        // 1. LIST (ArrayList) - Ordered, allows duplicates, index-based
        // ============================================================
        System.out.println("=== LIST (ArrayList) ===");

        List<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Alice");

        System.out.println("List contents: " + nameList);
        System.out.println("Element at index 1: " + nameList.get(1));

        // ============================================================
        // 2. SET (HashSet) - Unordered, NO duplicates
        // ============================================================
        System.out.println("\n=== SET (HashSet) ===");

        Set<String> nameSet = new HashSet<>();
        nameSet.add("Alice");
        nameSet.add("Bob");
        nameSet.add("Alice");
        nameSet.add("Charlie");

        System.out.println("Set contents: " + nameSet);
        System.out.println("Does the set contain Bob? " + nameSet.contains("Bob"));

        // ============================================================
        // 3. MAP (HashMap) - Key-Value pairs, NO duplicate keys
        // ============================================================
        System.out.println("\n=== MAP (HashMap) ===");

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(101, "David");

        System.out.println("Map contents: " + studentMap);
        System.out.println("Student with ID 102: " + studentMap.get(102));

        System.out.println("Iterating through the Map:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}
