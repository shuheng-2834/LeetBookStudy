package Array.Pro.No206;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/26 21:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        //前指针节点
        ListNode prev = null;
        //当前指针节点
        ListNode curr = head;
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            //临时节点，暂存当前节点的下一节点，用于后移
            ListNode nextTemp = curr.next;
            //将当前节点指向它前面的节点
            curr.next = prev;
            //前指针后移
            prev = curr;
            //当前指针后移
            curr = nextTemp;
        }
        return prev;
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
