package solution;

import tool.ListNode;

/**
 *147. 对链表进行插入排序
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/22 10:00
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted = head, curr = head.next;
        while (curr != null){
            if(lastSorted.val <= curr.val){
                lastSorted = lastSorted.next;
            }else {
                ListNode prev = dummyHead;
                while (prev.next.val <= curr.val){
                    prev = prev.next;
                }
                lastSorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }
            curr = lastSorted.next;
        }
        return dummyHead.next;
    }

}
