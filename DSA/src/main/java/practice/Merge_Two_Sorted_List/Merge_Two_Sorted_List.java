package practice;

public class Merge_Two_Sorted_List {
    /**
     * You are given the heads of two sorted linked lists {@code list1} and {@code list2}.<br/>
     * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.<br/>
     * Return the head of the merged linked list.
     * <ul>
     *     <li>
     *          You are given the heads of two sorted linked lists {@code list1} and {@code list2}.<br/>
     *          Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.<br/>
     *          Return the head of the merged linked list.
     *      </li>
     *      <li>
     *          Example: <img src="" alt=""/><br/>
     *          {@code
     *          Input: list1 = [1,2,4], list2 = [1,3,4]<br/>
     *          Output: [1,1,2,3,4,4]
     *          }<br/>
     *          {@code
     *          Input: list1 = [], list2 = []<br/>
     *          Output: []
     *          }
     *      </li>
     *      <li>
     *          Constraints:<br/>
     *          - The number of nodes in both lists is in the range [0, 50].<br/>
     *          - -100 <= Node.val <= 100<br/>
     *          - Both {@code list1} and {@code list2} are sorted in non-decreasing order.
     *      </li>
     * </ul>
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return l1;
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
