import java.util.LinkedList;
import java.util.Scanner;

public class ApplicationLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        printMenu();
        boolean flag = true;
        try {
            while (flag) {
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                switch (num) {
                    case 1:
                        if (linkedList.isEmpty()) {
                            System.out.println("this link list is empty");
                            printMenu();
                        } else
                            System.out.println("this not empty");
                        break;
                    case 2:
                        System.out.println("if you want continue 1 else enter 2");
                        boolean flag2 = true;
                        try {
                            while (flag2) {
                                int num2 = in.nextInt();
                                if (num2 == 1) {
                                    System.out.println("enter number");
                                    int num3 = in.nextInt();
                                    linkedList.add(num3);
                                    System.out.println("if you want continue 1 else enter 2");

                                } else if (num2 == 2) {
                                    System.out.println(linkedList);
                                    flag2 = false;
                                    printMenu();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("incorrect number");
                        }
                        break;
                    case 3:
                        System.out.println("if you want continue enter 1 else enter 2");
                        boolean flag3 = true;
                        try {
                            while (flag3) {
                                int num4 = in.nextInt();
                                if (num4 == 1) {
                                    if (!linkedList.isEmpty()) {
                                        System.out.println("what index?");
                                        int numIndex = in.nextInt();
                                        linkedList.remove(numIndex);
                                        System.out.println("index " + numIndex + " is remove" + "\n if you want continue enter 1 else enter 2");
                                    }else{
                                        System.out.println("this linked list empty");
                                        flag3 = false;
                                        printMenu();
                                    }

                                } else if (num4 == 2) {
                                    System.out.println(linkedList);
                                    flag3 = false;
                                    printMenu();
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("incorrect number");
                        }
                        break;
                    case 4:
                        System.out.println("Search for the desired number");
                        int numOfSearch = in.nextInt();
                        if (linkedList.contains(numOfSearch)) {
                            System.out.println("there is number");
                            printMenu();
                        }
                        else {
                            System.out.println("not found");
                            printMenu();
                        }
                        break;
                    case 5:
                        System.out.println("bye");
                        flag = false;
                        break;
                    default:
                        throw new RuntimeException();
                }
            }
        } catch (Exception e) {
            System.out.println("incorrect number!!!");
        }
    }

    public static void printMenu() {
        System.out.println("checked empty 1 , add to linkedlist 2 ," +
                "remove at linked list 3 , search into linked list 4 , exit 5 ");
    }
}
