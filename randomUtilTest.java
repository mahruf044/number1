package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class randomUtilTest {
	//Test 1
	@Test
	public  void t1() {
		int length=10;
		int count=0;
		boolean sc=true;
		String myString=randomUtil.getString(length, sc);
		boolean scFromString;
		for(int i=0;i<length;i++) {
			if (!Character.isDigit(myString.charAt(i))
					&& !Character.isLetter(myString.charAt(i))
					&& !Character.isWhitespace(myString.charAt(i))) {
				// Incrementing the countr for spl
				// characters by unity
				count++;
			}
		}

		if(count>0) {
			scFromString=true;
		}
		else {
			scFromString= false;
		}

		Assert.assertTrue(scFromString,"String does not have special Character");


	}

	@Test
	//test 2
	public void t2() {

		int length=10;
		String myString=randomUtil.getString(length,false);
		boolean positiveString;
		if(myString.length()>0) {
			positiveString=true;


		}
		else {
			positiveString=false;
		}

		Assert.assertTrue(positiveString,"String is not valid");


	}


	// test 3
	@Test(expectedExceptions = { NegativeArraySizeException.class }, expectedExceptionsMessageRegExp = "-5")
	public void t3() {
		int length=-5;
			randomUtil.getString(length,true);



	}



}


