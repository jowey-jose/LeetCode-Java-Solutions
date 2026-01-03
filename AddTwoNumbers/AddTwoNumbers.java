package AddTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode startingNode = new ListNode(0); // initialize a starting dummy node at 0.

        ListNode resultList = startingNode; // List inititialized to only have the starting node.
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry; // 0 + carry;

            if (l1 != null) {
                sum = sum + l1.val; // add value of the node to sum
                l1 = l1.next; // move pointer to next node
            }

            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);
            resultList.next = newNode; // create a new node with the sum.

            resultList = resultList.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(1);
            resultList.next = newNode;

            resultList = resultList.next;
        }

        return startingNode.next;
    }

    //    Printing for testing purposes on console.

    public static void main(String[] args) {
        /*
        ^ Java does NOT support array-style literals.
        * Java needs to manually build the linked list nodes.
        * Because Java prints object references unless toString() is overridden. Linked lists must be traversed node by node.”
        * */

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}