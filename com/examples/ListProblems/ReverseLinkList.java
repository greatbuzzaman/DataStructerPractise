package com.examples.ListProblems;

public class ReverseLinkList {

    public static void printLinkList(Node head) {
        Node n = head;
        if (n == null) {
            System.out.println("Nothing there");
        }
        while (n != null) {
            System.out.print(" " + n.data);
            n = n.next;
        }
    }

    public static void reverseLinkListIter(Node head) {
        Node t1;
        if (head == null || head.next == null) {
            return;
        }
        t1 = head.next;
        Node t2 = t1.next;
        t1.next = head;
        head.next = null;
        if (t2 == null)
            return;
        Node CurrentNode = t2;
        Node PreviousNode = t1;

        while (CurrentNode != null) {
            Node NextNode = CurrentNode.next;
            CurrentNode.next = PreviousNode;
            PreviousNode = CurrentNode;
            CurrentNode = NextNode;
        }

        head = PreviousNode; // reset the head node
        while (head!= null) {
            System.out.print(" " + head.data);
            head= head.next;
        }
    }
    
    public static void rvrseLinkListrecur(Node currNode){
        if(currNode == null)
            return;
        if(currNode.next == null) 
        { 
        //set HEAD to current TAIL since we are reversing list
       // head = currNode; 
        return; //since this is the base case
        }
        rvrseLinkListrecur(currNode.next);
        currNode.next.next = currNode;
        currNode.next = null; //set "old" next pointer to NULL
    }

    public static void main(String[] args) {
        Node head = new Node(11);
        head.appendAtTail(4);
        head.appendAtTail(12);
        head.appendAtTail(3);
        head.appendAtTail(6);
        printLinkList(head);
        System.out.println();
        reverseLinkListIter(head);

    }

}
