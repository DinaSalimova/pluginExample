package com.example;

public class MarkdownFormatter  implements TextFormatterPlugin {
    @Override
    public String format(String text) {
        return "**" + text + "** (Markdown)";
    }
}