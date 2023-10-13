class ListNode {
int val;
ListNode next;
ListNode(int val) {
this.val = val;
}
}
public class RotateLinkedList {
public static ListNode rotateRight(ListNode head, int k) {
if (head == null || head.next == null || k == 0) {
return head;
}
int length = 1;
ListNode current = head;
while (current.next != null) {
current = current.next;
length++;
}
int steps = length - k % length;
if (steps == length) {
return head; // No rotation needed
}
current.next = head; // Make it a circular linked list
for (int i = 0; i < steps; i++) {
current = current.next;
}
ListNode newHead = current.next;
current.next = null; // Set the new tail
return newHead;
}
public static void printList(ListNode head) {
while (head != null) {
System.out.print(head.val + " -> ");
head = head.next;
}
System.out.println("NULL");
}
public static void main(String[] args) {
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next = new ListNode(4);
head.next.next.next.next = new ListNode(5);
int k = 2;
System.out.println("Original List:");
printList(head);
head = rotateRight(head, k);
System.out.println("List after rotating by " + k + " places:");
printList(head);
}
}