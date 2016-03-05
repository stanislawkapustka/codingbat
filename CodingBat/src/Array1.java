public class Array1 {
	public int[] make2(int[] a, int[] b) {
		int[] newArray = new int[2];
		if (a.length >= 2) {
			newArray[0] = a[0];
			newArray[1] = a[1];
		}
		if (a.length == 1) {
			newArray[0] = a[0];
			newArray[1] = b[0];
		} 
		if (a.length == 0) {
			newArray[0] = b[0];
			newArray[1] = b[1];
		}
		return newArray;
	}

	public int[] makeMiddle(int[] nums) {
		int[] newArray = new int[1];
		newArray[0] = nums[nums.length / 2 - 1];
		newArray[1] = nums[nums.length / 2];
		return newArray;
	}

	public int[] front11(int[] a, int[] b) {
		if (a.length > 0) {
			if (b.length > 0) {
				int[] newArray = { a[0], b[0] };
				return newArray;
			} else {
				int[] newArray = { a[0] };
				return newArray;
			}
		} else {
			if (b.length > 0) {
				int[] newArray = { b[0] };
				return newArray;
			} else {
				int[] newArray = {};
				return newArray;
			}
		}

	}

	public boolean unlucky1(int[] nums) {
		if (nums.length > 2) {
			return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)
					|| (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));
		}
		if (nums.length == 2) {
			return (nums[0] == 1 && nums[1] == 3);
		}
		return false;
	}

	public int[] midThree(int[] nums) {
		int[] newArray = new int[3];
		newArray[0] = nums[nums.length / 2 - 1];
		newArray[1] = nums[nums.length / 2];
		newArray[2] = nums[nums.length / 2 + 1];
		return newArray;
	}

	public int[] swapEnds(int[] nums) {
		int oldFirst = nums[0];
		int oldLast = nums[nums.length - 1];
		nums[0] = oldLast;
		nums[nums.length - 1] = oldFirst;
		return nums;
	}

	public int maxTriple(int[] nums) {
		Integer max;
		if (nums.length >= 3) {
			int first = nums[0];
			int last = nums[nums.length - 1];
			int mid = nums[nums.length / 2];
			max = Math.max(first, mid);
			max = Math.max(max, last);
		} else {
			max = nums[0];
		}
		return max;
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length > 1) {
			int[] newArray = { nums[0], nums[1] };
			return newArray;
		}
		return nums;
	}

	public int[] plusTwo(int[] a, int[] b) {
		int[] newArray = { a[0], a[1], b[0], b[1] };
		return newArray;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		Integer sumA = a[0] + a[1];
		Integer sumB = b[0] + b[1];

		if (sumA >= sumB) {
			return a;
		} else {
			return b;
		}
	}

	public int start1(int[] a, int[] b) {
		if (a.length > 0 && a[0] == 1) {
			if (b.length > 0 && b[0] == 1) {
				return 2;
			} else {
				return 1;
			}
		} else {
			if (b.length > 0 && b[0] == 1) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		}
		if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}
		return nums;
	}

	public boolean double23(int[] nums) {
		if (nums.length > 1) {
			if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
				return true;
			}
		}
		return false;
	}

	public int[] makeLast(int[] nums) {
		int[] newArray = new int[nums.length * 2];
		newArray[newArray.length - 1] = nums[nums.length - 1];
		return newArray;
	}

	public boolean no23(int[] nums) {
		if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
			return true;
		}
		return false;
	}

	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
			return true;
		}
		return false;
	}

	public int[] makeEnds(int[] nums) {
		int[] newArray = { nums[0], nums[nums.length - 1] };
		return newArray;
	}

	public int[] middleWay(int[] a, int[] b) {
		int[] newArray = { a[1], b[1] };
		return newArray;
	}

	public int sum2(int[] nums) {
		if (nums.length > 1) {
			return nums[0] + nums[1];
		} else if (nums.length == 1) {
			return nums[0];
		} else {
			return 0;
		}
	}

	public int[] maxEnd3(int[] nums) {
		int[] newA = new int[3];
		newA[0] = Math.max(nums[0], nums[1]);
		newA[0] = Math.max(nums[0], nums[2]);
		newA[1] = newA[2] = newA[0];
		return newA;
	}

	public int[] reverse3(int[] nums) {
		int[] newArray = { nums[2], nums[1], nums[0] };
		return newArray;
	}

	public int[] rotateLeft3(int[] nums) {
		int[] newArray = { nums[1], nums[2], nums[0] };
		return newArray;
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	public int[] makePi() {
		int[] pi = { 3, 1, 4 };
		return pi;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Array1 app = new Array1();
		int[] nums = { 1, 2, 3 };
		System.out.println(app.swapEnds(nums));
	}
}
