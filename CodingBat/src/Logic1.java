
public class Logic1 {
	public int makeChocolate(int small, int big, int goal) {
		if (5*big + small < goal){
			return -2;
		} else if (goal%5 > small){
			return -1;
		} else {
			if (big >= goal/5){
				return goal%5;
			} else {
				return goal-big*5;
			}
		}
	}

	public boolean evenlySpaced(int a, int b, int c) {
		int diffAb = Math.abs(a - b);
		int diffAc = Math.abs(a - c);
		int diffBc = Math.abs(b - c);

		if (a == b && b == c) {
			return true;
		} else if (a == b || b == c) {
			return false;
		} else {
			return (diffAb == diffAc || diffAb == diffBc || diffBc == diffAc);
		}
	}

	public int blackjack(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if ((a >= b && a <= 21) || (a < b && b > 21)) {
			return a;
		} else if ((a < b && b <= 21) || (b < a && a > 21)) {
			return b;
		} else {
			return 0;
		}
	}

	public boolean closeFar(int a, int b, int c) {
		if (Math.abs(a - b) <= 1) {
			if (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
				return true;
			} else {
				return false;
			}
		} else if (Math.abs(a - c) <= 1) {
			if (Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public int round10(int num) {
		if (num % 10 >= 5) {
			return (num / 10 + 1) * 10;
		} else {
			return (num / 10) * 10;
		}
	}

	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public int fixTeen(int n) {
		if ((n >= 13 && n < 15) || (n > 16 && n <= 19)) {
			return 0;
		} else {
			return n;
		}
	}

	public int luckySum(int a, int b, int c) {
		if (a == 13) {
			return 0;
		} else if (b == 13) {
			return a;
		} else if (c == 13) {
			return a + b;
		} else {
			return a + b + c;
		}
	}

	public int loneSum(int a, int b, int c) {
		if (a == b && b == c) {
			return 0;
		} else if (a == b) {
			return c;
		} else if (a == c) {
			return b;
		} else if (b == c) {
			return a;
		} else {
			return a + b + c;
		}
	}

	public boolean makeBricks(int small, int big, int goal) {
		if (small + (5 * big) < goal) {
			return false;
		} else {
			if (goal % 5 > small) {
				return false;
			} else {
				return true;
			}
		}
	}

	public int sumLimit(int a, int b) {
		Integer digitsA = String.valueOf(a).length();
		Integer digitsSum = String.valueOf(a + b).length();

		if (digitsA == digitsSum) {
			return a + b;
		} else {
			return a;
		}
	}

	public boolean shareDigit(int a, int b) {
		return (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10);
	}

	public int blueTicket(int a, int b, int c) {
		if (a + b == 10 || a + c == 10 || b + c == 10) {
			return 10;
		} else if ((a + b) - 10 == b + c || (a + b) - 10 == a + c) {
			return 5;
		} else {
			return 0;
		}
	}

	public int greenTicket(int a, int b, int c) {
		Integer result;
		if (a == b && b == c) {
			result = 20;
		} else if (a == b || a == c || b == c) {
			result = 10;
		} else {
			result = 0;
		}
		return result;
	}

	public int redTicket(int a, int b, int c) {
		Integer result;
		if (a == 2 && b == 2 && c == 2) {
			result = 10;
		} else if (a == b && b == c) {
			result = 5;
		} else if (b == c && b != a) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}

	public int maxMod5(int a, int b) {
		Integer result;
		if (a == b) {
			result = 0;
		} else if (a % 5 == b % 5) {
			if (a < b) {
				result = a;
			} else {
				result = b;
			}
		} else {
			if (a < b) {
				result = b;
			} else {
				result = a;
			}
		}
		return result;
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles && die1 == die2) {
			if (die1 == 6) {
				die1 = 1;
			} else {
				die1 += 1;
			}
		}
		return die1 + die2;
	}

	public boolean lessBy10(int a, int b, int c) {
		int difAb = Math.abs(a - b);
		int difAc = Math.abs(a - c);
		int difBc = Math.abs(a - b);

		return (difAb >= 10 || difAc >= 10 || difBc >= 10);
	}

	public boolean lastDigit(int a, int b, int c) {
		return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		return ((a < b && b < c) || (equalOk && a <= b && b <= c));
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		return ((a < b && b < c) || (bOk && b < c));
	}

	public String fizzString2(int n) {
		boolean byThree = (n % 3 == 0);
		boolean byFive = (n % 5 == 0);

		if (byThree && byFive)
			return "FizzBuzz";
		if (byThree)
			return "Fizz";
		if (byFive)
			return "Buzz";
		return n + "!";
	}

	public String fizzString(String str) {
		if (str.charAt(0) == 'f') {
			if (str.charAt(str.length() - 1) == 'b') {
				return "FizzBuzz";
			} else {
				return "Fizz";
			}
		} else {
			if (str.charAt(str.length() - 1) == 'b') {
				return "Buzz";
			} else {
				return str;
			}
		}
	}

	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5) {
			return 0;
		} else if (tea >= 2 * candy || candy >= 2 * tea) {
			return 2;
		}
		return 1;
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		} else if (isMorning && !isMom) {
			return false;
		} else {
			return true;
		}
	}

	public int teenSum(int a, int b) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return 19;
		} else {
			return a + b;
		}
	}

	public boolean nearTen(int num) {
		Integer mod = num % 10;
		return ((mod >= 0 && mod <= 2) || (mod >= 8 && mod <= 10));
	}

	public boolean less20(int n) {
		Integer mod = n % 20;
		return (mod == 18 || mod == 19);
	}

	public boolean old35(int n) {
		Integer mod3 = n % 3;
		Integer mod5 = n % 5;

		return ((mod3 == 0 && mod5 != 0) || (mod3 != 0 && mod5 == 0));
	}

	public boolean more20(int n) {
		Integer mod = n % 20;
		return (mod == 1 || mod == 2);
	}

	public boolean specialEleven(int n) {
		Integer mod = n % 11;
		return (mod == 0 || mod == 1);
	}

	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode == false) {
			if (n >= 1 && n <= 10) {
				return true;
			} else {
				return false;
			}
		} else {
			if (n <= 1 && n >= 10) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean love6(int a, int b) {
		Integer sum = a + b;
		Integer dif = Math.abs(a - b);

		return (a == 6 || b == 6 || sum == 6 || dif == 6);
	}

	public String alarmClock(int day, boolean vacation) {
		if (vacation == false) {
			if (day >= 0 && day <= 5) {
				return "7:0";
			} else {
				return "10:00";
			}
		} else {
			if (day >= 0 && day <= 5) {
				return "10:0";
			} else {
				return "off";
			}
		}
	}

	public int sortaSum(int a, int b) {
		Integer sum = a + b;

		if (sum >= 10 && sum <= 19) {
			return 20;
		} else {
			return sum;
		}
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday)
			speed = speed - 5;

		if (speed <= 60) {
			return 0;
		} else if (speed > 60 && speed <= 80) {
			return 1;
		} else {
			return 2;
		}
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (temp >= 60 && temp <= 90) {
			return true;
		} else if (isSummer == true && (temp > 90 && temp <= 100)) {
			return true;
		} else {
			return false;
		}
	}

	public int dateFashion(int you, int date) {
		if ((you >= 8 || date >= 8) && !(you <= 2 || date <= 2)) {
			return 2;
		} else if (you <= 2 || date <= 2) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			return (cigars >= 40);
		} else {
			return (cigars >= 40 && cigars <= 60);
		}
	}

	public static void main(String arg[]) {
		Logic1 logic = new Logic1();
		System.out.println(logic.makeChocolate(6,2,7));
	}
}
