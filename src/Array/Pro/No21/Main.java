package Array.Pro.No21;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/15 14:34
 * @Version 1.0
 *
 * 21. 合并两个有序链表
 */
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode list = list1.val < list2.val ? list1 : list2;
        list.next = mergeTwoLists(list.next, list.val >= list2.val ? list1 : list2);
        return list;
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
