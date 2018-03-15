package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.CheckoutController;

public class CheckedView extends View{
    CheckoutController controller;
    public CheckedView() {
        controller = new CheckoutController();
        this.message = controller.getMessage();
        this.options = controller.getOptions();
    }
    @Override
    public void Show() {
        System.out.println(this.message);
        PrintOptions(this.options);
    }
}
