package may.seventhday;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Deb
 * Date : 07/05/2020.
 */
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
