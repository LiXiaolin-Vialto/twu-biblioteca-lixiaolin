package com.twu.biblioteca.View;

public abstract class View {
    String message;
    String[] options;
    public abstract void Show();
    void PrintOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.print(i + "."+options[i]+" ");
        }
        System.out.println();
    }
}
