import java.util.Arrays;

class Solution {

	public int solution(int[] A) {
		int sumStart = A[0];
		int sumEnd = 0;
		int sumTmp, sum = 0;
		for (int i = 1; i < A.length; i++) {
			sumEnd += A[i];
		}
		sum = Math.abs(sumStart - sumEnd);

		if(A.length>=3) {
			for (int j = 1; j < A.length; j++) {
				sumStart += A[j];
				sumEnd -= A[j];
				sumTmp = Math.abs(sumStart - sumEnd);
				System.out.println(sumTmp + " " + sum);
				if (sum > sumTmp)
					sum = sumTmp;
			}
		}
		return sum;
	}

	public int solution1(int[] A) {
		Arrays.sort(A);
		int tmp = -1;
		int i = 0;
		int len = A.length;
		while (i < len - 1 && len >= 2) {
			if (A[i] != A[i + 1]) {
				tmp = A[i];
				i++;
			} else if (A[i] == A[i + 1]) {
				i += 2;
			}
		}
		if (len >= 2 && A[len - 1] != A[len - 2])
			tmp = A[len - 1];
		if (len == 1)
			tmp = A[0];
		return tmp;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] A = { -10, 10 };
		System.out.println(sol.solution(A));

	}

}
