package com.twu.biblioteca.Controller;

public class MainMenuController extends BaseController {
    private String message;
    private String[] options;


    public MainMenuController() {
        message = "Main Menu";
        options = new String[]{"exit", "go back", "bookList"};
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
