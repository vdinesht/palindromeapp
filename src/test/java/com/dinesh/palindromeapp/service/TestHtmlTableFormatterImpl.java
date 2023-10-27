package com.dinesh.palindromeapp.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHtmlTableFormatterImpl {

    @Test
    void testsimpleHtmlTableOutput(){
        List<String> header = new ArrayList<>();

        header.add("Company");
        header.add("Contact");
        header.add("Country");

        List<String> row1 = new ArrayList<>();
        row1.add("Caterpillar");
        row1.add("Dinesh");
        row1.add("India");

        List<String> row2 = new ArrayList<>();
        row2.add("Walmart");
        row2.add("John");
        row2.add("USA");

        List<List<String>> body = new ArrayList<>();
        body.add(row1);
        body.add(row2);

        HtmlTableFormatter htmlTableFormatter = new HtmlTableFormatterImpl();
        String htmlOutput = htmlTableFormatter.getHtmlOutput("",header, body);
        System.out.println(htmlOutput);

        assertTrue(htmlOutput.contains("<table "));
        assertTrue(htmlOutput.contains("<th>Company</th>"));
        assertTrue(htmlOutput.contains("<td>USA</td>"));
        assertTrue(htmlOutput.contains("</table>"));

    }


}
