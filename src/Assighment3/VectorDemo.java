package Assighment3;


import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // Default constructor (initial capacity 10)
        Vector<String> vec = new Vector<String>();

        // Initial capacity specified
        Vector<String> vec1 = new Vector<String>(15);

        // Constructor using another collection
        Vector<String> vec2 = new Vector<String>(vec1);

        Scanner dd = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {

            System.out.println("\n---- Vector Menu ----");
            System.out.println("Press 1 for add(index, element)");
            System.out.println("Press 2 for add(element)");
            System.out.println("Press 3 for get()");
            System.out.println("Press 4 for set()");
            System.out.println("Press 5 for size()");
            System.out.println("Press 6 for contains()");
            System.out.println("Press 7 for indexOf()");
            System.out.println("Press 8 for isEmpty()");
            System.out.println("Press 9 for remove(Object)");
            System.out.println("Press 10 for remove(index)");
            System.out.println("Press 11 for iterator()");
            System.out.println("Press 12 for sort()");
            System.out.println("Press 13 for clear()");
            System.out.println("Press 14 for toString()");
            System.out.println("Press 0 for Exit");
            System.out.print("Enter choice: ");

            choice = dd.nextInt();
            dd.nextLine(); // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("Enter index: ");
                    int index = dd.nextInt();
                    dd.nextLine();
                    System.out.print("Enter element: ");
                    String element = dd.nextLine();
                    vec.add(index, element);
                    break;

                case 2:
                    System.out.print("Enter element: ");
                    String s = dd.nextLine();
                    vec.add(s);
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int i = dd.nextInt();
                    System.out.println("Element: " + vec.get(i));
                    break;

                case 4:
                    System.out.print("Enter index: ");
                    int idx = dd.nextInt();
                    dd.nextLine();
                    System.out.print("Enter new element: ");
                    String newElement = dd.nextLine();
                    vec.set(idx, newElement);
                    break;

                case 5:
                    System.out.println("Size: " + vec.size());
                    break;

                case 6:
                    System.out.print("Enter element to check: ");
                    String check = dd.nextLine();
                    System.out.println(vec.contains(check));
                    break;

                case 7:
                    System.out.print("Enter element: ");
                    String el = dd.nextLine();
                    System.out.println("Index: " + vec.indexOf(el));
                    break;

                case 8:
                    System.out.println("Is Empty? " + vec.isEmpty());
                    break;

                case 9:
                    System.out.print("Enter element to remove: ");
                    String rem = dd.nextLine();
                    vec.remove(rem);
                    break;

                case 10:
                    System.out.print("Enter index to remove: ");
                    int r = dd.nextInt();
                    vec.remove(r);
                    break;

                case 11:
                    Iterator<String> itr = vec.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 12:
                    Collections.sort(vec);
                    System.out.println("Vector sorted");
                    break;

                case 13:
                    vec.clear();
                    System.out.println("Vector cleared");
                    break;

                case 14:
                    System.out.println(vec.toString());
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

        
      


