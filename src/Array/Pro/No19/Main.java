package Array.Pro.No19;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/24 21:31
 * @Version 1.0
 *
 * 19. 删除链表的倒数第 N 个结点
 */
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0,head);
        ListNode first = head;
        ListNode second = tmp;
        for (int i = 0;i<n;i++){
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = tmp;
        return ans;
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