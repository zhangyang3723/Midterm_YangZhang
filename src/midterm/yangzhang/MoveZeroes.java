package midterm.yangzhang;

public class MoveZeroes {
	public int[] moveZeroes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		while (count < nums.length) {
			nums[count++] = 0;
		}
		return nums;
	}

	public static void main(String[] args) {
		MoveZeroes test = new MoveZeroes();
		int[] a = { 1, 0, 0, 0, 0, 12 };
		int[] b = test.moveZeroes(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
