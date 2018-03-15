package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.WelcomeController;

public class WelcomeView extends View{
    private WelcomeController controller;
    public WelcomeView() {
        controller = new WelcomeController();
        this.message = controller.getMessage();
        this.options = controller.getOptions();
    }

    @Override
    public void Show() {
        System.out.println(this.message);
        PrintOptions(this.options);
    }
}
