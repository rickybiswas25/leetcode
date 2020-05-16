package may.sixteenthday;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
               "val=" + val +
               '}';
    }

    public void insert(int val) {
        if (this.next == null) {
            this.next = new ListNode(val);
        } else {
            ListNode currentNode = next;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new ListNode(val);

        }
    }

    public void print() {
        ListNode currentNode = this;
        while (currentNode != null) {
            System.out.println(currentNode.val + "->");
            currentNode = currentNode.next;
        }
    }
}
