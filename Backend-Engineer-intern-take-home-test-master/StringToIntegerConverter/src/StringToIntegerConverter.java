
public class StringToIntegerConverter {
	public static int stringToint(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}
		int i = 0, result = 0;
		boolean isNegative = false;
		int len = str.length();
		if (str.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		while (i < len) {
			result *= 10;
			result += (str.charAt(i++) - '0');
		}
		if (isNegative)
			result = -result;
		return result;
	}
}
