package Assighment3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashtableDemo {

    public static void main(String[] args) {

        // Initial capacity = 11, load factor = 0.75
        Hashtable<Integer, String> ht = new Hashtable<>();


        // 2. Constructor with initial capacity
        Hashtable<Integer, String> ht2 = new Hashtable<>(20);


        // 3. Constructor with initial capacity and load factor
        Hashtable<Integer, String> ht3 = new Hashtable<>(20, 0.75f);


        // 4. Constructor using another Map
        Hashtable<Integer, String> ht4 = new Hashtable<>(ht);

        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {

            System.out.println("\n---- Hashtable Menu ----");
            System.out.println("Press 1 for put(key, value)");
            System.out.println("Press 2 for get(key)");
            System.out.println("Press 3 for remove(key)");
            System.out.println("Press 4 for containsKey()");
            System.out.println("Press 5 for containsValue()");
            System.out.println("Press 6 for size()");
            System.out.println("Press 7 for isEmpty()");
            System.out.println("Press 8 for keySet()");
            System.out.println("Press 9 for values()");
            System.out.println("Press 10 for entrySet()");
            System.out.println("Press 11 for clear()");
            System.out.println("Press 12 for toString()");
            System.out.println("Press 0 for Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("Enter key (int): ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter value: ");
                    String value = sc.nextLine();
                    ht.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    int k = sc.nextInt();
                    System.out.println("Value: " + ht.get(k));
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    int rk = sc.nextInt();
                    ht.remove(rk);
                    break;

                case 4:
                    System.out.print("Enter key to check: ");
                    int ck = sc.nextInt();
                    System.out.println(ht.containsKey(ck));
                    break;

                case 5:
                    System.out.print("Enter value to check: ");
                    String cv = sc.nextLine();
                    System.out.println(ht.containsValue(cv));
                    break;

                case 6:
                    System.out.println("Size: " + ht.size());
                    break;

                case 7:
                    System.out.println("Is Empty? " + ht.isEmpty());
                    break;

                case 8:
                    Set<Integer> keys = ht.keySet();
                    System.out.println("Keys: " + keys);
                    break;

                case 9:
                    System.out.println("Values: " + ht.values());
                    break;

                case 10:
                    for (Map.Entry<Integer, String> entry : ht.entrySet()) {
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                    }
                    break;

                case 11:
                    ht.clear();
                    System.out.println("Hashtable cleared");
                    break;

                case 12:
                    System.out.println(ht.toString());
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

