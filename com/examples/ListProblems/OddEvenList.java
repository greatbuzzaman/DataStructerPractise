//create an odd even list from a sorted list.
package com.examples.ListProblems;

public class OddEvenList {

    public static Node oddEvenList(Node head) {
        if (head != null) {
            Node odd = head, even = head.next, evenHead = even;
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
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
       /* int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;

        System.out.println(i);*/
        Node head = new Node(1);
        head.appendAtTail(2);
        head.appendAtTail(3);
        head.appendAtTail(4);
        head.appendAtTail(5);
        head.appendAtTail(6);
        head.appendAtTail(7);
        head.appendAtTail(8);
        head.appendAtTail(9);
        printLinkList(head);
        oddEvenList(head);
        System.out.println();
        printLinkList(head);
    }

}
