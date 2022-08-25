package main;

import solution.*;
import tool.*;

import java.awt.*;

/**
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/16 9:50
 */
public class TrainingCampSecondDay {
    public static void main(String[] args) {

        ListNode listNode4 = new ListNode(4);
        ListNode listNode4a = new ListNode(4);
        ListNode listNode3 = new ListNode(7);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode1 = new ListNode(-9, listNode2);
        ListNode listNode1a = new ListNode(5, listNode3);
        ListNode listNodeNull = new ListNode();
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        TraverseList traverseList = new TraverseList();
        traverseList.traverseList(listNode1);
        traverseList.traverseList(listNode1a);
        traverseList.traverseList(mergeTwoLists.mergeTwoLists(listNode1, listNode1a));
    }
}
