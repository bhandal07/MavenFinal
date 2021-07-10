package PageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testprimenumber {
	
@Test
public void positivetest() {
	Assert.assertTrue(primenumbercheck.isPrime(13));
}


@Test
public void Negativetest() {
	Assert.assertFalse(primenumbercheck.isPrime(10));
}
	

}
