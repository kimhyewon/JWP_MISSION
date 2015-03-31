package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void test() {
		HelloWorld hw = new HelloWorld();
		assertEquals("Hello World", hw.message());
	}
}
