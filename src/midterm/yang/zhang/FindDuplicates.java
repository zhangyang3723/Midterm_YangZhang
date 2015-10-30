package midterm.yang.zhang;

import java.util.HashSet;

public class FindDuplicates {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			else {
				set.add(nums[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		FindDuplicates test = new FindDuplicates();
		int[] a = { 2, 3, 4, 5, 6, 6 };
		System.out.println(test.containsDuplicate(a));
	}
}
