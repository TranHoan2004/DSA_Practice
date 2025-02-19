package practice.linkedlist.Intersection_Of_2_Linked_List;

import model.ListNode;

/**
 * <img src="intersection.png" alt=""><br/>
 * <img src="ex1.png" alt=""><br/>
 * <img src="ex2.png" alt=""><br/>
 * <img src="footer.png" alt="">
 */
public class Main {
    // runtime 284ms
    /**
     * <b>Idea</b>
     * We iterator 2 lists but do not stop. If the pointer comes to the null node, it will stay here and be back to the head.
     * Like "tortoise and hare algorithm", 2 pointers will meet each other in somewhere. It is the intersection node.
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return null;
        }
        ListNode tailA = headA;
        ListNode tailB = headB;
        while (tailA != tailB) {
            tailA = tailA == null ? headA : tailA.next;
            tailB = tailB == null ? headB : tailB.next;
        }
        return tailA;
    }

    // runtime 1ms

    /**
     * <b>Idea</b>
     * If 2 lists have intersection node, means they will point to the same node, so we only need to check if node of A equals to node of B<br/>
     * But 2 lists may have different sizes, so we check from the head nodes which have the number of iterators of 2 lists are the same
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return null;
        }
        int ac = 0; // The size of listA
        int bc = 0; // The size of listB
        ListNode tailA = headA;
        ListNode tailB = headB;
        while (tailA != null) {
            ac++;
            tailA = tailA.next;
        }
        while (tailB != null) {
            bc++;
            tailB = tailB.next;
        }
        tailA = headA;
        tailB = headB;
        // Find the node that if we come from here, 2 sizes of 2 lists are the same
        while (ac > bc) {
            ac--;
            tailA = tailA.next;
        }
        while (ac < bc) {
            bc--;
            tailB = tailB.next;
        }
        while (tailA != tailB) {
            tailA = tailA.next;
            tailB = tailB.next;
        }
        return tailA;
    }
}
