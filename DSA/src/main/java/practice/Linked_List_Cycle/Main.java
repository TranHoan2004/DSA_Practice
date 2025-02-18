package practice.Linked_List_Cycle;

import model.ListNode;

/**
 * <img src="first.png" alt=""><br/>
 * <img src="second.png" alt="">
 */
public class Main {
    /**
     * <b>Idea</b>
     * We use the "tortoise and hare algorithm" or "Floyd's Cycle Algorithm"<br/>
     * Use 2 pointers go from the same position, one moves faster than the other. In the while loop, if 2 pointers meet each other, there is a cycle of linked list
     */
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;

            if (first == second) {
                return true;
            }
        }
        return false;
    }
}
