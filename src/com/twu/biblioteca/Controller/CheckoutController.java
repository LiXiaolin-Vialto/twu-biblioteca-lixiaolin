package com.twu.biblioteca.Controller;

public class CheckoutController extends BaseController{
    private String message;
    private String[] options;

    public CheckoutController() {
        message = "Checkout success!";
        options = new String[]{"exit", "go back"};
    }

    public String getMessage() {
        return message;
    }

    public String[] getOptions() {
        return options;
    }


}
