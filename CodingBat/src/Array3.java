import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class Array3 {
	public int commonTwo(String[] a, String[] b) {
		int indexA = 0, indexB = 0, count = 0;

		while (indexA < a.length && indexB < b.length) {
			if (a[indexA].compareTo(b[indexB]) < 0) {
				indexA++;
			} else if (a[indexA].compareTo(b[indexB]) > 0) {
				indexB++;
			} else if (indexA + 1 < a.length && a[indexA].equals(a[indexA + 1])) {
				indexA++;
			} else if (indexB + 1 < b.length && b[indexB].equals(b[indexB + 1])) {
				indexB++;
			} else {
				count++;
				indexA++;
				indexB++;
			}
		}
		return count;
	}

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int posA = 0, posB = 0, posResult = 0;

		while (posResult < n) {
			if (a[posA].compareTo(b[posB]) < 0) {
				result[posResult] = a[posA];
				posA++;
				posResult++;
			} else if (a[posA].compareTo(b[posB]) > 0) {
				result[posResult] = b[posB];
				posB++;
				posResult++;
			} else {
				result[posResult] = a[posA];
				posA++;
				posB++;
				posResult++;
			}
		}
		return result;
	}

	public int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.compareTo(bName) < 0)
			return -1;
		else if (aName.compareTo(bName) > 0)
			return 1;
		else {
			if (aId < bId)
				return -1;
			else if (aId > bId)
				return 1;
			else
				return 0;
		}
	}

	public int bigHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i + 1]) >= 5)
				sum++;
		}
		return sum;
	}

	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (heights[i] < heights[i + 1]) {
				sum += Math.abs(heights[i] - heights[i + 1]) * 2;
			} else {
				sum += Math.abs(heights[i] - heights[i + 1]);
			}
		}
		return sum;
	}

	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += Math.abs(heights[i] - heights[i + 1]);
		}
		return sum;
	}

	public int scoresSpecial(int[] a, int[] b) {
		return maxScore(a) + maxScore(b);
	}

	int maxScore(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0 && nums[i] > max)
				max = nums[i];
		}
		return max;
	}

	public String[] wordsWithout(String[] words, String target) {
		int count = 0, pos = 0;
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target))
				count++;
		}
		String[] newWords = new String[count];
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				newWords[pos] = words[i];
				pos++;
			}
		}
		return newWords;
	}

	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for (int i = 0; i < key.length; i++) {
			if (answers[i].equals(key[i]))
				score += 4;
			if (!answers[i].equals(key[i]) && !answers[i].equals("?"))
				score += -1;
		}
		return score;
	}

	public int matchUp(String[] a, String[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0))
				count++;
		}
		return count;
	}

	public int[] copyEndy(int[] nums, int count) {
		int[] newArray = new int[count];
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (pos < count && isEndy(nums[i])) {
				newArray[pos] = nums[i];
				pos++;
			}
		}
		return newArray;
	}

	boolean isEndy(int n) {
		return ((n >= 0 && n <= 10) || (n >= 90 && n <= 100));
	}

	public int[] copyEvens(int[] nums, int count) {
		int[] newArray = new int[count];
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (pos < count && nums[i] % 2 == 0) {
				newArray[pos] = nums[i];
				pos++;
			}
		}
		return newArray;
	}

	public boolean dividesSelf(int n) {
		int i = n;
		while (i > 0) {
			// System.out.println("n%10:" + n%10);
			// System.out.println("n%i%10:" + n%(i%10));
			if (n % 10 == 0 || n % (i % 10) != 0)
				return false;
			i = i / 10;
		}
		return true;
	}

	public boolean hasOne(int n) {
		while (n > 0) {
			if (n % 10 == 1)
				return true;
			n = n / 10;
		}
		return false;
	}

	public List<String> wordsWithoutList(String[] words, int len) {
		List<String> newList = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len)
				newList.add(words[i]);
		}
		return newList;
	}

	public String[] wordsFront(String[] words, int n) {
		String[] newWords = new String[n];
		for (int i = 0; i < n; i++)
			newWords[i] = words[i];
		return newWords;
	}

	public int wordsCount(String[] words, int len) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len)
				count++;
		}
		return count;
	}

	public int scoresAverage(int[] scores) {
		int firstHalf = average(scores, 0, scores.length / 2 - 1);
		int secondHalf = average(scores, scores.length / 2, scores.length - 1);
		if (firstHalf > secondHalf)
			return firstHalf;
		else
			return secondHalf;
	}

	int average(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + scores[i];
		}
		return sum / (end + 1 - start);
	}

	public boolean scoresClump(int[] scores) {
		boolean result = false;
		for (int i = 0; i < scores.length - 2; i++) {
			if (scores[i + 2] - scores[i] <= 2) {
				result = true;
				break;
			}
		}
		return result;
	}

	public boolean scores100(int[] scores) {
		boolean result = false;
		int i = 0;
		while (i < scores.length - 1) {
			if (scores[i] == 100 && scores[i + 1] == 100) {
				result = true;
				i += scores.length;
			} else {
				i++;
			}
		}
		return result;
	}

	public int countClumps(int[] nums) {
		int current = -1, clump = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] && nums[i] != current) {
				current = nums[i];
				clump++;
			} else {
				if (nums[i] != current) {
					current = -1;
				}
			}
		}
		return clump;
	}

	public int maxMirror(int[] nums) {
		// reversed nums array
		int[] numsCopy = new int[nums.length];
		for (int i = nums.length - 1, j = 0; i >= 0; i--, j++)
			numsCopy[j] = nums[i];
		// --------------------------------------------------------
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			int pos1 = i;
			int pos2 = 0;
			boolean flag = false;

			while (pos1 < nums.length && pos2 < nums.length) {
				if (!flag) {
					if (nums[pos1] != numsCopy[pos2])
						pos2++;
					else {
						flag = true;
						count = 1;
						pos1++;
						pos2++;
					}
				} else {
					if (nums[pos1] == numsCopy[pos2]) {
						count++;
						pos1++;
						pos2++;
					} else {
						if (count > max)
							max = count;
						pos1 = i;
						flag = false;
					}
				}
				if (count > max)
					max = count;
			}
		}
		return max;
	}

	public int[] seriesUp(int n) {
		int[] result = new int[n * (n + 1) / 2];
		int j = 0;
		for (int i = 0; i <= n; i++) {
			for (int k = 1; k < (i + 1); k++) {
				result[j] = k;
				j++;
			}
		}
		return result;
	}

	public int[] squareUp(int n) {
		int[] result = new int[n * n];
		int pos = 0;

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++)
				result[pos++] = 0;
			for (int j = i; j > 0; j--)
				result[pos++] = j;
		}
		return result;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		int numFound = 0;
		if (inner.length == 0) {
			return true;
		}

		int k = 0;
		for (int i = 0; i < outer.length; i++) {
			if (outer[i] == inner[k]) {
				numFound++;
				k++;
			} else if (outer[i] > inner[k]) {
				return false;
			}

			if (numFound == inner.length)
				return true;
		}
		return false;
	}

	public boolean canBalance(int[] nums) {
		boolean result = false;
		int sumI = 0;
		for (int i = 0; i < nums.length; i++) {
			sumI = sumI + nums[i];
			int sumJ = 0;
			System.out.println("sumI:" + sumI);
			for (int j = nums.length - 1; j >= i + 1; j--) {
				sumJ = sumJ + nums[j];
				System.out.println("sumJ:" + sumJ);
			}
			if (sumI == sumJ) {
				result = true;
			}
		}
		return result;
	}

	public int[] fix45(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
				int pos5 = i;
				for (int j = 0; j < nums.length; j++)
					if (nums[j] == 4 && nums[j + 1] != 5) {
						int temp = nums[j + 1];
						nums[j + 1] = 5;
						nums[pos5] = temp;
						break;
					}
			}
		return nums;
	}

	public int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 3) {
				int temp = nums[i + 1];
				nums[i + 1] = 4;
				for (int j = i + 2; j < nums.length; j++)
					if (nums[j] == 4)
						nums[j] = temp;
			}
		return nums;
	}

	public int maxSpan(int[] nums) {
		int span = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j >= 0; j--) {
				if (nums[i] == nums[j] && j + 1 - i > span)
					span = j + 1 - i;
			}
		}
		return span;
	}

	public static void main(String[] args) {

		Array3 array = new Array3();
		// int[] nums = { 1, 1, 1, 1, 4 };
		System.out.println(array.dividesSelf(128));
		// System.out.println(Arrays.toString(array.seriesUp(3)));

	}
}
