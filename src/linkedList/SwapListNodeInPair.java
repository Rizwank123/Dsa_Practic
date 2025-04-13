package linkedList;

public class SwapListNodeInPair {
    
    static class Node { // Make Node static
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node swapPairs(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            Node first = curr.next;
            Node second = curr.next.next;
            first.next = second.next;
            second.next = first;
            curr.next = second;
            curr = first;
        }
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        Node list1 = createLinkedList(arr1);
        System.out.println("Original list:");
        printLinkedList(list1);

        Node swappedList1 = swapPairs(list1);
        System.out.println("Swapped list:");
        printLinkedList(swappedList1);
    }
    
    public static Node createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        
        return head;
    }

    // Helper function to print a linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}