// IntList.java
// Updated 2/2024

// Simple List implementation using a linked list of IntNode.java nodes
// Contains a sample of List methods, and
// you can build on this class to add more functionality.

import java.util.Scanner;

public class IntList {
  
    // the default constructor is all we need for now

    private IntNode start = null;  // empty list to start

    public void addToStart(int n) {
        start = new IntNode(n, start);
    }
  
    public void addToEnd(int n) {
        IntNode ptr = start;
        if (start == null)
          start = new IntNode(n, null);
        else {
          while (ptr.getNext() != null)
              ptr = ptr.getNext();
          ptr.setNext(new IntNode(n, null));
        }
    }

    public void addSorted(int n) {}  // write this one!

    public void display() {
        IntNode index = start;
        while (index != null) {
            System.out.println(index.toString());
            index = index.getNext();
        }
    }

    // What would a toString() method be for an IntList?
    // What does it mean for two IntLists to be equal?

    public static void main(String[] args) {  // let's test IntList out

        Scanner s = new Scanner(System.in);

        System.out.println("\nLet's build a List of ints!");

        IntList myIntList = new IntList();

        System.out.print("> Enter an integer (^d to quit): ");
        while (s.hasNextInt()) {
            myIntList.addToStart(s.nextInt());
            System.out.print("> Next integer (^d to quit): ");
        } 

        System.out.println("\n\nYour List follows:");
        myIntList.display();
 
        System.out.println("\nI will add 99999 to the end of the list");
        myIntList.addToEnd(99999);
        System.out.println("\nThe list now looks like this:");
        myIntList.display();
        
    }
} 
