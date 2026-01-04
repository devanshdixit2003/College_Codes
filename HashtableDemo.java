
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Collection;

public class HashtableDemo {

    public static void main(String[] args) {

        // 1️⃣ Default constructor
        Hashtable<Integer, String> table = new Hashtable<>();

        // 2️⃣ Initial capacity constructor
        Hashtable<Integer, String> table1 = new Hashtable<>(20);

        // 3️⃣ Initial capacity + load factor
        Hashtable<Integer, String> table2 = new Hashtable<>(20, 0.8f);

        // 4️⃣ Copy constructor (from another map)
        Hashtable<Integer, String> table3 = new Hashtable<>(table1);

        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n---- Hashtable Menu ----");
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

            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter value: ");
                    String val1 = sc.nextLine();
                    table.put(key1, val1);
                    System.out.println("put executed");
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    int key2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter value: ");
                    String val2 = sc.nextLine();
                    table.putIfAbsent(key2, val2);
                    System.out.println("putIfAbsent executed");
                    break;

                case 3:
                    System.out.print("Enter key: ");
                    int key3 = sc.nextInt();
                    System.out.println("Value: " + table.get(key3));
                    break;

                case 4:
                    System.out.print("Enter key: ");
                    int key4 = sc.nextInt();
                    table.remove(key4);
                    System.out.println("remove(key) executed");
                    break;

                case 5:
                    System.out.print("Enter key: ");
                    int key5 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter value: ");
                    String val5 = sc.nextLine();
                    table.remove(key5, val5);
                    System.out.println("remove(key, value) executed");
                    break;

                case 6:
                    System.out.print("Enter key: ");
                    int key6 = sc.nextInt();
                    System.out.println("Contains key? " + table.containsKey(key6));
                    break;

                case 7:
                    System.out.print("Enter value: ");
                    sc.nextLine();
                    String val7 = sc.nextLine();
                    System.out.println("Contains value? " + table.containsValue(val7));
                    break;

                case 8:
                    System.out.println("Size: " + table.size());
                    break;

                case 9:
                    System.out.println("Is Empty? " + table.isEmpty());
                    break;

                case 10:
                    Set<Integer> keys = table.keySet();
                    System.out.println("Keys: " + keys);
                    break;

                case 11:
                    Collection<String> values = table.values();
                    System.out.println("Values: " + values);
                    break;

                case 12:
                    Set<Map.Entry<Integer, String>> entries = table.entrySet();
                    System.out.println("Entries: " + entries);
                    break;

                case 13:
                    System.out.print("Enter key: ");
                    int key13 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new value: ");
                    String val13 = sc.nextLine();
                    table.replace(key13, val13);
                    System.out.println("replace executed");
                    break;

                case 14:
                    table.clear();
                    System.out.println("Hashtable cleared");
                    break;

                case 15:
                    System.out.println(table.toString());
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}

