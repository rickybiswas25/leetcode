package may.seventhday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.Tree;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Deb
 * Date : 07/05/2020.
 */
public class BinaryTreeCousinFinderUnitTest {
    private BinaryTreeCousinFinder finder;

    @BeforeEach
    void init() {
        this.finder = new BinaryTreeCousinFinder();
    }

    @Test
    void testCousinFinder1() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        assertThat(this.finder.isCousins(node, 4, 3))
                .isFalse();
    }

    @Test
    void testCousinFinder2() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.right = new TreeNode(5);
        assertThat(this.finder.isCousins(node, 5, 4))
                .isTrue();
    }
}
