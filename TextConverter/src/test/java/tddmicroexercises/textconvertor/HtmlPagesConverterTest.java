package tddmicroexercises.textconvertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class HtmlPagesConverterTest {

    @Test
    public void testGetFilename() throws IOException {
        HtmlPagesConverter converter = new HtmlPagesConverter("foo");
        assertEquals("foo", converter.getFilename());
    }
}
