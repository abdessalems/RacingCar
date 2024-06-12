package tddmicroexercises.textconvertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class HtmlTextConverterTest {

	@Test
	public void testGetFilename() {
		HtmlTextConverter converter = new HtmlTextConverter("foo");
		assertEquals("foo", converter.getFilename());
	}
}
