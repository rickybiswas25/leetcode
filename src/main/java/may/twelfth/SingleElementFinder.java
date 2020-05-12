package may.twelfth;

/**
 * Created by Deb
 * Date : 12/05/2020.
 *
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
 */
public class SingleElementFinder {

    public int find(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i = i +2) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
