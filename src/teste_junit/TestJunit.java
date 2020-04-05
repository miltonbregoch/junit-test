package teste_junit;
import org.junit.Assert;
import org.junit.Test;

public class TestJunit {

	@Test
	public void testeConfiguracao(){
		Assert.assertEquals(2, (1+1), 0);
	}
}
