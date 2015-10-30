package midterm.yang.zhang;

public class FizzBuzz {
	public String printFizzBuzz(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "fizz buzz";
		} else if (n % 3 == 0) {
			return "fizz";
		} else if (n % 5 == 0) {
			return "buzz";
		}
		return null;
	}

	public static void main(String[] args) {
		FizzBuzz test = new FizzBuzz();
		System.out.println(test.printFizzBuzz(15));
	}
}
