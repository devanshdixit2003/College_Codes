package Assighment3;


import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Scanner;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Using Scanner object 'dd'
        Scanner dd = new Scanner(System.in);

        // 1️⃣ Default constructor
        TreeMap<Integer, String> tree = new TreeMap<>();

        // 2️⃣ Constructor from another Map
        TreeMap<Integer, String> tree1 = new TreeMap<>(tree);

        // 3️⃣ Constructor from SortedMap (same as tree1 for demo)
        TreeMap<Integer, String> tree2 = new TreeMap<>(tree1);

        int choice = -1;

        while (choice != 0) {
            System.out.println("\n---- TreeMap Menu ----");
            System.out.println("1. put(key, value)");
            System.out.println("2. putIfAbsent(key, value)");
            System.out.println("3. get(key)");
            System.out.println("4. remove(key)");
            System.out.println("5. remove(key, value)");
            System.out.println("6. containsKey(key)");
            System.out.println("7. containsValue(value)");
            System.out.println("8. size()");
            System.out.println("9. isEmpty()");
            System.out.println("10. keySet()");
            System.out.println("11. values()");
            System.out.println("12. entrySet()");
            System.out.println("13. replace(key, value)");
            System.out.println("14. clear()");
            System.out.println("15. toString()");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = dd.nextInt();
            dd.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key1 = dd.nextInt();
                    dd.nextLine();
                    System.out.print("Enter value: ");
                    String val1 = dd.nextLine();
                    tree.put(key1, val1);
                    System.out.println("put executed");
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    int key2 = dd.nextInt();
                    dd.nextLine();
                    System.out.print("Enter value: ");
                    String val2 = dd.nextLine();
                    tree.putIfAbsent(key2, val2);
                    System.out.println("putIfAbsent executed");
                    break;

                case 3:
                    System.out.print("Enter key: ");
                    int key3 = dd.nextInt();
                    System.out.println("Value: " + tree.get(key3));
                    break;

                case 4:
                    System.out.print("Enter key: ");
                    int key4 = dd.nextInt();
                    tree.remove(key4);
                    System.out.println("remove(key) executed");
                    break;

                case 5:
                    System.out.print("Enter key: ");
                    int key5 = dd.nextInt();
                    dd.nextLine();
                    System.out.print("Enter value: ");
                    String val5 = dd.nextLine();
                    tree.remove(key5, val5);
                    System.out.println("remove(key, value) executed");
                    break;

                case 6:
                    System.out.print("Enter key: ");
                    int key6 = dd.nextInt();
                    System.out.println("Contains key? " + tree.containsKey(key6));
                    break;

                case 7:
                    System.out.print("Enter value: ");
                    dd.nextLine();
                    String val7 = dd.nextLine();
                    System.out.println("Contains value? " + tree.containsValue(val7));
                    break;

                case 8:
                    System.out.println("Size: " + tree.size());
                    break;

                case 9:
                    System.out.println("Is Empty? " + tree.isEmpty());
                    break;

                case 10:
                    Set<Integer> keys = tree.keySet();
                    System.out.println("Keys: " + keys);
                    break;

                case 11:
                    Collection<String> values = tree.values();
                    System.out.println("Values: " + values);
                    break;

                case 12:
                    Set<Map.Entry<Integer, String>> entries = tree.entrySet();
                    System.out.println("Entries: " + entries);
                    break;

                case 13:
                    System.out.print("Enter key: ");
                    int key13 = dd.nextInt();
                    dd.nextLine();
                    System.out.print("Enter new value: ");
                    String val13 = dd.nextLine();
                    tree.replace(key13, val13);
                    System.out.println("replace executed");
                    break;

                case 14:
                    tree.clear();
                    System.out.println("TreeMap cleared");
                    break;

                case 15:
                    System.out.println(tree.toString());
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        dd.close();
    }
}


