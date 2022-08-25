package solution;

import tool.ListNode;

/**
 *148. 排序链表
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/22 9:50
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    public ListNode sortList(ListNode head, ListNode tail){
        if(head == null){
            return head;
        }
        if(head.next == tail){
            head.next = null;
            return head;
        }
        ListNode fast = head, slow = head;
        while (fast != tail){
            fast = fast.next;
            slow = slow.next;
            if(fast != tail){
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        ListNode sorted = mergeTwoLists(list1, list2);
        return sorted;
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode prev = dummyHead;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                dummyHead.next = list1;
                list1 = list1.next;
            }else {
                dummyHead.next = list2;
                list2 = list2.next;
            }
            dummyHead = dummyHead.next;
        }
        if(list1 != null){
            dummyHead.next = list1;
        }
        if(list2 != null){
            dummyHead.next = list2;
        }
        return prev.next;
    }
}
