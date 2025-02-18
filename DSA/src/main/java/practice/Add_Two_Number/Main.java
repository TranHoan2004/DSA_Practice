package practice.Add_Two_Number;

/**
 * You are given two <b>non-empty</b> linked lists representing two non-negative integers.
 * The digits are stored in <b>reverse order</b>, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.<br/>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.<br/>
 * <u><b>For example:</b></u><br/>
 * <img src="img.png" alt=""><br/>
 * <ul>
 *     <li>
 *         {@code
 *          Input: l1 = [0], l2 = [0]
 *          Output: [0]
 *         }
 *     </li>
 *     <li>
 *         {@code
 *          Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 *          Output: [8,9,9,9,0,0,0,1]
 *         }
 *     </li>
 * </ul>
 * Constraints:<br/>
 * <ul>
 *     <li>The number of nodes in each linked list is in the range [1, 100].</li>
 *     <li>0 <= Node.val <= 9</li>
 *     <li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
 * </ul>
 */
public class Main {
    /**
     * Idea:<br/>
     * - We iterator 2 list if one of them are not null.<br/>
     * - Create a param {@code quotient} to hold the first digit of sum if sum is greater than 9.<br/>
     * - Create a list {@code result} to connect the result after each loop.<br/>
     * - During the loop, if {@code quotient} is still larger than 0, we add 2 val of 2 nodes and {@code quotient}, add remainder to list {@code result}.<br/>
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a pseudo-node to create the result list. This node will be remove in the final step.
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int quotient = 0; // holds the first digit of sum if it is larger than 9. Example: sum=10 => quotient=1.

        // Iterator 2 lists with the decision "quotient must be different form 0"
        // If we do not have the decision of quotient, in case l1 and l2 are null but quotient is still larger than 0, we can not summary them.
        // Example: l1: [9,9,9,9,9,9], l2: [9,9,9,9] => [8,9,9,9,0,0] (Wrong answer)
        while (l1 != null || l2 != null || quotient != 0) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + quotient;
            quotient = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            // move to next node
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        ListNode result = head.next;
        head.next = null; // remove the pseudo-node
        return result;
    }
}

class ListNode {
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
}

