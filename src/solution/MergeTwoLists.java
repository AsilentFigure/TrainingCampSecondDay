package solution;

import tool.ListNode;

/**
 *21. 合并两个有序链表
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/25 10:18
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode prev = dummyHead;
        ListNode prev1 = list1;
        ListNode prev2 = list2;
        while (prev1 != null && prev2 != null){
            if(prev1.val <= prev2.val){
                dummyHead.next = prev1;
                prev1 = prev1.next;
            }else {
                dummyHead.next = prev2;
                prev2 = prev2.next;
            }
            dummyHead = dummyHead.next;
        }
        while (prev1 != null){
            dummyHead.next = prev1;
            prev1 = prev1.next;
            dummyHead = dummyHead.next;
        }
        while (prev2 != null){
            dummyHead.next = prev2;
            prev2 = prev2.next;
            dummyHead = dummyHead.next;
        }
        return prev.next;
    }
}
