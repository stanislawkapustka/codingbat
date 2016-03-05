
public class App {
	public String withoutX(String str) {
		if (str.length()>1){
			if (str.startsWith("x")){
				if (str.endsWith("x")){
					return str.substring(1, str.length()-1);
				} else {
					return str.substring(1);
				}
			} else {
				if (str.endsWith("x")){
					return str.substring(0, str.length()-1);
				} else {
					return str;
				}
			}
		} else {
			return "";
		}
	}

	public String startWord(String str, String word) {
		Integer strLen = str.length();
		Integer wordLen = word.length();

		if (strLen >= wordLen) {
			if (str.substring(1, wordLen).equals(word.substring(1))) {
				return str.substring(0, wordLen);
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

	public String deFront(String str) {
		if (str.length() > 2) {
			if (str.substring(0, 1).equals("a")) {
				if (str.substring(1, 2).equals("b")) {
					return str;
				} else {
					return str.substring(0, 1) + str.substring(2);
				}
			} else {
				if (str.substring(1, 2).equals("b")) {
					return str.substring(1);
				} else {
					return str.substring(2);
				}
			}
		} else if (str.length() == 2) {
			if (str.substring(0, 1).equals("a")) {
				if (str.substring(1, 2).equals("b")) {
					return "ab";
				} else {
					return "a";
				}
			} else {
				if (str.substring(1, 2).equals("b")) {
					return "b";
				} else {
					return "";
				}
			}
		} else {
			if (str.equals("a")) {
				return "a";
			} else {
				return "";
			}
		}
	}

	public String without2(String str) {
		if (str.length() > 1) {
			if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
				return str.substring(2);
			} else {
				return str;
			}
		} else {
			return str;
		}
	}

	public String extraFront(String str) {
		String sub = "";
		if (str.length() > 1) {
			sub = str.substring(0, 2);
		} else {
			sub = str;
		}
		return sub + sub + sub;
	}

	public String minCat(String a, String b) {
		Integer min = Math.min(a.length(), b.length());
		return a.substring(a.length() - min) + b.substring(b.length() - min);
	}

	public boolean frontAgain(String str) {
		boolean result = false;
		if (str.length() > 1) {
			String start = str.substring(0, 2);
			String end = str.substring(str.length() - 2);
			if (start.equals(end)) {
				result = true;
			}
		}
		return result;
	}

	public String seeColor(String str) {
		if (str.startsWith("red")) {
			return "red";
		} else if (str.startsWith("blue")) {
			return "blue";
		} else {
			return "";
		}
	}

	public String lastTwo(String str) {
		if (str.length() > 1) {
			return str.substring(0, str.length() - 2) + str.substring(str.length() - 1)
					+ str.substring(str.length() - 2, str.length() - 1);
		} else {
			return str;
		}
	}

	public String conCat(String a, String b) {
		if (a.length() > 0 && b.length() > 0) {
			if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
				return a + b.substring(1, b.length());
			} else {
				return a + b;
			}
		} else {
			return a + b;
		}
	}

	public String lastChars(String a, String b) {
		if (a.length() > 0) {
			if (b.length() > 0) {
				return a.substring(0, 1) + b.substring(b.length() - 1);
			} else {
				return a.substring(0, 1) + "@";
			}
		} else {
			if (b.length() > 0) {
				return "@" + b.substring(b.length() - 1);
			} else {
				return "@@";
			}
		}
	}

	public String atFirst(String str) {
		if (str.length() >= 2) {
			return str.substring(0, 2);
		} else if (str.length() == 1) {
			return str + "@";
		} else {
			return "@@";
		}
	}

	public boolean hasBad(String str) {
		boolean result = false;
		if (str.length() >= 4) {
			if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
				result = true;
			}
		} else if (str.length() == 3) {
			if (str.equals("bad")) {
				result = true;
			}
		}
		return result;
	}

	public String middleThree(String str) {
		return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
	}

	public String twoChar(String str, int index) {
		if (str.length() >= index + 2) {
			return str.substring(index, index + 2);
		} else {
			return str.substring(0, 2);
		}
	}

	public String nTwice(String str, int n) {
		String first = str.substring(0, n);
		String last = str.substring(str.length() - n);
		return first + last;
	}

	public boolean endsLy(String str) {
		System.out.println(str.substring(str.length() - 2));
		if (str.length() >= 2) {
			if (str.substring(str.length() - 2).equals("ly")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public String middleTwo(String str) {
		Integer len = str.length() / 2;
		return str.substring(len - 1, len + 1);

	}

	public String withouEnd2(String str) {
		if (str.length() >= 2) {
			return str.substring(1, str.length() - 1);
		} else {
			return "";
		}

	}

	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		} else {
			return str.substring(str.length() - 1);
		}
	}

	public String withoutX2(String str) {
		if (str.length() >= 2) {
			if (str.charAt(0) == 'x') {
				if (str.charAt(1) == 'x') {
					return str.substring(2);
				} else {
					return str.substring(1);
				}
			} else {
				if (str.charAt(1) == 'x') {
					return str.substring(0, 1) + str.substring(2);
				} else {
					return str;
				}
			}
		} else if (str == "x") {
			return "";
		} else if (str != "x") {
			return str;
		} else {
			return str;
		}
	}

	public String right2(String str) {
		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
	}

	public String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}

	public String comboString(String a, String b) {
		if (a.length() > b.length()) {
			return b + a + b;
		} else {
			return a + b + a;
		}
	}

	public String firstHalf(String str) {
		Integer end = str.length() / 2;
		return str.substring(0, end);
	}

	public String firstTwo(String str) {
		if (str.length() >= 2) {
			return str.substring(0, 2);
		} else {
			return str;
		}

	}

	public String extraEnd(String str) {
		String sub = str.substring(str.length() - 2);
		return sub + sub + sub;
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2);
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public static void main(String[] args) {
		App app = new App();

		System.out.println(app.twoChar("asly", 3));

	}
}