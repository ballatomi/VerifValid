package Test;

import org.junit.Test;

import analyzer.FakeFileExtetntioManager;
import analyzer.LogAnalyzer;
import junit.framework.Assert;

public class LogAnalyzerFakeTest {

	private FakeFileExtetntioManager fake = new FakeFileExtetntioManager();
	private LogAnalyzer log = new LogAnalyzer();

	public LogAnalyzerFakeTest() {
	}

	@Test
	public void FakeFEM_withConstructor_returnTrue() {
		fake = new FakeFileExtetntioManager();
		fake.setWillReturn(true);
		log = new LogAnalyzer(fake);
		Assert.assertEquals(log.isValidLogFileName(".slr"), true);
	}

	@Test
	public void FakeFEM_withSetter_returnsFalse() {
		fake.setWillReturn(false);
		log.setFileExtentioManager(fake);
		Assert.assertEquals(log.isValidLogFileName(".slr"), false);
	}

}
