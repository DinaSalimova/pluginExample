package com.example;

import java.util.ServiceLoader;

public class TextEditor {

    public static void main(String[] args) {
        ServiceLoader<TextFormatterPlugin> plugins =
                ServiceLoader.load(TextFormatterPlugin.class);

        String text = "Hello, It's learning example!";
        for (TextFormatterPlugin plugin : plugins) {
            System.out.println(plugin.format(text));
        }
    }
}
