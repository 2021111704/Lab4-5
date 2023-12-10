import org.example.Solution;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class L2021111704_13_Test {
    @Test
            public void solution13test()
    {
        int nums[] = {2,0,2,1,1,0};
        Solution a = new Solution();
        a.sortColors(nums);
        int expect[] = {0,0,1,1,2,2};
        assertTrue(Arrays.equals(expect, nums));
    }
}
