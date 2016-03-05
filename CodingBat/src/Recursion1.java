
public class Recursion1 {
	public boolean split53(int[] nums) {
	    return helper2(0, nums, 0, 0);
	}
	 
	private boolean helper2(int start, int[] nums, int sum1, int sum2) {
	    if (start >= nums.length) return sum1 == sum2;
	    if (nums[start] % 5 == 0)
	        return helper(start + 1, nums, sum1 + nums[start], sum2);
	    if (nums[start] % 3 == 0)
	        return helper(start + 1, nums, sum1, sum2 + nums[start]);
	 
	    return helper(start + 1, nums, sum1 + nums[start], sum2)
	            || helper(start + 1, nums, sum1, sum2 + nums[start]);
	}
	
	public boolean splitOdd10(int[] nums) {
		return helper1(0, nums, 0, 0);
	}

	private boolean helper1(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length)
			return sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1 && sum2 % 10 == 0;
		return helper(start + 1, nums, sum1 + nums[start], sum2) || helper(start + 1, nums, sum1, sum2 + nums[start]);
	}

	public boolean splitArray(int[] nums) {
		return helper(0, nums, 0, 0);
	}

	private boolean helper(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length)
			return sum1 == sum2;
		return helper(start + 1, nums, sum1 + nums[start], sum2) || helper(start + 1, nums, sum1, sum2 + nums[start]);
	}

	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		int sum = nums[start];
		int count = 1;
		for (int i = start + 1; i < nums.length; i++)
			if (nums[i] == nums[start]) {
				sum += nums[i];
				count++;
			}
		return groupSumClump(start + count, nums, target - sum) || groupSumClump(start + count, nums, target);
	}

	public boolean groupSum5(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		if (nums[start] % 5 == 0) {
			if (start < nums.length - 1 && nums[start + 1] == 1)
				return groupSum5(start + 2, nums, target - nums[start]);
			return groupSum5(start + 1, nums, target - nums[start]);
		}
		return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
	}

	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
	}

	public boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		if (nums[start] == 6)
			return groupSum6(start + 1, nums, target - nums[start]);
		return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
	}

	public boolean groupSum(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;
		return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
	}

	public int strDist(String str, String sub) {
		if (str.indexOf(sub) == -1)
			return 0;
		if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub))
			return str.length();
		if (!str.substring(0, sub.length()).equals(sub))
			return strDist(str.substring(1), sub);
		// case: (!str.substring(str.length()-sub.length()).equals(sub))
		return strDist(str.substring(0, str.length() - 1), sub);
	}

	public boolean strCopies(String str, String sub, int n) {
		if (str.length() < sub.length())
			return (n <= 0);
		if (str.substring(0, sub.length()).equals(sub))
			return strCopies(str.substring(1), sub, n - 1);
		return strCopies(str.substring(1), sub, n);
	}

	public int strCount(String str, String sub) {
		if (str.length() < sub.length())
			return 0;
		if (str.substring(0, sub.length()).equals(sub))
			return 1 + strCount(str.substring(sub.length()), sub);
		return strCount(str.substring(1), sub);
	}

	public boolean nestParen(String str) {
		if (str.equals("") || str.equals("()"))
			return true;
		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
			return nestParen(str.substring(1, str.length() - 1));
		return false;
	}

	public String parenBit(String str) {
		if (!str.substring(0, 1).equals("("))
			return parenBit(str.substring(1));
		return (str.substring(0, str.indexOf(")") + 1));
	}

	public int countHi2(String str) {
		if (str.length() < 2)
			return 0;
		if (str.substring(0, 2).equals("hi"))
			return 1 + countHi2(str.substring(2));
		if (str.charAt(0) == 'x' && str.length() >= 3) {
			if (str.substring(1, 3).equals("hi"))
				return countHi2(str.substring(3));
			return countHi2(str.substring(1));
		}
		return countHi2(str.substring(1));
	}

	public String stringClean(String str) {
		if (str.length() < 2)
			return str;
		if (str.charAt(0) == str.charAt(1))
			return stringClean(str.substring(1));
		return str.charAt(0) + stringClean(str.substring(1));
	}

	public int count11(String str) {
		if (str.length() < 2)
			return 0;
		if (str.startsWith("11"))
			return 1 + count11(str.substring(2));
		return count11(str.substring(1));
	}

	public int countAbc(String str) {
		if (str.length() < 3)
			return 0;
		if (str.startsWith("abc") || str.startsWith("aba"))
			return 1 + countAbc(str.substring(1));
		return countAbc(str.substring(1));
	}

	public int countPairs(String str) {
		if (str.length() < 3)
			return 0;
		if (str.charAt(0) == str.charAt(2))
			return 1 + countPairs(str.substring(1));
		return countPairs(str.substring(1));
	}

	public String endX(String str) {
		if (str.length() < 2)
			return str;
		if (str.charAt(0) == 'x')
			return endX(str.substring(1)) + "x";
		return str.charAt(0) + endX(str.substring(1));
	}

	public String pairStar(String str) {
		if (str.length() < 2)
			return str;
		if (str.charAt(0) == str.charAt(1))
			return str.charAt(0) + "*" + pairStar(str.substring(1));
		return str.charAt(0) + pairStar(str.substring(1));
	}

	public String allStar(String str) {
		if (str.length() < 2)
			return str;
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

	public boolean array220(int[] nums, int index) {
		if (nums.length < 2)
			return false;
		if (index == nums.length - 1)
			return false;
		if (nums[index + 1] == nums[index] * 10)
			return true;
		return array220(nums, index + 1);
	}

	public int array11(int[] nums, int index) {
		if (index == nums.length)
			return 0;
		if (nums[index] == 11)
			return 1 + array11(nums, index + 1);
		return array11(nums, index + 1);
	}

	public boolean array6(int[] nums, int index) {
		if (nums.length == 0)
			return false;
		if (index == nums.length - 1)
			return nums[index] == 6;
		if (nums[index] == 6)
			return true;
		return array6(nums, index + 1);
	}

	public String noX(String str) {
		if (str.length() == 0)
			return str;
		if (str.charAt(0) == 'x')
			return "" + noX(str.substring(1));
		return str.charAt(0) + noX(str.substring(1));
	}

	public String changePi(String str) {
		if (str.length() < 2)
			return str;
		if (str.substring(0, 2).equals("pi"))
			return "3.14" + changePi(str.substring(2));
		return str.charAt(0) + changePi(str.substring(1));
	}

	public String changeXY(String str) {
		if (str.length() == 0)
			return "";
		if (str.charAt(0) == 'x')
			return "y" + changeXY(str.substring(1));
		return str.charAt(0) + changeXY(str.substring(1));
	}

	public int countHi(String str) {
		if (str.length() < 2)
			return 0;
		if (str.startsWith("hi"))
			return 1 + countHi(str.substring(1));
		return countHi(str.substring(1));
	}

	public int countX(String str) {
		if (str.length() == 0)
			return 0;
		if (str.charAt(0) == 'x')
			return 1 + countX(str.substring(1));
		return countX(str.substring(1));
	}

	public int powerN(int base, int n) {
		if (n == 0)
			return 1;
		if (base == 0)
			return 0;

		return powerN(base, n - 1) * base;

	}

	public int count8(int n) {
		if (n == 0)
			return 0;
		System.out.println(n % 10 + " " + n % 100);
		if (n % 10 == 8 && n % 100 >= 80 && n % 100 < 90)
			return count8(n / 10) + 2;
		if (n % 10 == 8 && (n % 100 < 80 || n % 100 >= 90))
			return count8(n / 10) + 1;
		return count8(n / 10);
	}

	public int count7(int n) {
		if (n == 0)
			return 0;
		if (n % 10 == 7)
			return count7(n / 10) + 1;
		return count7(n / 10);
	}

	public int sumDigits(int n) {
		if (n == 0)
			return 0;
		return sumDigits(n / 10) + n % 10;
	}

	public int triangle(int rows) {
		if (rows == 0)
			return 0;
		return triangle(rows - 1) + rows;
	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0)
			return 0;
		if (bunnies % 2 == 0)
			return bunnyEars2(bunnies - 1) + 3;
		return bunnyEars2(bunnies - 1) + 2;
	}

	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int bunnyEars(int bunnies) {
		System.out.println(bunnies);
		if (bunnies == 0)
			return 0;
		return bunnyEars(bunnies - 1) + 2;
	}

	public int factorial(int n) {
		System.out.println("n: " + n);
		if (n == 1)
			return 1;
		return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion1 r = new Recursion1();
		System.out.println(r.stringClean("xaxi111abcchiabax"));
	}

}
