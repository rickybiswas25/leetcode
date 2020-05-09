package may.seventhday;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deb
 * Date : 07/05/2020.
 *
 *
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 *
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 *
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 *
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 * */
public class BinaryTreeCousinFinder {
    private TreeNode previousNode = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        Map<Integer, String> map = new HashMap<>();
        collectInformation(root, map, x, y, 0);
        String xInfo = map.get(x);
        String yInfo = map.get(y);
        String[] xInfoList = xInfo.split("\\|");
        String[] yInfoList = yInfo.split("\\|");
        return !xInfoList[0].equalsIgnoreCase(yInfoList[0]) && xInfoList[1].equalsIgnoreCase(yInfoList[1]);
    }

    void collectInformation(TreeNode node, Map<Integer, String> map, Integer x, Integer y, int level) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        if ((node.left != null && node.left.val == x) || (node.right != null && node.right.val == x)) {
            map.putIfAbsent(x, node.val + "");
        } if ((node.left != null && node.left.val == y) || (node.right != null && node.right.val == y)) {
            map.putIfAbsent(y, node.val + "");
        }
        if (node.val == x) {
            map.put(x, map.get(x) + "|" + level);
        } else if (node.val == y) {
            map.put(y, map.get(y) + "|" + level);
        }

        /* then recur on left subtree */
        collectInformation(node.left, map, x, y, level + 1);

        /* now recur on right subtree */
        collectInformation(node.right, map, x, y, level + 1);
        previousNode = node;
    }
}
