package linkedList;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		
	}
}
public class ReverseLinkedList {
	

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		printList(head);
		//head = reverseLinkedList(head);
		head = addNodeToEnd(head, 4);
		head = addNodeAtSpacificPosition(head, 0, 5);
		printList(head);
		

	}
	 private static Node reverseLinkedList(Node head) {
		 Node prv = null;
		 Node curr = head;
		 Node next = null;
		 while(curr != null)
		 {
//			
			 
			 next = curr.next;     // Store the next node
		        curr.next = prv;      // Reverse the current node's pointer
		        prv = curr;           // Move prv and curr one step forward
		        curr = next;
		 }
		 
		return prv;
		 
	 }
	 
	 private static void printList(Node head) {
		 Node curr = head;
		 while(curr != null) {
			 System.out.print(curr.data+" ");
			 curr = curr.next;
		 }
		 System.out.println();
		 
	 }
	 
	 private static Node  addNodeToEnd(Node head, int val) {
		 Node curr = head;
		 while(curr.next != null ) {
			 curr = curr.next;
		 }
		 
		 Node n = new Node(val);
		 curr.next = n;
		 return head;
	 }
	 
	 private static Node addNodeAtSpacificPosition(Node head,  int position, int val) {
		
		 if(position == 0)
		 {
			 Node n = new Node(val);
			 n.next = head;
			 return n;
			 
			 
		 }
		 if (head == null) {
			 Node n = new Node(val);
			 head = n;
			 return head;
		 }
		 Node curr = head;
		 while(position-->0 && curr != null) {
			 curr = curr.next;
			 
		 }
		 Node n = new Node(val);
		 n.next = curr.next;
		 curr = n;
		 
		 return head;
	 }

}
