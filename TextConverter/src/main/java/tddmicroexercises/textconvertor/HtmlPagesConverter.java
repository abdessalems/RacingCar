package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.text.StringEscapeUtils;

public class HtmlPagesConverter {

    private String filename;
    private List<Integer> breaks = new ArrayList<Integer>();

    public HtmlPagesConverter(String filename) throws IOException {
        this.filename = filename;

        this.breaks.add(0);
        try (BufferedReader reader = new BufferedReader(new FileReader(this.filename))) {
            int cumulativeCharCount = 0;
            String line = reader.readLine();
            while (line != null)
            {
                cumulativeCharCount += line.length() + 1; // add one for the newline
                if (line.contains("PAGE_BREAK")) {
                    int page_break_position = cumulativeCharCount;
                    breaks.add(page_break_position);
                }
                line = reader.readLine();
            }
        }
    }

    public String getHtmlPage(int page) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.filename))) {
            reader.skip(breaks.get(page));
            StringBuilder htmlPage = new StringBuilder();
            String line = reader.readLine();
            while (line != null)
            {
                if (line.contains("PAGE_BREAK")) {
                    break;
                }
                htmlPage.append(StringEscapeUtils.escapeHtml(line));
                htmlPage.append("<br />");

                line = reader.readLine();
            }
            return htmlPage.toString();
        }
    }

    public String getFilename() {
        return this.filename;
    }
}
