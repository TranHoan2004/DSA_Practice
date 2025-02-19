package practice.linkedlist.Remove_Duplicates_From_Sorted_List;

import model.ListNode;

/**
 * Given the {@code head} of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list <b>sorted</b> as well.<br/>
 * <img src="removeDuplicatesFromSortedList.png" alt=""><br/>
 * <img src="removeDuplicatesFromSortedList1.png" alt=""><br/>
 * <b>Constraints</b><br/>
 * <ul>
 *     <li>The number of nodes in the list is in the range [0, 300].</li>
 *     <li>-100 <= Node.val <= 100</li>
 *     <li>The list is guaranteed to be sorted in ascending order.</li>
 * </ul>
 */
public class Main {
    /**
     * <b>Idea</b>:
     * We use loop to iterator the list. If the current node's val equals to the next node's val, link the current node to the second next node.
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tail = head;
        while (tail.next != null) {
            ListNode nextNode = tail.next;
            if (nextNode.val == tail.val) {
                tail.next = nextNode.next;
                nextNode.next = null;
            } else {
                tail = tail.next;
            }
        }
        return head;
    }
}
