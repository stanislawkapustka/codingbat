public class String3 {
	public String notReplace(String str) {
		String result = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
					|| i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
				result += str.charAt(i);
			}
			else if (i + 1 < len && str.substring(i, i + 2).equals("is")) {
				result += "is not";
				i++;
			}
			else
				result += str.charAt(i);
		}
		return result;
	}

	public int sumNumbers(String str) {
		boolean b = false;
		String con = null;
		int sum = 0;
		int index = 0;

		for (int i = 0; i <= str.length(); i++) {
			if (i < str.length() && Character.isDigit(str.charAt(i))) {
				if (!b) {
					index = i;
					b = true;
				}
			} else if (b) {
				con = str.substring(index, i);
				b = false;
				sum += Integer.parseInt(con);
			}
		}
		return sum;
	}

	public int maxBlock(String str) {
		int counter = 1;
		int result = 1;
		if (str.length() == 0)
			result = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				counter++;
				if (counter > result)
					result = counter;
			} else {
				counter = 1;
			}
		}
		return result;
	}

	public String mirrorEnds(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			System.out.println("str1 " + string.charAt(i));
			System.out.println("str2 " + string.charAt(string.length() - 1));
			if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
				result = result + string.charAt(i);
			} else {
				break;
			}
		}

		return result;
	}

	public String sameEnds(String string) {
		String result = "";
		String tmp = "";
		int len = string.length() / 2;

		for (int i = 1; i <= len; i++) {
			tmp = string.substring(0, i);
			// System.out.println("str1 " + tmp);
			if (string.startsWith(tmp) == string.endsWith(tmp)) {
				result = tmp;
			}
		}
		return result;
	}

	public int sumDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		return sum;
	}

	public int countTriple(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2))
				count++;
		}
		return count;
	}

	public boolean gHappy(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
				if (i - 1 < 0 || str.charAt(i - 1) != 'g') {
					if (i + 1 > str.length() || str.charAt(i + 1) != 'g') {
						return false;
					}
				}
			}
		}
		return true;
	}

	public boolean equalIsNot(String str) {
		int countIs = 0;
		int countNot = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i).startsWith("is"))
				countIs++;
			if (str.substring(i).startsWith("not"))
				countNot++;
		}
		return (countIs == countNot);
	}

	public String withoutString(String base, String remove) {
		int i = 0;
		String result = "";
		String baseL = base.toLowerCase();
		String removeL = remove.toLowerCase();
		while (i < base.length()) {
			if (baseL.substring(i).startsWith(removeL)) {
				i = i + remove.length();
			} else {
				result = result + base.charAt(i);
				i++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String3 stringx = new String3();
		System.out.println(stringx.sumNumbers("aa11b33"));
	}
}
