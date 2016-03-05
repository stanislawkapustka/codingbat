
public class String2 {
	public String withoutString(String base, String remove) {
		int i = 0;
		String result = "";
		while (i<base.length()){
			if (base.substring(i).startsWith(remove)){
				i = i+remove.length();
			} else {
				result = result + base.charAt(i);
				i++;
			}
		}
		return result;
	}

	public int countYZ(String str) {
		int result = 0;
		str = str.toLowerCase();
		if (str.endsWith("y") || str.endsWith("z"))
			result = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (!Character.isLetter(str.charAt(i + 1)) && str.charAt(i) == 'z'
					|| !Character.isLetter(str.charAt(i + 1)) && str.charAt(i) == 'y') {
				result = result + 1;
			}
		}
		return result;
	}

	public String wordEnds(String str, String word) {
		int strLen = str.length();
		int wordLen = word.length();
		int wordPosition = str.indexOf(word);
		int i = 0;
		String result = "";

		while (wordPosition != -1) {
			i = wordPosition + wordLen;
			if (wordPosition >= 1)
				result += str.charAt(wordPosition - 1);
			if (i < strLen)
				result += str.charAt(i);
			wordPosition = str.indexOf(word, i);
		}
		return result;
	}

	public String plusOut(String str, String word) {
		int i = 0;
		String result = "";
		int lenS = str.length();
		int lenW = word.length();
		while (i < lenS) {
			if (str.substring(i).startsWith(word)) {
				result = result + word;
				i = i + lenW;
			} else {
				result = result + "+";
				i++;
			}
		}
		return result;
	}

	public String starOut(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!(i + 1 < str.length() && str.charAt(i + 1) == '*' || str.charAt(i) == '*'
					|| i - 1 >= 0 && str.charAt(i - 1) == '*')) {
				result = result + str.charAt(i);
			}
		}
		return result;
	}

	public String zipZap(String str) {
		String result = "";
		if (str.length() >= 3) {
			String resultTmp = str.substring(0, 1);
			for (int i = 1; i < str.length() - 1; i++) {
				if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
					resultTmp = resultTmp + "";
				} else {
					resultTmp = resultTmp + str.charAt(i);
				}
			}
			result = resultTmp + str.charAt(str.length() - 1);
		} else {
			result = str;
		}
		return result;
	}

	public String oneTwo(String str) {
		String result = "";
		if (str.length() >= 3) {
			for (int i = 0; i < str.length() - 2; i += 3) {
				result = result + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
			}

		}
		return result;
	}

	public boolean sameStarChar(String str) {
		boolean result = true;

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.length() > 3 && str.charAt(i) == '*') {
				System.out.println(str.charAt(i - 1));
				System.out.println(str.charAt(i + 1));
				result = (str.charAt(i - 1) == str.charAt(i + 1));
			}
		}
		return result;
	}

	public String getSandwich(String str) {
		int start = str.indexOf("bread");
		int end = str.lastIndexOf("bread");
		if (start != end) {
			return str.substring(start + 5, end);
		} else {
			return "";
		}
	}

	public boolean xyzMiddle(String str) {
		int len = str.length();
		if (str.length() < 3) {
			return false;
		} else if (len % 2 != 0) {
			return (str.substring(len / 2 - 1, len / 2 + 2).equals("xyz"));
		} else {
			return (str.substring(len / 2 - 1, len / 2 + 2).equals("xyz")
					|| (str.substring(len / 2 - 2, len / 2 + 1).equals("xyz")));
		}

	}

	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		System.out.println(prefix);
		int count = 0;
		for (int i = 0; i < str.length() - n + 1; i++) {
			System.out.println(str.substring(i, i + n));
			if (prefix.equals(str.substring(i, i + n)))
				count++;
		}
		return count > 1;
	}

	public String repeatSeparator(String word, String sep, int count) {
		String result = word;
		if (sep.equals("") && count == 0)
			result = "";
		for (int i = 0; i < count - 1; i++) {
			result = result + sep + word;
		}
		return result;
	}

	public String repeatFront(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + str.substring(0, n - i);
		}
		return result;
	}

	public String repeatEnd(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + str.substring(str.length() - n);
		}
		return result;
	}

	public String mixString(String a, String b) {
		String result = "";
		String shorterString = a;
		String longerString = b;
		if (b.length() < a.length()) {
			shorterString = b;
			longerString = a;
		}
		for (int i = 0; i < shorterString.length(); i++) {
			result = result + a.charAt(i) + b.charAt(i);
		}
		result = result
				+ longerString.substring(longerString.length() - (longerString.length() - shorterString.length()));
		return result;
	}

	public boolean xyBalance(String str) {
		int indexX = str.lastIndexOf("x");
		int indexY = str.lastIndexOf("y");

		return (indexY > indexX);
	}

	public boolean bobThere(String str) {
		boolean result = false;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
				result = true;
			}
		}
		return result;
	}

	public boolean xyzThere(String str) {
		boolean result = false;
		if (str.startsWith("xyz")) {
			result = true;
		} else {
			for (int i = 0; i < str.length() - 3; i++) {
				System.out.println(str.substring(i, i + 1) + ", " + str.substring(i + 1, i + 4));
				if (!str.substring(i, i + 1).equals(".") && str.substring(i + 1, i + 4).equals("xyz")) {
					result = true;
				}
			}
		}
		return result;
	}

	public boolean endOther(String a, String b) {
		String endString = "";
		String otherString = "";
		if (a.length() <= b.length()) {
			endString = a.toLowerCase();
			otherString = b.toLowerCase();
		} else {
			endString = b.toLowerCase();
			otherString = a.toLowerCase();
		}
		System.out.println(otherString + ", " + endString);
		if (otherString.endsWith(endString)) {
			return true;
		} else {
			return false;
		}
	}

	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
				count++;
			}
		}
		return count;
	}

	public boolean catDog(String str) {
		int countDogs = 0;
		int countCats = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("dog"))
				countDogs++;
			if (str.substring(i, i + 3).equals("cat"))
				countCats++;
		}
		return (countDogs == countCats);
	}

	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}
		return count;
	}

	public String doubleChar(String str) {
		String result = new String();
		result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		String2 stringx = new String2();
		System.out.println(stringx.countYZ("day:yak"));

	}

}
