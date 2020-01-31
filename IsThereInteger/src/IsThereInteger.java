
public class IsThereInteger {
	public static Boolean isDigit(String sample) {
		if (sample == null || sample.isEmpty()) {
			return false;
		}
		char[] chars = sample.toCharArray();
		for (char ch : chars) {
			int ascii = (int) ch;
			if (ascii >= 48 && ascii <= 57) {
				return true;
			}
		}
		return false;
	}
}
