
//import java.util.Arrays;

public class Array2 {

	public String[] fizzBuzz(int start, int end) {
		int len = end - start;
		String[] fb = new String[len];
		for (int i = start; i < end; i++) {
			int index = i - start;
			if (i % 3 == 0 && i % 5 == 0)
				fb[index] = "FizzBuzz";
			if (i % 3 == 0 && i % 5 != 0)
				fb[index] = "Fizz";
			if (i % 3 != 0 && i % 5 == 0)
				fb[index] = "Buzz";
			if (i % 3 != 0 && i % 5 != 0)
				fb[index] = String.valueOf(i);
		}
		return fb;
	}

	public int[] evenOdd(int[] nums) {
		int countE = 0;
		int countO = nums.length - 1;
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				array[countE] = nums[i];
				countE++;
			} else {
				array[countO] = nums[i];
				countO--;
			}
		}
		return array;
	}

	public int[] zeroMax(int[] nums) {
		int largestOdd = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 == 1 && nums[i] > largestOdd)
				largestOdd = nums[i];
			if (nums[i] == 0)
				nums[i] = largestOdd;
		}
		return nums;
	}

	public int[] withoutTen(int[] nums) {
		int[] newArray = new int[nums.length];
		int countStart = 0;
		int countEnd = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10)
				nums[i] = 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				newArray[nums.length - 1 - countEnd] = 0;
				countEnd++;
			} else {
				newArray[countStart] = nums[i];
				countStart++;
			}
		}
		return newArray;
	}

	public int[] zeroFront(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println("1petla i:" + i);
			for (int j = 0; j < nums.length; j++) {
				System.out.println("2petla j:" + j);
				if (nums[i] == 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

	public int[] notAlone(int[] nums, int val) {
		if (nums.length > 2) {
			for (int i = 1; i < nums.length - 1; i++) {
				if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {
					if (nums[i - 1] > nums[i + 1] && nums[i - 1] > nums[i]) {
						nums[i] = nums[i - 1];
					} else if (nums[i - 1] < nums[i + 1] && nums[i + 1] > nums[i]) {
						nums[i] = nums[i + 1];
					}
				}
			}
		}
		return nums;
	}

	public int[] post4(int[] nums) {
		int[] newArray;
		int positions = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4) {
				positions = i;
				// System.out.println("pozycja 4:"+positions);
				break;
			}
		}
		int len = nums.length - positions - 1;
		// System.out.println("len:"+len);
		newArray = new int[len];
		for (int j = 0; j < len; j++) {
			// System.out.println(j+len);
			newArray[j] = nums[j + positions + 1];
		}
		return newArray;
	}

	public int[] pre4(int[] nums) {
		int[] newArray;
		int positions = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				positions = i;
				break;
			}
		}
		newArray = new int[positions];
		for (int j = 0; j < positions; j++) {
			newArray[j] = nums[j];
		}
		return newArray;

	}

	public int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			// System.out.println(nums[i]);
			if (i + 1 < nums.length && nums[i] % 10 == 0 && nums[i + 1] % 10 != 0) {
				nums[i + 1] = nums[i];
			}
		}
		return nums;
	}

	public int[] shiftLeft(int[] nums) {
		int[] newArray = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length) {
				newArray[i] = nums[i + 1];
			} else {
				newArray[nums.length - 1] = nums[0];
			}
			// System.out.println(newArray[i]);
		}

		return newArray;
	}

	public int[] fizzArray3(int start, int end) {
		int len = end - start;
		int[] newArray = new int[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = start + i;
		}
		return newArray;
	}

	public boolean tripleUp(int[] nums) {
		boolean result = false;
		for (int i = 0; i < nums.length; i++) {
			if (i + 2 < nums.length && nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2])
				result = true;
		}
		return result;
	}

	public boolean sameEnds(int[] nums, int len) {
		boolean result = true;
		int end = nums.length - len;
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[end + i])
				result = false;
			// System.out.println("i:" +i + " nums[i]:"+ nums[i]+"
			// nums[end+i]:"+nums[end+i]);

		}
		return result;
	}

	public boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			if (i + 1 < scores.length && scores[i] <= scores[i + 1])
				return true;
		}
		return false;
	}

	public boolean twoTwo(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				System.out.println("i start:" + i + " nums i:" + nums[i]);
				if (i != 0 && nums[i - 1] == 2) {
					System.out.println("i petla1:" + i + " nums i-1:" + nums[i - 1]);
				} else if (i + 1 < nums.length && nums[i + 1] == 2) {
					System.out.println("i petla2:" + i + " nums i+1:" + nums[i + 1]);
				} else {
					System.out.println("i petla3:" + i + " nums i:" + nums[i]);
					return false;
				}
			}
		}
		// System.out.println("i end:"+i);
		return true;
	}

	public boolean haveThree(int[] nums) {
		int count = 0;
		boolean tmpResult = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3)
				count++;
			if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3)
				tmpResult = false;
		}
		return (count == 3 && tmpResult);
	}

	public boolean modThree(int[] nums) {
		boolean result = false;
		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 2 && nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
				result = true;
			if (i < nums.length - 2 && nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)
				result = true;
		}
		return result;
	}

	public boolean has12(int[] nums) {
		int secondCount = 0;
		boolean tmpResult = false;
		boolean tmpResult2 = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 1) {
				secondCount = i;
				tmpResult = true;
			}
			for (int j = secondCount + 1; j < nums.length; j++) {
				if (nums[j] == 2)
					tmpResult2 = true;
			}
		}
		return (tmpResult && tmpResult2);
	}

	public boolean has77(int[] nums) {
		boolean result = false;
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length && nums[i] == 7 && nums[i + 1] == 7)
				result = true;
			if (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7)
				result = true;
		}
		return result;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i])
				count++;
		}
		return count;
	}

	public boolean either24(int[] nums) {

		int twos = 0;
		int fours = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				twos = 2;
			if (nums[i] == 4 && nums[i + 1] == 4)
				fours = 4;
		}
		if (twos == 0 && fours == 0) {
			return false;
		} else {
			return (!(twos == 2 && fours == 4));
		}

	}

	public boolean isEverywhere(int[] nums, int val) {
		boolean result = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val) {

				result = false;
			}

		}
		return result;
	}

	public boolean no14(int[] nums) {
		boolean ones = true;
		boolean fours = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				ones = false;
			if (nums[i] == 4)
				fours = false;
		}
		return (ones || fours);

	}

	public String[] fizzArray2(int n) {
		String[] fizzArray = new String[n];
		for (int i = 0; i < n; i++) {
			fizzArray[i] = String.valueOf(i);
		}
		return fizzArray;
	}

	public int[] fizzArray(int n) {
		int[] fizzArray = new int[n];
		for (int i = 0; i < n; i++) {
			fizzArray[i] = i;
		}
		return fizzArray;
	}

	public boolean only14(int[] nums) {
		boolean result = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 4 && nums[i] != 1)
				result = false;
		}
		return result;
	}

	public boolean more14(int[] nums) {
		int ones = 0;
		int fours = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				ones++;
			if (nums[i] == 4)
				fours++;
		}
		return (ones > fours);
	}

	public boolean sum28(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				sum += nums[i];
			}
		}
		return (sum == 8);
	}

	public boolean has22(int[] nums) {
		boolean result = false;
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length && nums[i] == 2 && nums[i + 1] == 2)
				result = true;
		}
		return result;
	}

	public int sum67(int[] nums) {
		int i = 0;
		int sum = 0;
		if (nums.length == 0)
			sum = 0;
		while (i < nums.length) {
			if (nums[i] != 6) {
				sum += nums[i];
				// System.out.println("i:"+i + " nums1:" + nums[i] + " sum:" +
				// sum);
				i++;
			} else {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] == 7) {
						i = j + 1;
						break;
					}
					// System.out.println("j:"+j + " nums2:" + nums[j]);
				}
			}
		}
		return sum;
	}

	public int sum13(int[] nums) {
		int i = 0;
		int sum = 0;
		if (nums.length == 0)
			sum = 0;
		while (i < nums.length) {
			if (nums[i] != 13) {
				sum += nums[i];
				i++;
			} else {
				i += 2;
			}
		}
		return sum;
	}

	public int centeredAverage(int[] nums) {
		int[] newNums = new int[nums.length - 2];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int i = 1; i < nums.length - 1; i++) {
			newNums[i - 1] = nums[i];
		}
		for (int i = 0; i < newNums.length; i++) {
			sum = sum + newNums[i];
		}
		return sum / newNums.length;
	}

	public int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
			if (nums[i] < min)
				min = nums[i];
		}
		return max - min;
	}

	public int countEvens(int[] nums) {
		Integer count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Array2 array = new Array2();
		int[] nums = { 1, 4, 2, 1, 4, 1, 4 };
		System.out.println(array.countEvens(nums));

	}

}
