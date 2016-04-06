//Find an element in a LinkedList
package com.examples.ListProblems;

public class ListProbs {

    // Java program to find middle element of linked list in one pass
    public void findMiddle(Node head) {
        Node current = head;
        Node middle = head;
        int length = 0;
        /*
         * if (head.next == null) { length = 1; } else {
         */
        while (current.next != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next;
            }
            current = current.next;
        }
        if (length % 2 == 1) {
            middle = middle.next;
        }
        System.out.println("Length of linkedlist :" + length);
        System.out.println("Middle node :" + middle.data);
    }

    public void thrdEleFrmLast(Node head) {
        Node current = head;
        Node thrd = head;
        int length = 0;
        while (current.next != null) {
           ++length;
            if (length % 3 == 0) {
                thrd = thrd.next;
                System.out.println(length+" "+thrd.data);
            }
            current = current.next;
        }
        if (length % 3 == 1) {
            thrd = thrd.next;
        }
        System.out.println("Length of linkedlist :" + ++length);
        System.out.println("Third node :" + thrd.data);
        System.out.println("Current node :" + current.data);
    }

    public static void printLinkList(Node head) {
        Node n = head;
        if (n == null) {
            System.out.println("Nothing there");
        }
        System.out.print("List : "); 
        while (n != null) {
            System.out.print(" " + n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ListProbs lp = new ListProbs();
        Node head = new Node(11);
        head.appendAtTail(4);
        head.appendAtTail(12);
        head.appendAtTail(3);
        head.appendAtTail(6);
        head.appendAtTail(3);
        head.appendAtTail(6);
        head.appendAtTail(7);
        head.appendAtTail(9);
        printLinkList(head);
        System.out.println();
        // lp.findMiddle(head);
        lp.thrdEleFrmLast(head);
    }

}
