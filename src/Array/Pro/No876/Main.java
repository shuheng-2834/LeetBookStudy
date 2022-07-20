package Array.Pro.No876;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/20 17:03
 * @Version 1.0
 *
 * 876. 链表的中间结点
 */
public class Main {
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode low = head,fast = head;
        while (fast.next != null && fast != null){
            fast = fast.next.next;
            low = low.next;
        }
        return low;
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
