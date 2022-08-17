package solution;

import tool.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 *1305. 两棵二叉搜索树中的所有元素
 * @author ASilentFigure
 * @project TrainingCampSecondDay
 * @date 2022/8/17 11:09
 */
public class GetAllElements {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        InorderTraversal(root1, list1);
        InorderTraversal(root2, list2);
        List<Integer> resultList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<list1.size() || j < list2.size()){
            if(i==list1.size()){
                resultList.addAll(list2.subList(j, list2.size()));
                break;
            }else if(j == list2.size()){
                resultList.addAll(list1.subList(i, list1.size()));
                break;
            }else if(list1.get(i) <= list2.get(j)){
                resultList.add(list1.get(i));
                i++;
            }else {
                resultList.add(list2.get(j));
                j++;
            }
        }
        return resultList;
    }

    private void preOrderTraversal(TreeNode treeNode, List<Integer> list){
        if(null == treeNode){
            return;
        }
        list.add(treeNode.val);
        preOrderTraversal(treeNode.left, list);
        preOrderTraversal(treeNode.right, list);
    }

    private void InorderTraversal(TreeNode treeNode, List<Integer> list){
        if(null == treeNode){
            return;
        }
        InorderTraversal(treeNode.left, list);
        list.add(treeNode.val);
        InorderTraversal(treeNode.right, list);
    }
}
