package Assighment3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayList_Program {

	public static void main(String[] args) {
	
		//Default initial capacity(10) allocate on first add element
		ArrayList<String> list = new ArrayList<String>();
    
	//	Initial capacity specified by compile time
	  ArrayList<String> list1 = new ArrayList<String>(15);
	  
	  //  Constructor: ArrayList(Collection c)
		ArrayList<String> list2 = new ArrayList<String>(list1);
		
	Scanner dd = new Scanner(System.in);
	int choice =-1;
	while( choice !=0) {
		System.out.println("---- ArrayList Menu ----");
		System.out.println("Press 1 for add(index, element)");
		System.out.println("Press 2 for add()");
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
        System.out.println("Enter choice to perform action");
        choice = dd.nextInt();
        
        switch (choice) {

        case 1:
            System.out.print("Enter index: ");
            int index = dd.nextInt();
            dd.nextLine();
            System.out.print("Enter element: ");
            String element = dd.nextLine();
            list.add(index, element);
            break;

        case 2:
            System.out.println("Enter element to add");
            String s = dd.next();
            list.add(s);
            System.out.println("addAll executed");
            break;

        case 3:
            System.out.print("Enter index: ");
            int i = dd.nextInt();
            System.out.println("Element: " + list.get(i));
            break;

        case 4:
            System.out.print("Enter index: ");
            int idx = dd.nextInt();
            dd.nextLine();
            System.out.print("Enter new element: ");
            String newElement = dd.nextLine();
            list.set(idx, newElement);
            break;

        case 5:
            System.out.println("Size: " + list.size());
            break;

        case 6:
            System.out.print("Enter element to check: ");
            String check = dd.nextLine();
            System.out.println(list.contains(check));
            break;

        case 7:
            System.out.print("Enter element: ");
            String el = dd.nextLine();
            System.out.println("Index: " + list.indexOf(el));
            break;

        case 8:
            System.out.println("Is Empty? " + list.isEmpty());
            break;

        case 9:
            System.out.print("Enter element to remove: ");
            String rem = dd.nextLine();
            list.remove(rem);
            break;

        case 10:
            System.out.print("Enter index to remove: ");
            int r = dd.nextInt();
            list.remove(r);
            break;

        case 11:
            Iterator<String> itr = list.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            break;

        case 12:
            Collections.sort(list);
            System.out.println("List sorted");
            break;

        case 13:
            list.clear();
            System.out.println("List cleared");
            break;

        case 14:
            System.out.println(list.toString());
            break;

        case 15:
            System.out.println("Exit");
            break;

        default:
            System.out.println("Invalid choice!");
    }
        
	
	}
	
	
	}

}

