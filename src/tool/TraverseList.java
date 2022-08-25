package tool;

/**
 *遍历链表
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/25 10:30
 */
public class TraverseList {

    public void traverseList(ListNode head){
        System.out.println(head.val);
        if(head.next != null){
            head = head.next;
            traverseList(head);
        }
    }
}
