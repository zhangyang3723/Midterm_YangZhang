package midterm.yangzhang;

import java.util.HashSet;

public class SumOfTwoNums {
    public boolean twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        SumOfTwoNums test = new SumOfTwoNums();
        int[] a = {2, 7, 11, 15};
        System.out.println(test.twoSum(a, 9));
    }

}
