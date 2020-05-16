package may.sixteenthday;

/**
 * Created by Deb
 * Date : 16/05/2020.
 *
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 */
public class EvenOddLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = head;
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        ListNode connectNode = head.next;

        while (secondNode != null) {
            ListNode t = secondNode.next;
            if (t == null) {
                break;
            }

            firstNode.next = secondNode.next;
            firstNode = firstNode.next;

            secondNode.next = firstNode.next;
            secondNode = secondNode.next;
        }

        firstNode.next = connectNode;

        return result;
    }
}
