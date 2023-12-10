import org.example.Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
/*
 * @Description:
 * 颜色分类
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * 示例 1：
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 */
/*
    Test Strategy
    先进行红白蓝，红蓝白，蓝白红，蓝红白，白红蓝，白蓝红的初始顺序排列测试
    再进行多个球的测试
*/
public class L2021111704_13_Test {
    @Test
    public void Solution13Test()
    {
        Solution solution = new Solution();
        int nums1[] = {2,1,0};
        int nums2[] = {1,2,0};
        int nums3[] = {2,0,1};
        int nums4[] = {1,0,2};
        int nums5[] = {0,1,2};
        int nums6[] = {0,2,1};
        int nums7[] = {1,2,1,0,2,2,1,0,2,0,0,1};
        solution.sortColors(nums1);
        solution.sortColors(nums2);
        solution.sortColors(nums3);
        solution.sortColors(nums4);
        solution.sortColors(nums5);
        solution.sortColors(nums6);
        solution.sortColors(nums7);
        int expectnums1[] = {0,1,2};
        int expectnums7[] = {0,0,0,0,1,1,1,1,2,2,2,2};
        assertArrayEquals(expectnums1,nums1);
        assertArrayEquals(expectnums1,nums2);
        assertArrayEquals(expectnums1,nums3);
        assertArrayEquals(expectnums1,nums4);
        assertArrayEquals(expectnums1,nums5);
        assertArrayEquals(expectnums1,nums6);
        assertArrayEquals(expectnums7,nums7);
    }
}
