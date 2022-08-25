package tool;

/**
 *链表
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/19 17:11
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
