package practice.Merge_Two_Sorted_List;

import model.ListNode;

/**
 * <ul>
 * <li>
 * You are given the heads of two sorted linked lists {@code list1} and
 * {@code list2}.<br/>
 * Merge the two lists into one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.<br/>
 * Return the head of the merged linked list.
 * </li>
 * <li>
 * Example: <img src="img.png" alt=""/><br/>
 * {@code
 *          Input: list1 = [1,2,4], list2 = [1,3,4]
 *          Output: [1,1,2,3,4,4]
 *          }<br/>
 * {@code
 *          Input: list1 = [], list2 = []
 *          Output: []
 *          }
 * </li>
 * <li>
 * Constraints:<br/>
 * - The number of nodes in both lists is in the range [0, 50].<br/>
 * - -100 <= Node.val <= 100<br/>
 * - Both {@code list1} and {@code list2} are sorted in non-decreasing order.
 * </li>
 * </ul>
 */
public class Merge_Two_Sorted_List {
    /**
     * Idea:<br/>
     * - We compare each node of 2 lists, then return the node that its val is
     * smaller than the other.<br/>
     * - After that, we hold that larger one and compare it to the next node of the
     * returned node to find the next smaller node.<br/>
     * - Recurse until we merge all the nodes.
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // We only can solve this problem if at least 1 node is different from null
        // check nullable nodes
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        // We compare 2 nodes
        // If l1.val equals to l2.val, then we return l1 and do the recursion with the
        // next node of l2 to find the next node of l1
        // If l1.val is smaller than l2.val, then we return the smaller one and do the
        // recursion like above to find the next node of the smaller
        // Do the same as above if l1.val is larger than l2.val
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}