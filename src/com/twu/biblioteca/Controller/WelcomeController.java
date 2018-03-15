package com.twu.biblioteca.Controller;

public class WelcomeController extends BaseController {
    private String message;
    private String[] options;


    public WelcomeController() {
        message = "Welcome to Library";
        options = new String[]{"exit", "MainMenu"};
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

}
