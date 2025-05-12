package com.example;

import java.util.ServiceLoader;

public class TextEditor {

    public static void main(String[] args) {
        ServiceLoader<TextFormatterPlugin> plugins =
                ServiceLoader.load(TextFormatterPlugin.class);

        String text = "Hello, Plugin World!";
        for (TextFormatterPlugin plugin : plugins) {
            System.out.println(plugin.format(text));
        }
    }
}
