package dad.codesignal;

public class TheJourneyBegins {

	int add(int param1, int param2) {
		return param1 + param2;
	}

	int centuryFromYear(int year) {
		return (int) Math.floor(year / 100.0) + ((year % 100.0 == 0) ? 0 : 1);
	}

	boolean checkPalindrome(String inputString) {
		
		for (int i = 0,	j = inputString.length() - 1; i <= j; i++,j--) {
				
			if (inputString.charAt(i) != inputString.charAt(j)) {
				return false;

			}

		}
		return true;
	}
}