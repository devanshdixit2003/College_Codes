package Assignment_1and2;

import java.util.Scanner;
public class String_Methods_Use {
	public static void main(String[] args) {
	Scanner dd = new Scanner(System.in);
	System.out.println("Enter String");
	String str = dd.nextLine();

	int choice =-1;
	while(choice!=0) {
		 
		System.out.println("\n--- STRING OPERATIONS MENU ---");
        System.out.println("1. length()");
        System.out.println("2. isEmpty()");
        System.out.println("3. charAt()");
        System.out.println("4. toString()");
        System.out.println("5. equals()");
        System.out.println("6. compareTo()");
        System.out.println("7. contains()");
        System.out.println("8. indexOf()");
        System.out.println("9. lastIndexOf()");
        System.out.println("10. startsWith()");
        System.out.println("11. endsWith()");
        System.out.println("12. matches()");
        System.out.println("13. substring()");
        System.out.println("14. toLowerCase()");
        System.out.println("15. trim()");
        System.out.println("16. replace()");
        System.out.println("17. split()");
        System.out.println("18. join()");
        System.out.println("19. valueOf()");
        System.out.print("\nEnter your choice: ");
        choice = dd.nextInt();
 switch(choice) {
    case 1:
        System.out.println("Length: " + str.length());
        break;

    case 2:
        System.out.println("Is Empty: " + str.isEmpty());
        break;

    case 3:
        System.out.print("Enter index: ");
        int index = dd.nextInt();
        System.out.println("Character: " + str.charAt(index));
        break;

    case 4:
        System.out.println("toString(): " + str.toString());
        break;

    case 5:
        System.out.print("Enter another string: ");
        String s1 = dd.nextLine();
        System.out.println("Equals: " + str.equals(s1));
        break;

    case 6:
        System.out.print("Enter another string: ");
        String s2 = dd.nextLine();
        System.out.println("compareTo: " + str.compareTo(s2));
        break;

    case 7:
        System.out.print("Enter substring: ");
        String sub = dd.nextLine();
        System.out.println("Contains: " + str.contains(sub));
        break;

    case 8:
        System.out.print("Enter character/string: ");
        String ch = dd.nextLine();
        System.out.println("IndexOf: " + str.indexOf(ch));
        break;

    case 9:
        System.out.print("Enter character/string: ");
        String ch2 = dd.nextLine();
        System.out.println("LastIndexOf: " + str.lastIndexOf(ch2));
        break;

    case 10:
        System.out.print("Enter prefix: ");
        String pre = dd.nextLine();
        System.out.println("StartsWith: " + str.startsWith(pre));
        break;

    case 11:
        System.out.print("Enter suffix: ");
        String suf = dd.nextLine();
        System.out.println("EndsWith: " + str.endsWith(suf));
        break;

    case 12:
        System.out.print("Enter regex: ");
        String regex = dd.nextLine();
        System.out.println("Matches: " + str.matches(regex));
        break;

    case 13:
        System.out.print("Enter start index: ");
        int start = dd.nextInt();
        System.out.print("Enter end index: ");
        int end = dd.nextInt();
        System.out.println("Substring: " + str.substring(start, end));
        break;

    case 14:
        System.out.println("Lowercase: " + str.toLowerCase());
        break;

    case 15:
        System.out.println("Trimmed String: '" + str.trim() + "'");
        break;

    case 16:
        System.out.print("Enter old character/string: ");
        String oldStr = dd.nextLine();
        System.out.print("Enter new character/string: ");
        String newStr = dd.nextLine();
        System.out.println("Replaced String: " + str.replace(oldStr, newStr));
        break;

    case 17:
        System.out.print("Enter delimiter: ");
        String del = dd.nextLine();
        String[] parts = str.split(del);
        System.out.println("Split Result:");
        for (String part : parts) {
            System.out.println(part);
        }
        break;

    case 18:
        System.out.print("Enter delimiter: ");
        String delimiter = dd.nextLine();
        System.out.print("Enter second string: ");
        String s3 = dd.nextLine();
        System.out.println("Joined String: " + String.join(delimiter, str, s3));
        break;

    case 19:
        int num = 100;
        String value = String.valueOf(num);
        System.out.println("valueOf(): " + value);
        break;

    default:
        System.out.println("Invalid choice!");
        break;
    
    case 0: 
    	System.out.println("Program execute successfully");
    	dd.close() ;
    	return ;

 }
 try {
	    Thread.sleep(10000); // 10 seconds
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	}
	

	}


}
