package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.MainMenuController;

public class MainMenuView extends View{

    private MainMenuController controller;
    public MainMenuView() {
        controller = new MainMenuController();
    }
    @Override
    public void Show() {
        System.out.println(controller.getMessage());
        PrintOptions(controller.getOptions());
    }
}
