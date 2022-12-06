package testCases;


public class randomUtil {

	static String AlphaNumericStr ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&@?<>~!%#";
	static String Sc="$&@?<>~!%#";

	public static   String getString(int strLen, boolean sc) {
		StringBuilder s = new StringBuilder(strLen);
		if (sc==false){

			for ( int i=0; i<strLen; i++) {

				int ch = (int)(AlphaNumericStr.length() * Math.random());

				s.append(AlphaNumericStr.charAt(ch)).toString();

			}

		}

		if (sc==true){

			for ( int i=0; i<strLen-1; i++) {

				int ch = (int)(AlphaNumericStr.length() * Math.random());

				s.append(AlphaNumericStr.charAt(ch)).toString();

			}
			int spCh = (int)(Sc.length() * Math.random());
			s.append(Sc.charAt(spCh)).toString();


		}

		return s.toString();







	}
}




